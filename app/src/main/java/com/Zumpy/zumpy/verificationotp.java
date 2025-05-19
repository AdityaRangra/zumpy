package com.Zumpy.zumpy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.RMD.zumpy.R;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class verificationotp extends AppCompatActivity {

    EditText num1, num2, num3, num4, num5, num6;
    String getotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificationotp);

        final Button verifybutton = findViewById(R.id.otp_button);
        final ProgressBar progressBar = findViewById(R.id.progbar);

        num1 = findViewById(R.id.ed1);
        num2 = findViewById(R.id.ed2);
        num3 = findViewById(R.id.ed3);
        num4 = findViewById(R.id.ed4);
        num5 = findViewById(R.id.ed5);
        num6 = findViewById(R.id.ed6);

      //TextView textView = findViewById(R.id.enter_mobile);

        getotp = getIntent().getStringExtra("back");

        verifybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (!num1.getText().toString().trim().isEmpty() && !num2.getText().toString().trim().isEmpty() && !num3.getText().toString().trim().isEmpty() && !num4.getText().toString().trim().isEmpty() && !num5.getText().toString().trim().isEmpty() && !num6.getText().toString().trim().isEmpty()) {
                    String entercodeotp = num1.getText().toString() +
                            num2.getText().toString() +
                            num3.getText().toString() +
                            num4.getText().toString() +
                            num5.getText().toString() +
                            num6.getText().toString();

                    if (getotp != null) {
                        progressBar.setVisibility(View.VISIBLE);
                        verifybutton.setVisibility(View.INVISIBLE);

                        PhoneAuthCredential phonecred = PhoneAuthProvider.getCredential(
                                getotp, entercodeotp
                        );

                        FirebaseAuth.getInstance().signInWithCredential(phonecred)
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {

                                        progressBar.setVisibility(View.GONE);
                                        verifybutton.setVisibility(View.VISIBLE);

                                        if (task.isSuccessful()) {
                                            Intent intent = new Intent(getApplicationContext(),dashboard.class);
                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                            startActivity(intent);
                                        } else {
                                            Toast.makeText(verificationotp.this, "Enter correct otp", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                    } else {
                        Toast.makeText(verificationotp.this, "Please check internet connection", Toast.LENGTH_SHORT).show();
                    }

                    //        Toast.makeText(verificationotp.this,"otp verify",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(verificationotp.this, "please enter all number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        numberotpmove();

        TextView resendlabel;
        resendlabel = findViewById(R.id.resend);

        resendlabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhoneAuthProvider.getInstance().verifyPhoneNumber(
                        "+91" + getIntent().getStringExtra("mobile"),
                        60,
                        TimeUnit.SECONDS,
                        verificationotp.this,
                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {

                                Toast.makeText(verificationotp.this, "error", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCodeSent(@NonNull String newbackendotp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                getotp = newbackendotp;
                                Toast.makeText(verificationotp.this, "OTP sent successfully", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
            }
        });
    }

    private void numberotpmove() {
        num1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()) {
                    num2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        num2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()) {
                    num3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        num3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()) {
                    num4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        num4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()) {
                    num5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        num5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().isEmpty()) {
                    num6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}