package com.example.playlistostdrama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvLaguDetail, tvNamaDetail, tvPenyanyiDetail, tvTahunDetail, tvAktorDetail, tvLirikDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvLaguDetail = findViewById(R.id.tv_detail_lagu);
        tvTahunDetail = findViewById(R.id.tv_detail_tahun);
        tvNamaDetail = findViewById(R.id.tv_detail_nama);
        tvPenyanyiDetail = findViewById(R.id.tv_detail_penyanyi);
        tvAktorDetail = findViewById(R.id.tv_detail_aktor);
        tvLirikDetail = findViewById(R.id.tv_detail_lirik);


        tvLaguDetail.setText(getIntent().getStringExtra("judul"));
        tvTahunDetail.setText(getIntent().getStringExtra("tahun"));
        tvNamaDetail.setText(getIntent().getStringExtra("nama"));
        tvPenyanyiDetail.setText(getIntent().getStringExtra("penyanyi"));
        tvAktorDetail.setText(getIntent().getStringExtra("aktor"));
        tvLirikDetail.setText(getIntent().getStringExtra("liriknya"));

    }


}