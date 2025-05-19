package com.Zumpy.zumpy;

import androidx.appcompat.app.AppCompatActivity;
import com.RMD.zumpy.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Window window = getWindow() ;

        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        Thread splashTread = new Thread(){


            @Override

            public void run() {

                try {

                    sleep(5000);

                    startActivity(new Intent(getApplicationContext(), dashboard.class));

                    finish();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }
                super.run();
            }
        };
        splashTread.start();
    }
}