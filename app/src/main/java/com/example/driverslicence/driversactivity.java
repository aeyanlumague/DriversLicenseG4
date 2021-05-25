package com.example.driverslicence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class driversactivity extends AppCompatActivity {

        TextView namelDri,addressDri,birthdateDri,nationalityDri,genderDri;
        Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driversactivity);
        getSupportActionBar().hide();

        // getting text from registration form
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String birthdate = intent.getStringExtra("Birthday");
        String address = intent.getStringExtra("Address");
        String nationality = intent.getStringExtra("Nationality");
        String gender = intent.getStringExtra("Gender");

       //linking the id's in driversactivity
        namelDri = findViewById(R.id.lastname);
        addressDri = findViewById(R.id.addressact);
        birthdateDri = findViewById(R.id.datebrt);
        nationalityDri = findViewById(R.id.ntlity);
        genderDri = findViewById(R.id.six);
        logoutBtn = findViewById(R.id.logoutBtn);

        //setting text
        namelDri.setText(name);
        addressDri.setText(address);
        birthdateDri.setText(birthdate);
        nationalityDri.setText(nationality);
        genderDri.setText(gender);

        //for logoutbutton
        logoutBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent intent = new Intent(driversactivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}