package com.alvanhanani.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText bil1,bil2,jumlah;
    private Button btnhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }
    private void initUI() {
        bil1 = (EditText)findViewById(R.id.et_1);
        bil2 = (EditText)findViewById(R.id.et_2);
        jumlah = (EditText)findViewById(R.id.et_3);
        btnhasil = (Button)findViewById(R.id.btn_jmlh);
    }
    private void initEvent() {
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");
    }
}