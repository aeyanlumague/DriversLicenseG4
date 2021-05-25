package com.example.driverslicence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText mlname,mfname,mmname,mdatebirth,maddress,mnationality,msex;
        Button mregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        mregister = findViewById(R.id.registerBtn);
        mlname = findViewById(R.id.lname);
        mfname = findViewById(R.id.fname);
        mmname = findViewById(R.id.mname);
        mdatebirth = findViewById(R.id.datebirth);
        maddress = findViewById(R.id.address);
        mnationality = findViewById(R.id.nationality);
        msex = findViewById(R.id.sex);

        mregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String lname = mlname.getText().toString();
                String fname = mfname.getText().toString();
                String mname = mmname.getText().toString();
                String datebirth = mdatebirth.getText().toString();
                String ValidAdress = maddress.getText().toString();
                String nationality = mnationality.getText().toString();
                String gender = msex.getText().toString();

                if (lname.isEmpty() && fname.isEmpty() && mname.isEmpty() && datebirth.isEmpty() && ValidAdress.isEmpty() && nationality.isEmpty() && gender.isEmpty()){
                    Toast.makeText(MainActivity.this, "Fill up the form", Toast.LENGTH_LONG).show();
                }else{

                    Intent intent = new Intent(MainActivity.this, driversactivity.class);
                    intent.putExtra("Name", lname+fname+mname);
                    intent.putExtra("Birthday", datebirth);
                    intent.putExtra("Address", ValidAdress);
                    intent.putExtra("Nationality", nationality);
                    intent.putExtra("Gender", gender);

                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}