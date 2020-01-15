package com.example.queteandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        String lastname = pref.getString("lastname", null);

        CharSequence text = "Bonjour " + lastname + " " + lastname;
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();

    }
}
