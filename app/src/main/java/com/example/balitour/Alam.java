package com.example.balitour;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Alam extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[], s3[], s4[];
    int images[] = {R.drawable.lekeleke, R.drawable.tegenungan, R.drawable.kantolampo1, R.drawable.sekumpul1, R.drawable.batur, R.drawable.tamblingan};
//    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);
//        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        s1 = getResources().getStringArray(R.array.wisata_alam);
        s2 = getResources().getStringArray(R.array.deskripsi_alam);
        s3 = getResources().getStringArray(R.array.lokasi_alam);
        s4 = getResources().getStringArray(R.array.video_alam);

        AlamAdapter alamAdapter = new AlamAdapter(this, s1, s2, s3,s4, images);
        recyclerView.setAdapter(alamAdapter);
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



