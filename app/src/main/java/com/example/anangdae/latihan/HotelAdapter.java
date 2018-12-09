package com.example.anangdae.latihan;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anangdae.latihan.activity.DetailHotelActivity;
import com.example.anangdae.latihan.pojo.Hotel;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {
    private final List<Hotel> daftarhotel;

    public HotelAdapter(List<Hotel> daftarhotel) {
        this.daftarhotel = daftarhotel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_hotel,
                viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Hotel name = daftarhotel.get(i);

        viewHolder.gambar_hotel.setImageBitmap(name.getGambar_hotel());
        viewHolder.promo_terbatas.setText(name.getPromo_terbatas());
        viewHolder.harga.setText(String.valueOf(name.getHarga()));
        viewHolder.tanggal.setText(String.valueOf(name.getTanggal()));
        viewHolder.waktu_nginap.setText(String.valueOf(name.getWaktu_nginap()));

    }

    @Override
    public int getItemCount() {
        return daftarhotel.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView promo_terbatas;
        public TextView harga;
        public TextView tanggal;
        public TextView waktu_nginap;
        public ImageView gambar_hotel;


        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(itemView.getContext(), DetailHotelActivity.class);
                    itemView.getContext().startActivity(i);
                }
            });
            gambar_hotel = itemView.findViewById(R.id.gambar_hotel);
            promo_terbatas = itemView.findViewById(R.id.promo_terbatas);
            harga = itemView.findViewById(R.id.harga);
            tanggal = itemView.findViewById(R.id.tanggal);
            waktu_nginap = itemView.findViewById(R.id.waktu_nginap);
        }

    }
}
