package com.collect_master.ui.fragment;

import android.os.Bundle;

import com.collect_master.R;
import com.collect_master.model.LayerModel;
import com.collect_master.presenter.LayerPresenter;
import com.collect_master.ui.viewer.LayerView;
import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;
import com.esri.android.runtime.ArcGISRuntime;

import butterknife.BindString;
import butterknife.BindView;

/**
 * @param
 * @author Litao-pc on 2016/10/27.
 *         ~
 */

public class LayerFragment extends MvpFragment<LayerPresenter> implements LayerView {
    @BindString(R.string.basemap_url)
    String BASEURL;
    @BindView(R.id.map)
    MapView mMap;

    @Override
    protected LayerPresenter createPresenter() {
        return new LayerPresenter(new LayerModel());
    }

    @Override
    public void bindView(Bundle savedInstanceState) {
        ArcGISRuntime.setClientId("1eFHW78avlnRUPHm");
        ArcGISTiledMapServiceLayer dynamicLayout = new ArcGISTiledMapServiceLayer(BASEURL);
        mMap.addLayer(dynamicLayout);

//        btn.setOnClickListener(view -> {
//            SweetAlertDialog ss = new SweetAlertDialog(getContext(), SweetAlertDialog.NORMAL_TYPE)
//                    .setTitleText("Are you sure?")
//                    .setContentText("Won't be able to recover this file!")
//                    .setConfirmText("Yes,delete it!")
//                    .setConfirmClickListener(sDialog -> sDialog
//                            .setTitleText("Deleted!")
//                            .setContentText("Your imaginary f")
//                            .setConfirmText("OK")
//                            .setConfirmClickListener(null)
//                            .changeAlertType(SweetAlertDialog.SUCCESS_TYPE));
//
//            ProgressHelper p = ss.getProgressHelper();
//            p.setRimWidth(1000);
//            p.setInstantProgress(10f);
//            p.setBarWidth(1000);
//            p.setBarColor(Color.RED);
//            ss.show();
//        });
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_layer;
    }
}
