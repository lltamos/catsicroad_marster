package com.collect_master.ui.fragment;

import android.os.Bundle;
import android.view.View;

import com.collect_master.contract.BaseFragment;
import com.collect_master.contract.MvpPresenter;
import com.collect_master.contract.MvpView;


/**
 * Created by Litao-pc on 2016/9/7.
 */
public abstract class MvpFragment<P extends MvpPresenter> extends BaseFragment implements MvpView {
    protected P presenter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null) {
            presenter = createPresenter();
        }
        presenter.attachView(this);

    }

    protected abstract P createPresenter();


    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView(false);
    }


    @Override
    public View getRootView() {
        return mRootView;
    }


}
