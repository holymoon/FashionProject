package com.example.fashionproject;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends Activity {
    TextView action_bar_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();
        action_bar_title=findViewById(R.id.action_bar_title);
        action_bar_title.animate().alpha(0).setDuration(2000).start();

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        RecyclerView recycler = findViewById(R.id.recycler);
        ArrayList<String> list = new ArrayList<>();
        list.add("Women");
        list.add("Men");

        FashionRecyclerAdapter adapter = new FashionRecyclerAdapter(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));

    }

    }

