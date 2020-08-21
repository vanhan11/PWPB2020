package com.alvanhanani.intentpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv  = (TextView) findViewById(R.id.tv_data);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString( "name");
        tv.setText(s);
    }
}