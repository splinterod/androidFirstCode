package com.example.queteandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Intent intent = getIntent();
        String lastname = intent.getStringExtra("FIRSTNAME");
        String firstname = intent.getStringExtra("LASTNAME");

        Context context = getApplicationContext();

        CharSequence text = "Bonjour " + lastname + " " + firstname;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
