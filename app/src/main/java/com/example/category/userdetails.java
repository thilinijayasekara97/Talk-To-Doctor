package com.example.category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userdetails extends AppCompatActivity {

    private Button btnproceed , foriegn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetails);

        btnproceed = (Button) findViewById(R.id.button5);
        foriegn = (Button) findViewById(R.id.button3);

        btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaymentMethod();
            }
        });

        foriegn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openforienuser();
            }
        });
    }

    public void openforienuser(){
        Intent intent = new Intent(userdetails.this, userdetailsforiegn.class);
        startActivity(intent);
    }

    public void openPaymentMethod() {

        final EditText patienttxt = findViewById(R.id.editTextTextPatient);
        final EditText nictxt = findViewById(R.id.editTextTextexp);
        final EditText telephonetxt = findViewById(R.id.editTextTexttelephone);
        final EditText emailtxt = findViewById(R.id.editTextTextemail);

        btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String patient = "Jagath";
                String nic = "978321046V";
                String tele = "0710525884";
                String email = "thili@gmail.com";

                if ((patient.equals(patienttxt.getText().toString())) && (nic.equals(nictxt.getText().toString())) && (tele.equals(telephonetxt.getText().toString()))
                        && (email.equals(emailtxt.getText().toString()))) {
                    Intent intent = new Intent(userdetails.this, paymentMethod.class);
                    startActivity(intent);
                    Toast.makeText(userdetails.this, "processing", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(userdetails.this, "Failed !", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}