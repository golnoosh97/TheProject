package com.example.user.happiness_new_peyk;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    private Context context;
    private List<Query> queryList;
    private List<AllimagesItem> allimagesItemList;
    // private List<Pojo>pojoList;
    private List<String> url = new ArrayList<>(10);
    private List<String> name = new ArrayList<>(10);


    private RecyclerView recyclerView;
    private ListAdapter mAdapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MyApi apiService = ItemApi.getClient().create(MyApi.class);
        Call<Query> call = apiService.getAllimagesItemList();
        call.enqueue(new Callback<Query>() {
            @Override
            public void onResponse(Call<Query> call, Response<Query> response) {
                if (response.isSuccessful()) {

                    List<AllimagesItem> allimagesItemList = response.body().getAllimages();

                    for (int i = 0; i < 10; i++) {
                        url.add(allimagesItemList.get(i).getUrl());
                        name.add(allimagesItemList.get(i).getName());
                        // String url= queryList.get(i).getAllimages().toString();
                    }
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                    setupRecyclerView(allimagesItemList);
                }
            }

            @Override
            public void onFailure(Call<Query> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Connection Problem !", Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void setupRecyclerView(final List<AllimagesItem> allimagesItemList) {
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        mAdapter = new ListAdapter(context, url, name);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
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


