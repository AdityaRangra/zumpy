package com.Zumpy.zumpy;

import com.RMD.zumpy.R;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    EditText enternum;
    Button getotp;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);

        enternum = findViewById(R.id.enter_mobile);
        getotp = findViewById(R.id.button);

        ProgressBar proggbar = findViewById(R.id.progbar);
        getotp.setOnClickListener((v) -> {

            if (!enternum.getText().toString().trim().isEmpty()) {
                if ((enternum.getText().toString().trim()).length() == 10) {
                    proggbar.setVisibility(View.VISIBLE);
                    getotp.setVisibility(View.INVISIBLE);

                    PhoneAuthProvider.getInstance().verifyPhoneNumber(
                            "+91" + enternum.getText().toString(),
                            60,
                            TimeUnit.SECONDS,
                            MainActivity.this,
                            new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                @Override
                                public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                    proggbar.setVisibility(View.GONE);
                                    getotp.setVisibility(View.VISIBLE);
                                }

                                @Override
                                public void onVerificationFailed(@NonNull FirebaseException e) {
                                    proggbar.setVisibility(View.GONE);
                                    getotp.setVisibility(View.VISIBLE);
                                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onCodeSent(@NonNull String backendotp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                    proggbar.setVisibility(View.GONE);
                                    getotp.setVisibility(View.VISIBLE);
                                    Intent intent = new Intent(getApplicationContext(), verificationotp.class);
                                    intent.putExtra("mobile", enternum.getText().toString());
                                    intent.putExtra("back", backendotp);
                                    startActivity(intent);
                                }
                            }
                    );
                } else {
                    Toast.makeText(MainActivity.this, "Please enter correct number", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "Enter mobile number", Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dashboard();
            }
        });
    }
        public void dashboard(){
            Intent intent = new Intent(this, dashboard.class);
            startActivity(intent);

        }
    }

