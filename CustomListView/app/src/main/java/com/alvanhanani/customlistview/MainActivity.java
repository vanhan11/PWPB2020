package com.alvanhanani.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> heroList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

                heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
                heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
                heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
                heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
                heroList.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
                heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));


        MylistAdapter adapter = new MylistAdapter(this, R.layout.my_costum_list, heroList);

        listView.setAdapter(adapter);

    }
}