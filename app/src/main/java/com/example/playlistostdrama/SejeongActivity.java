package com.example.playlistostdrama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.playlistostdrama.adapter.DramaAdapter;

import java.util.ArrayList;

public class SejeongActivity extends AppCompatActivity {
    private TextView welcome;
    private RecyclerView rv_drama_list;

    // deklarasi adapter yang telah dibuat
    private DramaAdapter dramaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        rv_drama_list = findViewById(R.id.rv_drama_list);

        dramaAdapter = new DramaAdapter();

        rv_drama_list.setLayoutManager(new LinearLayoutManager(this));

        rv_drama_list.setAdapter(dramaAdapter);

        // memasukkan data ke dalam list
        ArrayList<Sejeongsong> data = Song.dummyDrama();
        dramaAdapter.setDramas(data);
    }

}