package com.collect_master.app.weight;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.collect_master.R;
import com.collect_master.app.Constants;
import com.collect_master.app.tools.AppManager;
import com.collect_master.app.tools.CommonUtils;
import com.collect_master.ui.activity.CollectListActivity;
import com.collect_master.ui.activity.MainActivity;

/**
 * @param
 * @author Litao-pc on 2016/11/16.
 *         ~
 */

public class LableGradView extends GridView {

    private String[] mData;
    private Context context;
    private BaseAdapter adapter;
    private int datasId;

    public LableGradView(Context context) {
        this(context, null);
    }


    public LableGradView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.lableGride);
            try {
                datasId = a.getResourceId(R.styleable.lableGride_datas, 0);

            } finally {

                a.recycle();
            }
        }
        this.context = context;
        mData = context.getResources().getStringArray(datasId);
        init();

    }

    private void init() {
//        setLayoutAnimation(getAnimationController());

        adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return mData.length;
            }

            @Override
            public Object getItem(int i) {
                return mData[i];
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                CustomTextView lable;
                if (view == null) {
                    view = View.inflate(context, R.layout.label, null);
                    lable = (CustomTextView) view.findViewById(R.id.ctv_lable);
                    view.setTag(lable);
                } else {
                    lable = (CustomTextView) view.getTag();
                }

                lable.setOnClickListener(view1 -> {
                    ((MainActivity) AppManager.getAppManager().currentActivity()).hideExtra();
                    Intent intent = new Intent(AppManager.getAppManager().currentActivity(), CollectListActivity.class);
                    int value = datasId == R.array.m_line_label ? 0 : 1;
                    intent.putExtra(Constants.SELECT_COLLECT_TAG, value);
                    intent.putExtra(Constants.SELECT_COLLECT_LABE, mData[i]);
                    CommonUtils.toActivity(AppManager.getAppManager().currentActivity(), intent);
                });
                lable.setText(mData[i]);
                return view;
            }
        };
        setAdapter(adapter);
    }


    protected LayoutAnimationController getAnimationController() {
        int duration = 60;
        AnimationSet set = new AnimationSet(true);
        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(duration);
        set.addAnimation(animation);

        animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                -1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        animation.setDuration(duration);
        set.addAnimation(animation);

        LayoutAnimationController controller = new LayoutAnimationController(set, 0.5f);
        controller.setOrder(LayoutAnimationController.ORDER_NORMAL);
        return controller;
    }


    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(
                Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
