package com.example.holysinnersco;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.holysinnersco.ui.home.HomeFragment;

import java.util.Set;

public class BuyActivity extends AppCompatActivity
{
    EditText mRecipientEt, mMessageEt1, mMessageEt2, mMessageEt3;
    Button mSendEmailBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        mRecipientEt = findViewById(R.id.recipienEt);
        mMessageEt1 = findViewById(R.id.messageEt1);
        mMessageEt2 = findViewById(R.id.messageEt2);
        mMessageEt3 = findViewById(R.id.messageEt3);
        mSendEmailBtn = findViewById(R.id.sendEmailBtn);

        mSendEmailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipient = mRecipientEt.getText().toString().trim();
                String subject = mMessageEt1.getText().toString().trim();
                String message = mMessageEt2.getText().toString().trim();
                String message1 = mMessageEt3.getText().toString().trim();

                sendEmail(recipient, subject, message, message1);

                Toast.makeText(BuyActivity.this, "Barang Siap Dikirim", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void sendEmail(String recipient, String subject, String message, String message1)
    {
        Intent mEmailIntent = new Intent(Intent.ACTION_SEND);

        mEmailIntent.setData(Uri.parse("mail to: "));
        mEmailIntent.setType("text/plain");

        mEmailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"anthoius1213@gmail.com"});
        mEmailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        mEmailIntent.putExtra(Intent.EXTRA_TEXT, message + message1);

        try {
            startActivity(Intent.createChooser(mEmailIntent, "Choose an Email"));

        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();



        }
    }
}


