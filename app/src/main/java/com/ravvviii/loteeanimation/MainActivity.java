package com.ravvviii.loteeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView loteePaymentanimation;
    Button btnPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPayment = findViewById(R.id.btnPayment);
        loteePaymentanimation = findViewById(R.id.loteePaymentanimation);

        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loteePaymentanimation.setAnimation(R.raw.payment_sucessfull);
                loteePaymentanimation.playAnimation();

            }
        });

    }
}