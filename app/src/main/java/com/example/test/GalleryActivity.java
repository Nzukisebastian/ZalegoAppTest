package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    private GridLayoutManager layoutManager;
    List<Details> mListitems;
    ProgressBar progressBar;
    public GalleryActivity(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mRecyclerview=(RecyclerView)findViewById(R.id.recyclerTemp);
        progressBar=(ProgressBar)findViewById(R.id.pb);
        mListitems=new ArrayList<>();
        layoutManager=new GridLayoutManager(this,2);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(layoutManager);
        mAdapter=new AdapterListdetails(mListitems,this);
        mRecyclerview.setAdapter(mAdapter);
        request();
    }

    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        //mListitems=new ArrayList<>();
        // model.setTitle(data.getString("title"));
        mListitems.add(new Details("12:40 AM","IMAGE 1",R.drawable.rabitone));
        mListitems.add(new Details("1:50 PM","IMAGE 2",R.drawable.rabit2));
        mListitems.add(new Details("3:50 PM","IMAGE 3",R.drawable.rabit3));
        mListitems.add(new Details("10:35 AM ","IMAGE 4",R.drawable.rabittwo));
        progressBar.setVisibility(View.GONE);
    }
}
