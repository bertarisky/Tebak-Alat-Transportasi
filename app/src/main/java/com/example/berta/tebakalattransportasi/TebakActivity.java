package com.example.berta.tebakalattransportasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;

public class TebakActivity extends AppCompatActivity {

    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;

    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        setInitalisasi();
        cekIntent();
        onClickJos();
    }

    private void onClickJos() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawabb.getText().toString().equals(jawaban)){
                    Toast.makeText(TebakActivity.this,"Kamu Pintar!",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this,"Maaf Kamu Salah!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_transportasi = cek.getStringExtra("nama_transportasi");

        if (nama_transportasi.equals("bus")){
            imageView_tebak.setImageResource(R.drawable.bus);
            jawaban = "bus";

        } else if (nama_transportasi.equals("sepeda")){
            imageView_tebak.setImageResource(R.drawable.sepeda);
            jawaban = "sepeda";
        } else if (nama_transportasi.equals("motor")){
            imageView_tebak.setImageResource(R.drawable.motor);
            jawaban = "motor";
        } else if (nama_transportasi.equals("mobil")){
            imageView_tebak.setImageResource(R.drawable.mobil);
            jawaban = "mobil";
        } else if (nama_transportasi.equals("kapal")){
            imageView_tebak.setImageResource(R.drawable.kapal);
            jawaban = "kapal";
        } else if (nama_transportasi.equals("pesawat")){
            imageView_tebak.setImageResource(R.drawable.pesawat);
            jawaban = "pesawat";
        } else if (nama_transportasi.equals("becak")){
            imageView_tebak.setImageResource(R.drawable.becak);
            jawaban = "becak";
        } else {
            imageView_tebak.setImageResource(R.drawable.helikopter);
            jawaban = "helikopter";
        }

    }

    private void setInitalisasi() {
        imageView_tebak = (ImageView)findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText)findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);
    }
}
