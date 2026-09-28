package com.Narsyah_f52124086.petshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listHewan;

    String[] namaHewan = {
            "Kucing Persia",
            "Anjing Pomeranian",
            "Kelinci Holland Lop",
            "Hamster Syrian",
            "Burung Lovebird"
    };

    String[] jenisHewan = {
            "Kucing • Ramah • Cocok untuk keluarga",
            "Anjing • Aktif • Ramah dan pintar",
            "Kelinci • Jinak • Mudah dirawat",
            "Hamster • Kecil • Cocok untuk pemula",
            "Burung • Ceria • Pandai berkicau"
    };

    String[] hargaHewan = {
            "Rp 2.500.000",
            "Rp 4.000.000",
            "Rp 750.000",
            "Rp 300.000",
            "Rp 850.000"
    };

    int[] gambarHewan = {
            R.drawable.kucing_persia,
            R.drawable.anjing_pomeranian,
            R.drawable.kelinci_holland_lop,
            R.drawable.hamster_syrian,
            R.drawable.lovebird
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listHewan = findViewById(R.id.listHewan);

        AdapterHewan adapter = new AdapterHewan();
        listHewan.setAdapter(adapter);
    }

    class AdapterHewan extends BaseAdapter {

        @Override
        public int getCount() {
            return namaHewan.length;
        }

        @Override
        public Object getItem(int position) {
            return namaHewan[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = LayoutInflater.from(MainActivity.this)
                        .inflate(R.layout.item_hewan, parent, false);
            }

            ImageView imgHewan =
                    convertView.findViewById(R.id.imgHewan);

            TextView txtNamaHewan =
                    convertView.findViewById(R.id.txtNamaHewan);

            TextView txtJenisHewan =
                    convertView.findViewById(R.id.txtJenisHewan);

            TextView txtHargaHewan =
                    convertView.findViewById(R.id.txtHargaHewan);

            imgHewan.setImageResource(gambarHewan[position]);
            txtNamaHewan.setText(namaHewan[position]);
            txtJenisHewan.setText(jenisHewan[position]);
            txtHargaHewan.setText(hargaHewan[position]);

            return convertView;
        }
    }
}