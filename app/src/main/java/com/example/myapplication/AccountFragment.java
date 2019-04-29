package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import java.util.ArrayList;


public class AccountFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account,container,false);
        ImageView imageView =(ImageView)view.findViewById(R.id.img_user);
        imageView.setImageResource(R.drawable.ic_account_box_black_24dp);
        TabHost tabhost = (TabHost)view.findViewById(R.id.tabhost);
        tabhost.setup();
        tabhost.addTab(tabhost.newTabSpec("tab1").setIndicator("已發布食譜").setContent(R.id.tab1));
        tabhost.addTab(tabhost.newTabSpec("tab2").setIndicator("帳號資訊").setContent(R.id.tab2));
        tabhost.setCurrentTab(0);






        return view;
    }

}
