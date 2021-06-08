package com.example.balitour;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Kuliner extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[], s3[], s4[];
    int images[] = {R.drawable.betutu, R.drawable.liku, R.drawable.pandeegi1, R.drawable.panana, R.drawable.jrokawan, R.drawable.slingsing};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s1 = getResources().getStringArray(R.array.wisata_kuliner);
        s2 = getResources().getStringArray(R.array.deskripsi_kuliner);
        s3 = getResources().getStringArray(R.array.lokasi_kuliner);
        s4 = getResources().getStringArray(R.array.video_kuliner);

        KulinerAdapter kulinerAdapter = new KulinerAdapter(this, s1, s2, s3, s4, images);
        recyclerView.setAdapter(kulinerAdapter);
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
