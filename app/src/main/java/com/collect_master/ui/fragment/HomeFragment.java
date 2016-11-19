package com.collect_master.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.collect_master.R;
import com.collect_master.app.tools.CommonUtils;
import com.collect_master.contract.BaseFragment;
import com.collect_master.ui.activity.FtpManagerActivity;
import com.collect_master.ui.activity.UncapMapActivity;

import butterknife.OnClick;

/**
 * @author Litao-pc on 2016/10/27.
 *         ~
 */

public class HomeFragment extends BaseFragment {


    @Override
    public void bindView(Bundle savedInstanceState) {

    }

    @Override
    public int getLayoutResId() {

        return R.layout.fragmeng_home;
    }



    @OnClick({R.id.atv1, R.id.atv2, R.id.atv3, R.id.atv4,R.id.act_export})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.atv1:
                CommonUtils.toActivity(mContext,new Intent(mContext, UncapMapActivity.class));
                break;
            case R.id.atv2:
                break;
            case R.id.atv3:
                break;
            case R.id.atv4:
                break;
            case R.id.act_export:
                CommonUtils.toActivity(mContext,new Intent(mContext, FtpManagerActivity.class));
                break;
        }
    }
}
