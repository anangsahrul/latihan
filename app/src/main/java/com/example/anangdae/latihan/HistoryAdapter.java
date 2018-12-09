package com.example.anangdae.latihan;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anangdae.latihan.pojo.History;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    private final List<History> histories;

    public HistoryAdapter(List<History> histories) {
        this.histories = histories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_history,
                viewGroup,false);
                ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final History name = histories.get(i);
        viewHolder.gmbr_kamar.setImageBitmap(name.getGambarkamar());
        viewHolder.nm_hotel.setText(name.getNamaHotel());
        viewHolder.promo_terbatas.setText(name.getPromoHotel());
        viewHolder.harga.setText(String.valueOf(name.getHargaHotel()));
        viewHolder.tanggal.setText(String.valueOf(name.getTanggalHotel()));
        viewHolder.waktu_nginap.setText(String.valueOf(name.getLamaInap()));

    }

    @Override
    public int getItemCount() {
        return histories.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView gmbr_kamar;
        public TextView nm_hotel;
        public TextView promo_terbatas;
        public TextView harga;
        public TextView tanggal;
        public TextView waktu_nginap;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gmbr_kamar = itemView.findViewById(R.id.gmbr_kamar);
            nm_hotel = itemView.findViewById(R.id.nama_hotel);
            promo_terbatas= itemView.findViewById(R.id.promo_terbatas);
            harga=itemView.findViewById(R.id.harga);
            tanggal=itemView.findViewById(R.id.tanggal);
            waktu_nginap=itemView.findViewById(R.id.waktu_nginap);
        }
    }
}
