package com.example.balitour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MenuUtama extends AppCompatActivity {
    Button btnAlam,btnKuliner,btnOleh,btnPura;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        btnAlam = (Button)findViewById(R.id.btnAlam);
        btnKuliner = (Button)findViewById(R.id.btnKuliner);
        btnOleh = (Button)findViewById(R.id.btnOleh);
        btnPura = (Button)findViewById(R.id.btnPura);
        ImageSlider imageSlide = findViewById(R.id.slide);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.difawisata.com/wp-content/uploads/2020/02/Danau-Batur-Kintamani-Bali.jpg","Danau Batur"));
        slideModels.add(new SlideModel("https://1.bp.blogspot.com/-aiVXsemTKy8/X1HivJMg5vI/AAAAAAAADBw/SMrYF4t8DLcyZ6n9Fmdn3XJ-OuxIUvhfACPcBGAYYCw/w500-h335/Sekumpul%2B4.jpg","Air Terjun Sekumpul"));
        slideModels.add(new SlideModel("https://i.ibb.co/yn8rG9P/Pande-Egi.jpg","Babi Guling Pande Egi"));
        slideModels.add(new SlideModel("https://cdn.pergidulu.com/wp-content/uploads/2013/04/Ayam-Betutu-Khas-Gilimanuk.jpg","Ayam Betutu Khas Gilimanuk"));
        slideModels.add(new SlideModel("https://krisnabali.co.id/wp-content/uploads/2019/12/krisna-nusa-kambangan-18.jpg","Krisna Oleh-Oleh"));
        slideModels.add(new SlideModel("https://assets.kompasiana.com/items/album/2018/06/30/pasar-seni-sukawati-pusat-oleh-oleh-khas-bali-yang-terkenal-5b36f94a5e137304b5782712.jpg?t=o&v=740&x=416","Pasar Sukawati"));
        slideModels.add(new SlideModel("https://tempatwisatadibali.info/wp-content/uploads/2018/02/Pura-Agung-Besakih-Karangasem-Bali-1.jpg","Pura Besakih"));
        slideModels.add(new SlideModel("https://cdn.rentalmobilbali.net/wp-content/uploads/2012/03/objek-wisata-uluwatu.jpg","Pura Uluwatu"));
        imageSlide.setImageList(slideModels,true);


        btnAlam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, Alam.class);
                startActivity(intent);
            }
        });

        btnKuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, Kuliner.class);
                startActivity(intent);
            }
        });

        btnOleh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, Oleholeh.class);
                startActivity(intent);
            }
        });

        btnPura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(MenuUtama.this, Pura.class);
                    startActivity(intent);
            }
        });
    }
}
