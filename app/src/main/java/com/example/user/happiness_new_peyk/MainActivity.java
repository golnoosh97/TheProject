package com.example.user.happiness_new_peyk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    private Context context;
    //   private List<AllimagesItem> allimagesItemList;
    private List<AllimagesItem> allimagesItemList = new ArrayList<>();
    private List<com.example.user.happiness_new_peyk.Response> responseList;
    private List<String> url = new ArrayList<>(10);
    private List<String> name = new ArrayList<>(10);
    private RecyclerView recyclerView;
    private ListAdapter mAdapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyApi apiService = ItemApi.getClient().create(MyApi.class);
        Call<com.example.user.happiness_new_peyk.Response> call = apiService.getAllimagesItemList();
        call.enqueue(new Callback<com.example.user.happiness_new_peyk.Response>() {
            @Override
            public void onResponse(Call<com.example.user.happiness_new_peyk.Response> call, Response<com.example.user.happiness_new_peyk.Response> response) {
                allimagesItemList.addAll(response.body().getQuery().getAllimages());
                setupRecyclerView(allimagesItemList);
            }

            @Override
            public void onFailure(Call<com.example.user.happiness_new_peyk.Response> call, Throwable t) {
                if (t instanceof IOException) {
                    Toast.makeText(MainActivity.this, "Connection Problem !", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    private void setupRecyclerView(final List<AllimagesItem> allimagesItemList1) {
        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        mAdapter = new ListAdapter(context, allimagesItemList1);
        recyclerView.setAdapter(mAdapter);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addOnItemTouchListener(new  RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener(){

           public void onItemClick(View view, int position){

               AllimagesItem allimagesItem=allimagesItemList1.get(position);
               String str = allimagesItem.getUrl();
              // String title =allimagesItem.getTitle();

               Bundle bundle = new Bundle();
               bundle.putString("image",str);
              // bundle.putString("title",title);

               Intent go = new Intent(MainActivity.this, SecondActivity.class);
               go.putExtras(bundle);
               startActivity(go);

           }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }
        ));

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.title) {
            Toast.makeText(this, "Golno0osh  ^_______^ ", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.subtitle) {
            Toast.makeText(this, "subtitle clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}


