package com.Zumpy.zumpy;
import android.Manifest;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;


import com.RMD.zumpy.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;
import java.util.Map;

public class dashboard extends AppCompatActivity {

    private static final int NOTIFICATION_PERMISSION_CODE = 1001;
    private View shimmerContainer;
    private ShimmerFrameLayout shimmerLayout;
    private View mainContent;

    private static final String PREFS_NAME = "AppPrefs";
    private static final String SHIMMER_SHOWN_KEY = "shimmer_shown";
    public CardView card1, card2, card3, card4, card5, car6, card7, card8, card9, card10,
            card11, card12, card13, card14, card15, car16, card17, card18, card19, card20, card21,
            card22, card23, card24, card25, car26, card27, card28, card29, card30,
            card31, card32, card33, card34, card35, car36, card37, card38, card39, card40,
            card41, card42, card43, card44, card45, car46, card47, card48, card49, card50,
            card51, card52, card53, card54, card55, car56, card57, card58, card59, card60,
            card61, card62, card63, card64, card65, car67, card68, card69, card70,
            card71, card72, card73, card74, card75;

    private Map<Integer, Class<?>> activityMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        shimmerLayout = findViewById(R.id.shimmerLayout);
        mainContent = findViewById(R.id.scrollView); // Use the ScrollView ID

        // Start the shimmer effect
        shimmerLayout.startShimmer();

        // Simulate a loading process with a delay
        simulateDataLoading();

