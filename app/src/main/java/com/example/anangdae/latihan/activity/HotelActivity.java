package com.example.anangdae.latihan.activity;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.anangdae.latihan.HotelAdapter;
import com.example.anangdae.latihan.R;
import com.example.anangdae.latihan.pojo.Hotel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HotelActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private HotelAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Hotel> daftarhotels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        rvView = findViewById(R.id.rv_daftarhotel);
        rvView.setLayoutManager(new LinearLayoutManager(this));
        rvView.setHasFixedSize(true);
        rvView.setItemAnimator(new DefaultItemAnimator());
        adapter = new HotelAdapter(daftarhotels);
        rvView.setAdapter(adapter);

        Hotel daftarhotel = new Hotel();
        daftarhotel.setHarga(2100000);
        //daftarhotel.setHarga(2);
        daftarhotel.setNama_hotel("Jakarta Center");
        daftarhotel.setPromo_terbatas("Diskon November");
        daftarhotel.setWaktu_nginap("Lama inap 24 jam");
        daftarhotel.setTanggal(Calendar.getInstance().getTime());

        BitmapDrawable drawable = (BitmapDrawable) getDrawable(R.drawable.gambarhotel);
        daftarhotel.setGambar_hotel(drawable.getBitmap());
        daftarhotels.add(daftarhotel);
        adapter.notifyDataSetChanged();

    }
}
