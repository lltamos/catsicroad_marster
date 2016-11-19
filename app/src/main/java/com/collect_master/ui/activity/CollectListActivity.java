package com.collect_master.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.collect_master.R;
import com.collect_master.app.Constants;
import com.collect_master.app.tools.ActionBarManager;
import com.collect_master.app.weight.SearchBar;
import com.collect_master.app.weight.SearchListView;
import com.collect_master.contract.BaseActivity;

import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;

public class CollectListActivity extends BaseActivity {
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.listview)
    SearchListView mListView;

    @Override
    public void bindView(Bundle savedInstanceState) {
        setSupportActionBar(toolbar);
        ActionBarManager.initBackTitle(getSupportActionBar());
        String s = getIntent().getStringExtra(Constants.SELECT_COLLECT_LABE);
        title.setText(s);

        SearchBar searchBar = new SearchBar(this);
        mListView.addHeaderView(searchBar);
        View list_item=View.inflate(this,R.layout.list_item_1,null);
        mListView.addHeaderView(list_item);
        mListView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, position + "", Toast.LENGTH_SHORT).show();
        });

        List list = new ArrayList();
        for (int x = 0; x < 100; x++) {
            list.add(x + "");
        }

        ArrayAdapter<String> myArrayAdapter =
                new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);

        mListView.setAdapter(myArrayAdapter);
        mListView.setEnableRefresh(false);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_collect_list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add, menu);
        return true;
    }


}
