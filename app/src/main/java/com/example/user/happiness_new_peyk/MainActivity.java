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
    private List<Pojo> pojoList;
    private List<Pojo.Query> queryList;
    private List<String> url = new ArrayList<>(10);


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
        Call<PojoResponse> call = apiService.getPojo("withBody");
        call.enqueue(new Callback<PojoResponse>() {
            @Override
            public void onResponse(Call<PojoResponse> call, Response<PojoResponse> response) {
                if (response.isSuccessful()) {
                    List<Pojo>pojoList = response.body().getpojo();

                    for (int i = 0; i < 10; i++) {
                        url.add(pojoList.get(i).getQuery().getAllimages().);
                    }
                    setupRecyclerView(pojoList);
                }
            }

            @Override
            public void onFailure(Call<PojoResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Connection Problem !", Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void setupRecyclerView(final List<Pojo> pojoList) {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        mAdapter = new ListAdapter(context,url);
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


