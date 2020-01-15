package com.example.queteandroid;

import android.content.Intent;
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


        addListenerOnButton();

    }

    public void addListenerOnButton() {

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

//                diaplying une petite alert (Toast)


                lastname = (EditText) findViewById(R.id.editText1);
                firstname = (EditText) findViewById(R.id.editText2);

                Intent message = new Intent(MainActivity.this, HomeActivity.class);
                message.putExtra("LASTNAME", lastname.getText().toString());
                message.putExtra("FIRSTNAME", firstname.getText().toString());
                startActivity(message);



            }

        });

    }
}