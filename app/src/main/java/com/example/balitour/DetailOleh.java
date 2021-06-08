package com.example.balitour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailOleh extends AppCompatActivity {

    ImageView mainImageView;
    TextView tittle, loc, dec;

    String data1, data2, data3, data4;
    int images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tittle = findViewById(R.id.tittle);
//        loc = findViewById(R.id.loc);
        dec = findViewById(R.id.dec);
        mainImageView = findViewById(R.id.mainImageView);

        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("images") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2") && getIntent().hasExtra("data3") && getIntent().hasExtra("data4") ){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            data4 = getIntent().getStringExtra("data4");
            images = getIntent().getIntExtra("images", 1);


        }else{
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        tittle.setText(data1);
//        loc.setText(data3);
        dec.setText(data2);
        mainImageView.setImageResource(images);
    }
    public void maps(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(data3));
        startActivity(browserIntent);
    }

    public void video(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(data4));
        startActivity(browserIntent);
    }
}

