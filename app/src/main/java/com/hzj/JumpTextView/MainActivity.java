package com.hzj.JumpTextView;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
   // TabLayout mTabLayout;
    MainAdapter adapter;

    String[] tabTitle={"实例1","实例2","实例3","实例4"};
    List<Fragment> frameLayoutList=new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.vp_simple);
        //mTabLayout=findViewById(R.id.tab_simple);
        frameLayoutList.add(new SimpleFragment1());
        frameLayoutList.add(new SimpleFragment2());
        frameLayoutList.add(new SimpleFragment3());
        frameLayoutList.add(new SimpleFragment4());
        adapter=new MainAdapter(getSupportFragmentManager(),frameLayoutList);
        viewPager.setAdapter(adapter);

//        mTabLayout.addTab(mTabLayout.newTab().setText(tabTitle[0]));
//        mTabLayout.addTab(mTabLayout.newTab().setText(tabTitle[1]));
//        mTabLayout.addTab(mTabLayout.newTab().setText(tabTitle[2]));
//        mTabLayout.addTab(mTabLayout.newTab().setText(tabTitle[3]));
//        mTabLayout.setupWithViewPager(viewPager);
//        mTabLayout.getTabAt(0).setText(tabTitle[0]);
//        mTabLayout.getTabAt(1).setText(tabTitle[1]);
//        mTabLayout.getTabAt(2).setText(tabTitle[2]);
//        mTabLayout.getTabAt(3).setText(tabTitle[3]);
    }
}
