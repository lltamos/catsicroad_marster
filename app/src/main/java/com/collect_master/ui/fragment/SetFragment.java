package com.collect_master.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.SwitchCompat;

import com.collect_master.R;
import com.collect_master.app.Constants;
import com.collect_master.app.tools.CommonUtils;
import com.collect_master.app.tools.PreferencesUtils;
import com.collect_master.contract.BaseFragment;
import com.collect_master.ui.activity.SettingActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author Litao-pc on 2016/10/27.
 *         ~
 */

public class SetFragment extends BaseFragment {
    @BindView(R.id.tv_collect)
    AppCompatTextView tv_collect;
    @BindView(R.id.sc_wake_lock)
    SwitchCompat scWakeLock;


    @Override
    public void bindView(Bundle savedInstanceState) {

        tv_collect.setOnClickListener(v -> {
            CommonUtils.toActivity(mContext, new Intent(mContext, SettingActivity.class));
        });
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_set;
    }


    @OnClick(R.id.sc_wake_lock)
    public void onClick() {

        boolean scWakeLockChecked = scWakeLock.isChecked();

        if (PreferencesUtils.putBoolean(mContext, Constants.SC_WAKE_LOCK, scWakeLockChecked)) {
            if (scWakeLockChecked) {
                CommonUtils.toggleWalkLook(mContext, true);
            } else {
                CommonUtils.toggleWalkLook(mContext, false);
            }
        }
    }


}
