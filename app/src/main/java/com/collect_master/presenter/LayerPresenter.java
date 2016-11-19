package com.collect_master.presenter;

import com.collect_master.contract.MvpPresenter;
import com.collect_master.model.LayerModel;
import com.collect_master.ui.viewer.LayerView;

/**
 * @param
 * @author Litao-pc on 2016/11/1.
 *         ~
 */
public class LayerPresenter extends MvpPresenter<LayerView, LayerModel> {
    public LayerPresenter(LayerModel mModel) {
        super(mModel);
    }
}
