package com.fragmentdemo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.fragmentdemo.fragment.AnotherRightFragment;

/**
 * 这里仅需要在布局里面放入一个碎片，因此非常适合使用FrameLayout
 * 在代码中替换FrameLayout里的内容，从而实现动态添加碎片的功能。
 */
public class DynamicAddFragmentActivity extends FragmentActivity {
    //声明控件
    private Button btn_addfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_add_fragment);

        //实例化
        btn_addfragment= (Button) findViewById(R.id.btn_addfragment);

        //设置点击事件
        btn_addfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建待添加碎片的实例
                AnotherRightFragment anotherRightFragment=new AnotherRightFragment();
                //获取fragmentManager
                FragmentManager fragmentManager=getSupportFragmentManager();
//                FragmentManager fragmentManager=getFragmentManager();
                //开启一个事务
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.right_layout, anotherRightFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
