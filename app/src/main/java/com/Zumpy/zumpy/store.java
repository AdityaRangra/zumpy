package com.Zumpy.zumpy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.RMD.zumpy.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;
import java.util.Map;

public class store extends AppCompatActivity {



    private Map<Integer, Class<?>> activityMap;
    public CardView card101, card102, card103, card104, card105, card106, card107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_diet);

        // Initialize the activity map
        activityMap = new HashMap<>();
        activityMap.put(R.id.bottom_home, dashboard.class);
        activityMap.put(R.id.bottom_consult, consult.class);// Current activity, no navigation
        activityMap.put(R.id.bottom_diet, diet.class);
        activityMap.put(R.id.bottom_store, null);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Class<?> targetActivity = activityMap.get(item.getItemId());
            if (targetActivity != null) {
                startActivity(new Intent(getApplicationContext(), targetActivity));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            }
            return targetActivity == null; // return true if staying on the same page
        });

        card101 = (CardView) findViewById(R.id.card101);
        card102 = (CardView) findViewById(R.id.card102);
        card103 = (CardView) findViewById(R.id.card103);
        card104 = (CardView) findViewById(R.id.card104);
        card105 = (CardView) findViewById(R.id.card105);
        card106 = (CardView) findViewById(R.id.card106);
        card107 = (CardView) findViewById(R.id.card107);

        card101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amazon.in/Lifelong-LLYM93-Women-Material-Workout/dp/B09YJ5BRSW/ref=s9_acsd_al_ot_c2_x_0_t?_encoding=UTF8&pf_rd_m=A21TJRUUN4KGV&pf_rd_s=merchandised-search-5&pf_rd_r=SJ6886E2NDDFYCVYGSZ4&pf_rd_p=dd3c25ac-76eb-4615-8a6b-f31d9810541d&pf_rd_t=&pf_rd_i=62668330031");
            }
        });

        card102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amazon.in/Wiselife-Thermoplastic-Elastomers-Anti-Slip-Exercise/dp/B08L6T2STF/ref=sr_1_20?dib=eyJ2IjoiMSJ9.ipw7sE7Rbf2YE-KlHWBswHAaaqxCwjMLY5zgJa7hh2d-alP0Qck-Qc3QcCs2RjhpS1k8V9DCrgDs3AogjUI1rlDrhiusUP0CV6P_AEzobiq4mp_S8f07AXWC7zWTSHTfDsVKV7Xhbk4VHCtReDcRJq7-mNoTOZoFle3UJldqPjf7YuVS9UOKD9GDciOtglwzVkmkt_JGao6VkK-ND-VWUrwbcOVO1O1FTmq8R1lugtZiIa_RaUd0n_umodrTtxa0HAiEfdknThsA0GpdsfCFIRdsmrNjKqaOO3zSk5Z_bRU.cuh_F4GIdYwkZUyPi02bXsKYlYy5seZ0Fm_TMNeHgrw&dib_tag=se&qid=1726389114&s=sports&sr=1-20&th=1");
            }
        });

        card103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amazon.in/Strauss-Exercise-Physiotherapy-Travel-Friendly-Equipment/dp/B09QHPWY6J/ref=sr_1_31_sspa?dib=eyJ2IjoiMSJ9.ipw7sE7Rbf2YE-KlHWBswHAaaqxCwjMLY5zgJa7hh2d-alP0Qck-Qc3QcCs2RjhpS1k8V9DCrgDs3AogjUI1rlDrhiusUP0CV6P_AEzobiq4mp_S8f07AXWC7zWTSHTfDsVKV7Xhbk4VHCtReDcRJq7-mNoTOZoFle3UJldqPjf7YuVS9UOKD9GDciOtglwzVkmkt_JGao6VkK-ND-VWUrwbcOVO1O1FTmq8R1lugtZiIa_RaUd0n_umodrTtxa0HAiEfdknThsA0GpdsfCFIRdsmrNjKqaOO3zSk5Z_bRU.cuh_F4GIdYwkZUyPi02bXsKYlYy5seZ0Fm_TMNeHgrw&dib_tag=se&qid=1726389114&s=sports&sr=1-31-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9idGZfYnJvd3Nl&psc=1");
            }
        });

        card104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amazon.in/TEGO-Stance-Reversible-Spring-GuideAlign/dp/B0788Q56FQ/ref=sr_1_3_sspa?dib=eyJ2IjoiMSJ9.ipw7sE7Rbf2YE-KlHWBswHAaaqxCwjMLY5zgJa7hh2d-alP0Qck-Qc3QcCs2RjhpS1k8V9DCrgDs3AogjUI1rlDrhiusUP0CV6P_AEzobiq4mp_S8f07AXWC7zWTSHTfDsVKV7Xhbk4VHCtReDcRJq7-mNoTOZoFle3UJldqPjf7YuVS9UOKD9GDciOtglwzVkmkt_JGao6VkK-ND-VWUrwbcOVO1O1FTmq8R1lugtZiIa_RaUd0n_umodrTtxa0HAiEfdknThsA0GpdsfCFIRdsmrNjKqaOO3zSk5Z_bRU.cuh_F4GIdYwkZUyPi02bXsKYlYy5seZ0Fm_TMNeHgrw&dib_tag=se&qid=1726389114&s=sports&sr=1-3-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGZfYnJvd3Nl&th=1");
            }
        });

        card105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amazon.in/NETTIE-Cotton-Carry-Strap-Drawstring/dp/B08LBT1R9J/ref=lp_62668330031_1_10?pf_rd_p=9e034799-55e2-4ab2-b0d0-eb42f95b2d05&pf_rd_r=SJ6886E2NDDFYCVYGSZ4&sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&th=1");
            }
        });

        card106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amazon.in/Lifelong-LLYM93-Women-Material-Workout/dp/B09YJ5BRSW/ref=s9_acsd_al_ot_c2_x_0_t?_encoding=UTF8&pf_rd_m=A21TJRUUN4KGV&pf_rd_s=merchandised-search-5&pf_rd_r=SJ6886E2NDDFYCVYGSZ4&pf_rd_p=dd3c25ac-76eb-4615-8a6b-f31d9810541d&pf_rd_t=&pf_rd_i=62668330031");
            }
        });

        card107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amazon.in/TEGO-Stance-Reversible-Spring-GuideAlign/dp/B0788Q56FQ/ref=sr_1_3_sspa?dib=eyJ2IjoiMSJ9.ipw7sE7Rbf2YE-KlHWBswHAaaqxCwjMLY5zgJa7hh2d-alP0Qck-Qc3QcCs2RjhpS1k8V9DCrgDs3AogjUI1rlDrhiusUP0CV6P_AEzobiq4mp_S8f07AXWC7zWTSHTfDsVKV7Xhbk4VHCtReDcRJq7-mNoTOZoFle3UJldqPjf7YuVS9UOKD9GDciOtglwzVkmkt_JGao6VkK-ND-VWUrwbcOVO1O1FTmq8R1lugtZiIa_RaUd0n_umodrTtxa0HAiEfdknThsA0GpdsfCFIRdsmrNjKqaOO3zSk5Z_bRU.cuh_F4GIdYwkZUyPi02bXsKYlYy5seZ0Fm_TMNeHgrw&dib_tag=se&qid=1726389114&s=sports&sr=1-3-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGZfYnJvd3Nl&th=1");
            }
        });
    }
        private void gotoUrl (String s){
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW, uri));

        }
    }