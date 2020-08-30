package com.alvanhanani.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitintent = (Button)findViewById(R.id.expclicit);
        explicitintent.setOnClickListener(this);

        implicitintent = (Button)findViewById(R.id.implicit);
        implicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.expclicit:
                    Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                    startActivity(explicit);

                    break;
                case R.id.implicit:
                    Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schooll.com"));
                    startActivity(implicit);
                    break;
                default:
                    break;
            }

    }
}