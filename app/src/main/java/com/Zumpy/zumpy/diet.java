package com.Zumpy.zumpy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.RMD.zumpy.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;
import java.util.Map;

public class diet extends AppCompatActivity {

    private Map<Integer, Class<?>> activityMap;

    public CardView card111, card112,card113,card114,card115;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        card111 = (CardView) findViewById(R.id.card111);
        card112 = (CardView) findViewById(R.id.card112);
        card113 = (CardView) findViewById(R.id.card113);
        card114 = (CardView) findViewById(R.id.card114);
        card115 = (CardView) findViewById(R.id.card115);


        card111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diet_one();
            }
        });

        card112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diet_two();
            }
        });
        card113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diet_three();
            }
        });

        card114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diet_four();
            }
        });

        card115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diet_five();
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_diet);

        // Initialize the activity map
        activityMap = new HashMap<>();
        activityMap.put(R.id.bottom_home, dashboard.class);
        activityMap.put(R.id.bottom_consult, consult.class );// Current activity, no navigation
        activityMap.put(R.id.bottom_diet,null);
        activityMap.put(R.id.bottom_store, store.class);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Class<?> targetActivity = activityMap.get(item.getItemId());
            if (targetActivity != null) {
                startActivity(new Intent(getApplicationContext(), targetActivity));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            }
            return targetActivity == null; // return true if staying on the same page
        });
    }

    public void diet_one() {
        Intent intent = new Intent(this, diet_one.class);
        startActivity(intent);
    }

    public void diet_two() {
        Intent intent = new Intent(this, diet_two.class);
        startActivity(intent);
    }
    public void diet_three() {
        Intent intent = new Intent(this, diet_three.class);
        startActivity(intent);
    }
    public void diet_four() {
        Intent intent = new Intent(this, diet_four.class);
        startActivity(intent);
    }
    public void diet_five() {
        Intent intent = new Intent(this, diet_five.class);
        startActivity(intent);
    }
}