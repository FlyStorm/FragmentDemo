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
 * 创建时间   2017/8/28 0028 18:33
 * 作用	      ${TODO}
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class RightFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * 通过LayoutInflater的inflate()方法将left_fragment布局动态加载进来
         */
        View view=inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }
}
