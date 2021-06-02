package com.han.total.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.han.total.R;
import com.han.total.Util.Global;
import com.han.total.Util.Logg;
import java.util.ArrayList;

public class TemplateAdapter extends RecyclerView.Adapter<TemplateAdapter.ViewHolder> {

    //
    public interface AdapterCallback {
        void DoSomeThing(int position);
    }

    private ArrayList<String> mData = null ;
    private AdapterCallback mAdapterCallback;

    public TemplateAdapter(ArrayList<String> list,TemplateAdapter.AdapterCallback AdapterCallback) {
        mData = list ;
        mAdapterCallback = AdapterCallback;
    }


    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_img0 ;
        ImageView iv_img1;
        ImageView iv_img2;
        ViewHolder(View itemView) {
            super(itemView) ;
            iv_img0 = itemView.findViewById(R.id.iv_img0) ;
            iv_img1 = itemView.findViewById(R.id.iv_img1);
            iv_img2 = itemView.findViewById(R.id.iv_img2);

            iv_img0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mAdapterCallback != null) {
                        Logg.e(Global.USER_HTJ,"mSelectedIndex: "+getLayoutPosition());
                        mAdapterCallback.DoSomeThing(getLayoutPosition());
                    }
                }
            });

            iv_img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mAdapterCallback != null) {
                        Logg.e(Global.USER_HTJ,"mSelectedIndex: "+getLayoutPosition());
                        mAdapterCallback.DoSomeThing(getLayoutPosition());
                    }
                }
            });

            iv_img2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mAdapterCallback != null) {
                        Logg.e(Global.USER_HTJ,"mSelectedIndex: "+getLayoutPosition());
                        mAdapterCallback.DoSomeThing(getLayoutPosition());
                    }
                }
            });
        }

    }

    @Override
    public TemplateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;
        View view = inflater.inflate(R.layout.template_adapter_item, parent, false) ;
        TemplateAdapter.ViewHolder vh = new TemplateAdapter.ViewHolder(view) ;
        return vh ;
    }

    @Override
    public void onBindViewHolder(TemplateAdapter.ViewHolder holder, int position) {
        String text = mData.get(position) ;
        //holder.textView1.setText(text) ;
    }

    @Override
    public int getItemCount() {
        return mData.size() ;
    }

}