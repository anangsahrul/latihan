package com.example.anangdae.latihan.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.anangdae.latihan.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected CardView about,history,getDaftar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about = (CardView) findViewById(R.id.about);
        history = (CardView) findViewById(R.id.h_history);
        getDaftar = (CardView) findViewById(R.id.daftar_hotel);


        about.setOnClickListener(this);
        history.setOnClickListener(this);
        getDaftar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.about:
                i = new Intent(this, AboutActivity.class);
                startActivity(i);
                break;
            case R.id.h_history:
                i = new Intent(this, HistoryActivity.class);
                startActivity(i);
                break;
            case R.id.daftar_hotel:
                i = new Intent(this, HotelActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}