package com.fragmentdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentdemo.activity.R;


/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/29 0029 6:36
 * 作用	      ${TODO}
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class AnotherRightFragment extends Fragment {
    //当视图被创建的时候调用这个方法,负责UI的创建
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.another_right_fragment,container,false);
        return view;
    }
}
