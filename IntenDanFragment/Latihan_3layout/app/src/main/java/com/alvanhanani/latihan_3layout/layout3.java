package com.alvanhanani.latihan_3layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);
        Button btnl3 = findViewById(R.id.btnl3);
        btnl3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnl3:
                Intent btnl3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schooll.com"));
                startActivity(btnl3);
                break;
        }

    }
}