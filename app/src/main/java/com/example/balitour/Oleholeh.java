package com.example.balitour;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Oleholeh extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[], s3[], s4[];
    int images[] = {R.drawable.sukawati, R.drawable.krisna, R.drawable.keranjang, R.drawable.discovery, R.drawable.joger, R.drawable.pasar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s1 = getResources().getStringArray(R.array.wisata_oleh);
        s2 = getResources().getStringArray(R.array.deskripsi_oleh);
        s3 = getResources().getStringArray(R.array.lokasi_oleh);
        s4 = getResources().getStringArray(R.array.video_oleh);

        OlehAdapter olehAdapter = new OlehAdapter(this, s1, s2, s3, s4, images);
        recyclerView.setAdapter(olehAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
