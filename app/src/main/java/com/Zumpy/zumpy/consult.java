package com.Zumpy.zumpy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.RMD.zumpy.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;
import java.util.Map;

public class consult extends AppCompatActivity {

    private Map<Integer, Class<?>> activityMap;
    public CardView call1,call2,call3,call4,call5,call6,call7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);

        call1 = findViewById(R.id.call_1);
        call2 = findViewById(R.id.call_2);
        call3 = findViewById(R.id.call_3);
        call4 = findViewById(R.id.call_4);
        call5 = findViewById(R.id.call_5);
        call6 = findViewById(R.id.call_6);
        call7 = findViewById(R.id.call_7);


        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0000000000"));
                 startActivity(intent);
            }
        });
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0000000000"));
                startActivity(intent);
            }
        });
        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0000000000"));
                startActivity(intent);
            }
        });
        call4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0000000000"));
                startActivity(intent);
            }
        });
        call5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0000000000"));
                startActivity(intent);
            }
        });
        call6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0000000000"));
                startActivity(intent);
            }
        });
        call7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0000000000"));
                startActivity(intent);
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_consult);

        // Initialize the activity map
        activityMap = new HashMap<>();
        activityMap.put(R.id.bottom_home, dashboard.class);
        activityMap.put(R.id.bottom_consult, null );// Current activity, no navigation
        activityMap.put(R.id.bottom_diet,diet.class);
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
}