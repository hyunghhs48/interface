package com.han.total.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.han.total.Adapter.TemplateAdapter;
import com.han.total.R;

import java.util.ArrayList;

public class fragment_tab1 extends Fragment{



    private Context mContext;

    @BindView(R.id.ll_weather)
    LinearLayout ll_weather;
    @BindView(R.id.ll_type)
    LinearLayout ll_type;

    @BindView(R.id.tv_title_type)
    TextView tv_title_type;
    @BindView(R.id.tv_title_weather)
    TextView tv_title_weather;

    public fragment_tab1(Context context) {
        mContext = context;
        // Required empty public constructor
    }

    public fragment_tab1() {
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
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    // 카메라 띄우는 함수
    @OnClick(R.id.iv_camera) void ClickCamera(){
        Camera();
    }
    // 카메라 띄우는 함수
    void Camera(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 101);
    }

    //클릭리스너 ,
    @OnClick({R.id.ll_click_type,R.id.ll_click_weather}) void Click(View v){
        if(v.getId()==R.id.ll_click_type){
            Clear();
            ll_type.setVisibility(View.VISIBLE);
        }else if(v.getId()==R.id.ll_click_weather){
            Clear();
            ll_weather.setVisibility(View.VISIBLE);
        }
    }

    // 아우터, 상의 , 하의 리스트
    @OnClick({R.id.tv_outer,R.id.tv_top,R.id.tv_bottom,R.id.tv_spring,R.id.tv_summer,R.id.tv_winter}) void Click1(View v){
        if(v.getId()==R.id.tv_outer){
            Clear();
            tv_title_type.setText("아우터");
        }else if(v.getId()==R.id.tv_top){
            Clear();
            tv_title_type.setText("상의");
        }else if(v.getId()==R.id.tv_bottom){
            Clear();
            tv_title_type.setText("하의");
        }else if(v.getId()==R.id.tv_spring){
            Clear();
            tv_title_weather.setText("봄 / 가을");
        }else if(v.getId()==R.id.tv_summer){
            Clear();
            tv_title_weather.setText("여름");
        }else if(v.getId()==R.id.tv_winter){
            Clear();
            tv_title_weather.setText("겨울");
        }
    }

    void Clear(){
        ll_type.setVisibility(View.GONE);
        ll_weather.setVisibility(View.GONE);
    }



}