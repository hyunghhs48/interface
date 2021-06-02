package com.han.total.Activity;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.han.total.R;

public class SelectClothsActivity extends AppCompatActivity {

    Context mContext;
    @BindView(R.id.tv_weather)
    TextView tv_weather;
    @BindView(R.id.tv_type)
    TextView tv_type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_cloths);
        mContext = this;
        ButterKnife.bind(this);

        // 인텐트 파라미터 받는 과정
        Intent intent = getIntent();
        String weather =  intent.getStringExtra("weather");
        String type =  intent.getStringExtra("type");

        tv_weather.setText(weather);
        tv_type.setText(type);
    }

    // 이메일 띄우기
    @OnClick({R.id.fl_fragment1}) void Click(){
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setType("plain/text");
        String[] address = {"email@address.com"};
        email.putExtra(Intent.EXTRA_EMAIL, address);
        email.putExtra(Intent.EXTRA_SUBJECT, "test@test");
        email.putExtra(Intent.EXTRA_TEXT, "내용 미리보기 (미리적을 수 있음)");
        startActivity(email);
    }


}