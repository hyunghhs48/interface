package com.han.total.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.han.total.Activity.MainActivity;
import com.han.total.Adapter.TemplateAdapter;
import com.han.total.R;

import java.util.ArrayList;

public class fragment_tab3 extends Fragment  implements TemplateAdapter.AdapterCallback{


    private Context mContext;

    @BindView(R.id.template_recycler)
    RecyclerView template_recycler;

    public fragment_tab3(Context context) {
        mContext = context;
        // Required empty public constructor
    }

    public fragment_tab3() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tab3, container, false);
        ButterKnife.bind(this, view);
        InitRecylerView();
        return view;
        //return inflater.inflate(R.layout.fragment_tab0, container, false);
    }


    //RecyclerView
    @Override
    public void DoSomeThing(int posionion){
        //((MainActivity)getActivity()).FragmentSwitch(3,mContext);
        //Toast.makeText(mContext,"posion: "+posionion,Toast.LENGTH_SHORT).show();
    }


    //RecyclerView
    // 리스트뷰 초기화
    public void InitRecylerView(){

        template_recycler.setVisibility(View.VISIBLE);
        //fr_fragment.setVisibility(View.GONE);

        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<4; i++) {
            list.add(String.format("TEXT %d", i)) ;
        }
        template_recycler.setLayoutManager(new LinearLayoutManager(mContext)) ;
        TemplateAdapter adapter = new TemplateAdapter(list,this) ;
        template_recycler.setAdapter(adapter) ;
    }

}