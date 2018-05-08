package com.example.berta.tebakalattransportasi;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_bus, imageView_sepeda, imageView_motor,imageView_mobil,imageView_kapal,imageView_pesawat
            ,imageView_becak,imageView_helikopter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab() {

        imageView_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this,TebakActivity.class);
                b.putExtra("nama_transportasi","bus");
                startActivity(b);
            }
        });

        imageView_sepeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MainActivity.this,TebakActivity.class);
                s.putExtra("nama_transportasi","sepeda");
                startActivity(s);
            }
        });

        imageView_motor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(MainActivity.this, TebakActivity.class);
                m.putExtra("nama_transportasi","motor");
                startActivity(m);
            }
        });

        imageView_mobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mo = new Intent(MainActivity.this,TebakActivity.class);
                mo.putExtra("nama_transportasi","mobil");
                startActivity(mo);
            }
        });

        imageView_kapal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this, TebakActivity.class);
                k.putExtra("nama_transportasi","kapal");
                startActivity(k);
            }
        });

        imageView_pesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MainActivity.this, TebakActivity.class);
                p.putExtra("nama_transportasi","pesawat");
                startActivity(p);
            }
        });

        imageView_becak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent be = new Intent(MainActivity.this, TebakActivity.class);
                be.putExtra("nama_transportasi","becak");
                startActivity(be);
            }
        });

        imageView_helikopter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent he = new Intent(MainActivity.this, TebakActivity.class);
                he.putExtra("nama_transportasi","helikopter");
                startActivity(he);
            }
        });

    }

    private void setInisialisasi() {
        imageView_bus = (ImageView)findViewById(R.id.imageView_bus);
        imageView_sepeda = (ImageView)findViewById(R.id.imageView_sepeda);
        imageView_motor = (ImageView)findViewById(R.id.imageView_motor);
        imageView_mobil = (ImageView)findViewById(R.id.imageView_mobil);
        imageView_kapal = (ImageView)findViewById(R.id.imageView_kapal);
        imageView_pesawat = (ImageView)findViewById(R.id.imageView_pesawat);
        imageView_becak = (ImageView)findViewById(R.id.imageView_becak);
        imageView_helikopter = (ImageView)findViewById(R.id.imageView_helikopter);
    }
}
