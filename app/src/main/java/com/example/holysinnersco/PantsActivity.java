package com.example.holysinnersco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantsActivity extends AppCompatActivity {

    private Button BuyIt1;
    private Button BuyIt2;
    private Button BuyIt3;
    private Button BuyIt4;
    private Button BuyIt5;
    private Button BuyIt6;
    private Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pants);

        BuyIt1 = (Button) findViewById(R.id.harga_1_btn);
        BuyIt2 = (Button) findViewById(R.id.harga_2_btn);
        BuyIt3 = (Button) findViewById(R.id.harga_3_btn);
        BuyIt4 = (Button) findViewById(R.id.harga_4_btn);
        BuyIt5 = (Button) findViewById(R.id.harga_5_btn);
        BuyIt6 = (Button) findViewById(R.id.harga_6_btn);
        Back = (Button) findViewById(R.id.back_btn);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        BuyIt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantsActivity.this, BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantsActivity.this, BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantsActivity.this, BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantsActivity.this, BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantsActivity.this, BuyActivity.class);
                startActivity(intent);
            }
        });

        BuyIt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantsActivity.this, BuyActivity.class);
                startActivity(intent);
            }
        });




    }
}

