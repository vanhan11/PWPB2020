package com.alvanhanani.latihan_3layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        Button btnweb = findViewById(R.id.btn_web);
        btnweb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_web:
                Intent btnweb = new Intent(layout2.this, layout3.class);
                startActivity(btnweb);
                break;
        }

    }
}