package com.collect_master.ui.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.collect_master.R;
import com.collect_master.app.weight.CustomTextView;
import com.collect_master.contract.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

import static com.collect_master.R.id.ct_roadAttr;

/**
 * @author Litao-pc on 2016/10/27.
 *         ~
 */

public class AttrFragment extends BaseFragment {


    @BindView(ct_roadAttr)
    CustomTextView ctRoadAttr;
    @BindView(R.id.ct_workAttr)
    CustomTextView ctWorkAttr;

    @Override
    public void bindView(Bundle savedInstanceState) {
        toggleColor(true);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_attr;
    }




    @OnClick({R.id.ct_roadAttr, R.id.ct_workAttr})
    public void onClick(View view) {
        switch (view.getId()) {
            case ct_roadAttr:
                toggleColor(true);
                break;
            case R.id.ct_workAttr:
                toggleColor(false);
                break;
        }
    }

   void toggleColor(boolean tag){
       if (tag){
           ctWorkAttr.setSolidColor(Color.parseColor("#adadad"));
           ctRoadAttr.setSolidColor(Color.parseColor("#ffffff"));
       }else {
           ctRoadAttr.setSolidColor(Color.parseColor("#adadad"));
           ctWorkAttr.setSolidColor(Color.parseColor("#ffffff"));
       }
   }
}
