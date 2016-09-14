package com.t2_1_http;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.t2_1_http.adapter.NewsPagerAdapter;
import com.t2_1_http.fragment.NewsFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabs;

    private ViewPager vp;

    ArrayList<Fragment> fragments = new ArrayList<>();
    String[] titles = {"热点", "车", "搞笑", "图片", "娱乐", "电影", "健康", "美食"};
    private NewsPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//初始化控件
        initData();//初始化数据
        initViewPager(fragments);
    }


    private void initView() {
        tabs = (TabLayout) findViewById(R.id.news_tabs);
        vp = (ViewPager) findViewById(R.id.news_viewpager);
    }

    private void initData() {
        int index = 1;
        for (String area :
                titles) {
            fragments.add(NewsFragment.newInstance(area, index));
            index++;
        }
    }

    private void initViewPager(ArrayList<Fragment> fragments) {
        pagerAdapter = new NewsPagerAdapter(getSupportFragmentManager(), fragments, titles);
        vp.setAdapter(pagerAdapter);
        tabs.setupWithViewPager(vp);
    }

}
