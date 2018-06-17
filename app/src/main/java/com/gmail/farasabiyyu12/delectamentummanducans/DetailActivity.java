package com.gmail.farasabiyyu12.delectamentummanducans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView judul, bahan, resep;
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        judul = findViewById(R.id.judul);
        bahan = findViewById(R.id.bahan);
        resep = findViewById(R.id.resep);

        photo = findViewById(R.id.photo);

        Intent a1 = getIntent();
        String posisinama = a1.getStringExtra("posisinama");

        if (posisinama.equalsIgnoreCase("Ayam Geprek Sambal Matah")) {
            judul.setText(posisinama);
            bahan.setText(R.string.bahan_ayam_geprek_matah);
//            bahan.setText("Bahan - bahan : \n" + R.string.bahan_ayam_geprek_matah);
            resep.setText(R.string.langkah_ayam_geprek_matah);
//            resep.setText("Resep Masakan : \n" + R.string.resep_ayam_geprek_matah);
            photo.setImageResource(R.drawable.ayamgepreksambalmatah);
        }else if (posisinama.equalsIgnoreCase("Ayam Suwir Sambal Matah")) {
            judul.setText(posisinama);
            bahan.setText(R.string.resep_ayam_suwir_sambal_matah);
            resep.setText(R.string.langkah_ayam_suwir_sambal_matah);
            photo.setImageResource(R.drawable.ayamwirsamatah);
        }else if (posisinama.equalsIgnoreCase("Sambal Matah Kecombrang")) {
            judul.setText(posisinama);
            bahan.setText(R.string.resep_sambal_matah_kecombrang);
            resep.setText(R.string.langkah_sambal_matah_kecombrang);
            photo.setImageResource(R.drawable.samatbrang);
        }else if(posisinama.equalsIgnoreCase("Sambal Ikan Asin Peda Cabejo")) {
            judul.setText(posisinama);
            bahan.setText(R.string.resep_sambal_ikan_asin_peda_cabejo);
            resep.setText(R.string.langkah_sambal_ikan_asin_peda_cabejo);
            photo.setImageResource(R.drawable.sambalasinpeda);
        }else if(posisinama.equalsIgnoreCase("Nugget Ayam Handmade")) {
            judul.setText(posisinama);
            bahan.setText(R.string.resep_nugget_ayam_handmade);
            resep.setText(R.string.langkah_nugget_ayam_handmade);
            photo.setImageResource(R.drawable.nuggaymhand);
        }else if(posisinama.equalsIgnoreCase("Coto Makassar")) {
            judul.setText(posisinama);
            bahan.setText(R.string.resep_coto_makassar);
            resep.setText(R.string.langkah_coto_makassar);
            photo.setImageResource(R.drawable.cotomakassar);
        }
    }
}
