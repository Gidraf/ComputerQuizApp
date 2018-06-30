package com.example.android.educationalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView q1,q2,q3,q4,q5;
    EditText a1,a2,a3,a4,a5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1=findViewById(R.id.q1);
        q2=findViewById(R.id.q2);
        q3=findViewById(R.id.q3);
        q4=findViewById(R.id.q4);
        q5=findViewById(R.id.q5);

        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5);

        if(!a1.getText().toString().isEmpty() && !a2.getText().toString().isEmpty()
        &&!a2.getText().toString().isEmpty() && !a2.getText().toString().isEmpty() &&!a2.getText().toString().isEmpty()){
            Toast.makeText(this,"Please aswer alll the question",Toast.LENGTH_LONG).show();
        }
    }
}
