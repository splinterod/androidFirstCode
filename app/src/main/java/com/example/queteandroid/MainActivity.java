package com.example.queteandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private EditText lastname;
    private EditText firstname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        String lastname = pref.getString("lastname", null);

        if (lastname != null) {
            EditText edtText = (EditText) findViewById(R.id.editText2);
            edtText.setText("Déja venu, " + lastname);
        }

        addListenerOnButton();


    }


    public void addListenerOnButton() {

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {


                lastname = (EditText) findViewById(R.id.editText1);


                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("lastname", lastname.getText().toString()); // Storing boolean - true/false
                editor.commit(); // commit changes

                Intent message = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(message);


            }

        });

    }
}