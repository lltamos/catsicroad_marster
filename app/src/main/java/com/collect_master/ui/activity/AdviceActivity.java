package com.collect_master.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.collect_master.R;
import com.collect_master.app.tools.ActionBarManager;
import com.collect_master.contract.BaseActivity;

import butterknife.BindView;

public class AdviceActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title)
    TextView title;


    @Override
    public void bindView(Bundle savedInstanceState) {
        setSupportActionBar(toolbar);
        ActionBarManager.initBackTitle(getSupportActionBar());
        title.setText("用户反馈");
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_advice;
    }
}
