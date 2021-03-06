package com.fragmentdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    //声明控件
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    //设置监听
    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    //初始化控件
    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, SampleFragmentActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this, DynamicAddFragmentActivity.class));
                break;
            default:
                break;
        }
    }

}