        checkAndRequestNotificationPermission();
    }
    private void checkAndRequestNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                // Permission is not granted, request it
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.POST_NOTIFICATIONS}, NOTIFICATION_PERMISSION_CODE);
            } else {
                // Permission is already granted
                // You can proceed with showing notifications
            }
        } else {
            // For devices below Android 13, no need to request this permission
            // You can proceed with showing notifications
        }
    }
    private void simulateDataLoading() {
        // Simulate a delay for loading data
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Stop Shimmer Effect
                shimmerLayout.stopShimmer();
                shimmerLayout.setVisibility(View.GONE);

                // Show Main Content
                mainContent.setVisibility(View.VISIBLE);
            }
        }, 1750); // 3 seconds delay

    BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

        // Initialize the activity map
        activityMap = new HashMap<>();
        activityMap.put(R.id.bottom_home,  null);
        activityMap.put(R.id.bottom_consult, consult.class );// Current activity, no navigation
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



        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);
        card5 = (CardView) findViewById(R.id.card5);
        car6 = (CardView) findViewById(R.id.card6);
        card7 = (CardView) findViewById(R.id.card7);
        card8 = (CardView) findViewById(R.id.card8);
        card9 = (CardView) findViewById(R.id.card9);
        card10 = (CardView) findViewById(R.id.card10);
        card11 = (CardView) findViewById(R.id.card11);
        card12 = (CardView) findViewById(R.id.card12);
        card13 = (CardView) findViewById(R.id.card13);
        card14 = (CardView) findViewById(R.id.card14);
        card15 = (CardView) findViewById(R.id.card15);
        car16 = (CardView) findViewById(R.id.card16);
        card17 = (CardView) findViewById(R.id.card17);
        card18 = (CardView) findViewById(R.id.card18);
        card19 = (CardView) findViewById(R.id.card19);
        card20 = (CardView) findViewById(R.id.card20);
        card21 = (CardView) findViewById(R.id.card21);
        card22 = (CardView) findViewById(R.id.card22);
        card23 = (CardView) findViewById(R.id.card23);
        card24 = (CardView) findViewById(R.id.card24);
        card25 = (CardView) findViewById(R.id.card25);
        car26 = (CardView) findViewById(R.id.card26);
        card27 = (CardView) findViewById(R.id.card27);
        card28 = (CardView) findViewById(R.id.card28);
        card29 = (CardView) findViewById(R.id.card29);
        card30 = (CardView) findViewById(R.id.card30);
        card31 = (CardView) findViewById(R.id.card31);
        card32 = (CardView) findViewById(R.id.card32);
        card33 = (CardView) findViewById(R.id.card33);
        card34 = (CardView) findViewById(R.id.card34);
        card35 = (CardView) findViewById(R.id.card35);
        car36 = (CardView) findViewById(R.id.card36);
        card37 = (CardView) findViewById(R.id.card37);
        card38 = (CardView) findViewById(R.id.card38);
        card39 = (CardView) findViewById(R.id.card39);
        card40 = (CardView) findViewById(R.id.card40);
        card41 = (CardView) findViewById(R.id.card41);
        card42 = (CardView) findViewById(R.id.card42);
        card43 = (CardView) findViewById(R.id.card43);
        card44 = (CardView) findViewById(R.id.card44);
        card45 = (CardView) findViewById(R.id.card45);
        car46 = (CardView) findViewById(R.id.card46);
        card47 = (CardView) findViewById(R.id.card47);
        card48 = (CardView) findViewById(R.id.card48);
        card49 = (CardView) findViewById(R.id.card49);
        card50 = (CardView) findViewById(R.id.card50);
        card51 = (CardView) findViewById(R.id.card51);
        card52 = (CardView) findViewById(R.id.card52);
        card53 = (CardView) findViewById(R.id.card53);
        card54 = (CardView) findViewById(R.id.card54);
        card55 = (CardView) findViewById(R.id.card55);
        car56 = (CardView) findViewById(R.id.card56);
        card57 = (CardView) findViewById(R.id.card57);
        card58 = (CardView) findViewById(R.id.card58);
        card59 = (CardView) findViewById(R.id.card59);
        card60 = (CardView) findViewById(R.id.card60);
        card61 = (CardView) findViewById(R.id.card61);
        card62 = (CardView) findViewById(R.id.card62);
        card63 = (CardView) findViewById(R.id.card63);
        card64 = (CardView) findViewById(R.id.card64);
        card65 = (CardView) findViewById(R.id.card65);
        car67 = (CardView) findViewById(R.id.card67);
        card68 = (CardView) findViewById(R.id.card68);
        card69 = (CardView) findViewById(R.id.card69);
        card70 = (CardView) findViewById(R.id.card70);
        card71 = (CardView) findViewById(R.id.card71);
        card72 = (CardView) findViewById(R.id.card72);
        card73 = (CardView) findViewById(R.id.card73);
        card74 = (CardView) findViewById(R.id.card74);
        card75 = (CardView) findViewById(R.id.card75);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onee();
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                four();
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threee();
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                five();
            }
        });
        car6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                six();
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seven();
            }
        });
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eight();
            }
        });
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nine();
            }
        });
        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ten();
            }
        });
        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eleven();
            }
        });

       card12.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               twelve();
            }
        });
        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirteen();
            }
        });

        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourteen();
            }
        });

        card15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fifteen();
            }
        });
        car16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixteen();
            }
        });
        card17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventeen();
            }
        });
        card18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eighteen();
            }
        });
        card19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nineteen();
            }
        });
        card20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twenty();
            }
        });
        card21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyone();
            }
        });

        card22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentytwo();
            }
        });
        card23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentythree();
            }
        });

        card24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyfour();
            }
        });

        card25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyfive();
            }
        });
        car26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentysix();
            }
        });
        card27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyseven();
            }
        });
        card28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyeight();
            }
        });
        card29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentynine();
            }
        });
        card30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirty();
            }
        });
        card31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtyone();
            }
        });

        card32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtytwo();
            }
        });
        card33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtythree();
            }
        });

        card34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtyfour();
            }
        });

        card35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtyfive();
            }
        });
        car36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtysix();
            }
        });
        card37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtyseven();
            }
        });
        card38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtyeight();
            }
        });
        card39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirtynine();
            }
        });
        card40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forty();
            }
        });
        card41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortyone();
            }
        });

        card42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortytwo();
            }
        });
        card43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortythree();
            }
        });

        card44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortyfour();
            }
        });

        card45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortyfive();
            }
        });
        car46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortysix();
            }
        });
        card47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortyseven();
            }
        });
        card48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortyeight();
            }
        });
        card49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fortynine();
            }
        });
        card50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fifty();
            }
        });
        card51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftyone();
            }
        });

        card52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftytwo();
            }
        });
        card53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftythree();
            }
        });

        card54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftyfour();
            }
        });

        card55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftyfive();
            }
        });
        car56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftysix();
            }
        });
        card57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftyseven();
            }
        });
        card58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftyeight();
            }
        });
        card59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiftynine();
            }
        });
        card60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixty();
            }
        });
        card61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtyone();
            }
        });

        card62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtytwo();
            }
        });
        card63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtythree();
            }
        });

        card64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtyfour();
            }
        });

        card65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtyfive();
            }
        });
        car67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtyseven();
            }
        });
        card68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtyeight();
            }
        });
        card69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixtynine();
            }
        });
        card70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventy();
            }
        });
        card71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventyone();
            }
        });

        card72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventytwo();
            }
        });
        card73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventythree();
            }
        });

        card74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventyfour();
            }
        });
        card75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventyfive();
            }
        });
    }



    public void onee() {
        Intent intent = new Intent(this, onee.class);
        startActivity(intent);
    }

    public void two() {
        Intent intent = new Intent(this, two.class);
        startActivity(intent);
    }
    public void threee() {
        Intent intent = new Intent(this, threee.class);
        startActivity(intent);
    }
    public void four() {
        Intent intent = new Intent(this, four.class);
        startActivity(intent);
    }
    public void five() {
        Intent intent = new Intent(this, five.class);
        startActivity(intent);
    }
    public void six() {
        Intent intent = new Intent(this, six.class);
        startActivity(intent);
    }
    public void seven() {
        Intent intent = new Intent(this, seven.class);
        startActivity(intent);
    }
    public void eight() {
        Intent intent = new Intent(this, eight.class);
        startActivity(intent);
    }
    public void nine() {
        Intent intent = new Intent(this, nine.class);
        startActivity(intent);
    }
    public void ten() {
        Intent intent = new Intent(this, ten.class);
        startActivity(intent);
    }
    public void eleven() {
        Intent intent = new Intent(this, eleven.class);
        startActivity(intent);
    }

    public void twelve() {
        Intent intent = new Intent(this, twelve.class);
        startActivity(intent);
    }
    public void thirteen() {
        Intent intent = new Intent(this, thirteen.class);
        startActivity(intent);
    }
    public void fourteen() {
        Intent intent = new Intent(this, fourteen.class);
        startActivity(intent);
    }
    public void fifteen() {
        Intent intent = new Intent(this, fifteen.class);
        startActivity(intent);
    }
    public void sixteen() {
        Intent intent = new Intent(this, sixteen.class);
        startActivity(intent);
    }
    public void seventeen() {
        Intent intent = new Intent(this, seventeen.class);
        startActivity(intent);
    }
    public void eighteen() {
        Intent intent = new Intent(this, eighteen.class);
        startActivity(intent);
    }
    public void nineteen() {
        Intent intent = new Intent(this, nineteen.class);
        startActivity(intent);
    }
   public void twenty() {
        Intent intent = new Intent(this, twenty.class);
        startActivity(intent);
    }
    public void twentyone() {
        Intent intent = new Intent(this, twentyone.class);
        startActivity(intent);
    }

    public void twentytwo() {
        Intent intent = new Intent(this, twentytwo.class);
        startActivity(intent);
    }
    public void twentythree() {
        Intent intent = new Intent(this, twentythree.class);
        startActivity(intent);
    }
    public void twentyfour() {
        Intent intent = new Intent(this, twentyfour.class);
        startActivity(intent);
    }
    public void twentyfive() {
        Intent intent = new Intent(this, twentyfive.class);
        startActivity(intent);
    }
    public void twentysix() {
        Intent intent = new Intent(this, twentysix.class);
        startActivity(intent);
    }
    public void twentyseven() {
        Intent intent = new Intent(this, twentyseven.class);
        startActivity(intent);
    }
    public void twentyeight() {
        Intent intent = new Intent(this, twentyeight.class);
        startActivity(intent);
    }
    public void twentynine() {
        Intent intent = new Intent(this, twentynine.class);
        startActivity(intent);
    }
    public void thirty() {
        Intent intent = new Intent(this, thirty.class);
        startActivity(intent);
    }
    public void thirtyone() {
        Intent intent = new Intent(this, thirtyone.class);
        startActivity(intent);
    }

    public void thirtytwo() {
        Intent intent = new Intent(this, thirtytwo.class);
        startActivity(intent);
    }
    public void thirtythree() {
        Intent intent = new Intent(this, thirtythree.class);
        startActivity(intent);
    }
    public void thirtyfour() {
        Intent intent = new Intent(this, thirtyfour.class);
        startActivity(intent);
    }
    public void thirtyfive() {
        Intent intent = new Intent(this, thirtyfive.class);
        startActivity(intent);
    }
    public void thirtysix() {
        Intent intent = new Intent(this, thirtysix.class);
        startActivity(intent);
    }
    public void thirtyseven() {
        Intent intent = new Intent(this, thirtyseven.class);
        startActivity(intent);
    }
    public void thirtyeight() {
        Intent intent = new Intent(this, thirtyeight.class);
        startActivity(intent);
    }
    public void thirtynine() {
        Intent intent = new Intent(this, thirtynine.class);
        startActivity(intent);
    }
    public void forty() {
        Intent intent = new Intent(this, forty.class);
        startActivity(intent);
    }
    public void fortyone() {
        Intent intent = new Intent(this, fortyone.class);
        startActivity(intent);
    }

    public void fortytwo() {
        Intent intent = new Intent(this, fortytwo.class);
        startActivity(intent);
    }
    public void fortythree() {
        Intent intent = new Intent(this, fortythree.class);
        startActivity(intent);
    }
    public void fortyfour() {
        Intent intent = new Intent(this, fortyfour.class);
        startActivity(intent);
    }
    public void fortyfive() {
        Intent intent = new Intent(this, fortyfive.class);
        startActivity(intent);
    }
    public void fortysix() {
        Intent intent = new Intent(this, fortysix.class);
        startActivity(intent);
    }
    public void fortyseven() {
        Intent intent = new Intent(this, fortyseven.class);
        startActivity(intent);
    }
    public void fortyeight() {
        Intent intent = new Intent(this, fortyeight.class);
        startActivity(intent);
    }
    public void fortynine() {
        Intent intent = new Intent(this, fortynine.class);
        startActivity(intent);
    }
    public void fifty() {
        Intent intent = new Intent(this, fifty.class);
        startActivity(intent);
    }
    public void fiftyone() {
        Intent intent = new Intent(this, fiftyone.class);
        startActivity(intent);
    }

    public void fiftytwo() {
        Intent intent = new Intent(this, fiftytwo.class);
        startActivity(intent);
    }
    public void fiftythree() {
        Intent intent = new Intent(this, fiftythree.class);
        startActivity(intent);
    }
    public void fiftyfour() {
        Intent intent = new Intent(this, fiftyfour.class);
        startActivity(intent);
    }
    public void fiftyfive() {
        Intent intent = new Intent(this, fiftyfive.class);
        startActivity(intent);
    }
    public void fiftysix() {
        Intent intent = new Intent(this, fiftysix.class);
        startActivity(intent);
    }
    public void fiftyseven() {
        Intent intent = new Intent(this, fiftyseven.class);
        startActivity(intent);
    }
    public void fiftyeight() {
        Intent intent = new Intent(this, fiftyeight.class);
        startActivity(intent);
    }
    public void fiftynine() {
        Intent intent = new Intent(this, fiftynine.class);
        startActivity(intent);
    }
    public void sixty() {
        Intent intent = new Intent(this, sixty.class);
        startActivity(intent);
    }
    public void sixtyone() {
        Intent intent = new Intent(this, sixtyone.class);
        startActivity(intent);
    }
    public void sixtytwo() {
        Intent intent = new Intent(this, sixtytwo.class);
        startActivity(intent);
    }
    public void sixtythree() {
        Intent intent = new Intent(this, sixtythree.class);
        startActivity(intent);
    }
    public void sixtyfour() {
        Intent intent = new Intent(this, sixtyfour.class);
        startActivity(intent);
    }
    public void sixtyfive() {
        Intent intent = new Intent(this, sixtyfive.class);
        startActivity(intent);
    }
    public void sixtyseven() {
        Intent intent = new Intent(this, sixtyseven.class);
        startActivity(intent);
    }
    public void sixtyeight() {
        Intent intent = new Intent(this, sixtyeight.class);
        startActivity(intent);
    }
    public void sixtynine() {
        Intent intent = new Intent(this, sixtynine.class);
        startActivity(intent);
    }
    public void seventy() {
        Intent intent = new Intent(this, seventy.class);
        startActivity(intent);
    }
    public void seventyone() {
        Intent intent = new Intent(this, seventyone.class);
        startActivity(intent);
    }
    public void seventytwo() {
        Intent intent = new Intent(this, seventytwo.class);
        startActivity(intent);
    }
    public void seventythree() {
        Intent intent = new Intent(this, seventythree.class);
        startActivity(intent);
    }
    public void seventyfour() {
        Intent intent = new Intent(this, seventyfour.class);
        startActivity(intent);
    }
    public void seventyfive() {
        Intent intent = new Intent(this, seventyfive.class);
        startActivity(intent);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == NOTIFICATION_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, you can now show notifications
            } else {
                // Permission denied, handle accordingly (e.g., show a message to the user)
            }
        }
    }
}

