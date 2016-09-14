package com.t2_1_http.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.t2_1_http.R;

/**
 * Created by xsl on 2016/9/14.
 */
public class NewsFragment extends Fragment {
    public static final String BUNDLE_TITLE = "title";
    public static final String BUNDLE_INDEX = "index";

    public static NewsFragment newInstance(String title, int index) {
        NewsFragment fragment = new NewsFragment();
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_TITLE, title);
        bundle.putInt(BUNDLE_INDEX, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_news, null);
    }

}
