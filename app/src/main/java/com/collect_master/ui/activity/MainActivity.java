package com.collect_master.ui.activity;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.collect_master.R;
import com.collect_master.app.tools.GPSUtils;
import com.collect_master.app.weight.APSTSViewPager;
import com.collect_master.app.weight.AdvancedPagerSlidingTabStrip;
import com.collect_master.contract.MvpPresenter;
import com.collect_master.model.MainModel;
import com.collect_master.presenter.MainPresenter;
import com.collect_master.ui.adapter.TabsAdapter;
import com.collect_master.ui.viewer.MainVIew;

import butterknife.BindView;

public class MainActivity extends MvpActivity implements MainVIew {


    @BindView(R.id.tabs)
    AdvancedPagerSlidingTabStrip tabs;

    @BindView(R.id.iv_Btn)
    ImageView ivBtn;

    @BindView(R.id.viewPager)
    APSTSViewPager viewPager;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private BottomSheetDialog sheet;

    @Override
    protected MvpPresenter createPresenter() {

        return new MainPresenter(new MainModel());

    }

    @Override
    public void bindView(Bundle savedInstanceState) {
        setSupportActionBar(toolbar);
        viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager(), this));
        tabs.setViewPager(viewPager);
        sheet = new BottomSheetDialog(this);

        ivBtn.setOnClickListener(v ->
                showExtra()
        );
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!GPSUtils.isOpenGPSsetting(this)) GPSUtils.openGPSSettings(this);
    }

    @Override
    public void showExtra() {
        sheet.setContentView(R.layout.mainact_item_dialog);
        sheet.show();
    }

    @Override
    public void hideExtra() {
        sheet.dismiss();
    }
}
