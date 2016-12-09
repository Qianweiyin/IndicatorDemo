package com.chinavalley.indicatorviewpager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/9.
 */

@SuppressLint("ValidFragment")
public class MainFragment extends Fragment {
    private int newsType = 0;

    public MainFragment(int newsType) {
        this.newsType = newsType;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_item_fragment_main, null);

        TextView tip = (TextView) view.findViewById(R.id.id_tip);
        tip.setText(TabAdapter.TITLES[newsType]);

        return view;
    }
}
