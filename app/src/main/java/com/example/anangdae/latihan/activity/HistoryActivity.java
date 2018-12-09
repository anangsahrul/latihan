package com.example.anangdae.latihan.activity;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.anangdae.latihan.HistoryAdapter;
import com.example.anangdae.latihan.R;
import com.example.anangdae.latihan.pojo.History;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private HistoryAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<History> histories = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        rvView = findViewById(R.id.rv_history);
        rvView.setLayoutManager(new LinearLayoutManager(this));
        rvView.setHasFixedSize(true);
        rvView.setItemAnimator(new DefaultItemAnimator());
        adapter = new HistoryAdapter(histories);
        rvView.setAdapter(adapter);

        History history = new History();
        history.setHargaHotel(200000);
        history.setLamaInap("lama inap 24 jam");
        history.setNamaHotel("Hotel Jakrta");
        history.setPromoHotel("Diskon November");
        history.setTanggalHotel(Calendar.getInstance().getTime());

        BitmapDrawable drawable = (BitmapDrawable) getDrawable(R.drawable.gambar2);
        history.setGambarkamar(drawable.getBitmap());
        histories.add(history);
        adapter.notifyDataSetChanged();
    }
}
