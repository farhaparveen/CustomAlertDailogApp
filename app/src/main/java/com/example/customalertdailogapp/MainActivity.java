package com.example.customalertdailogapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText email;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                View view= getLayoutInflater().inflate(R.layout.dailog_login,null);
                email=view.findViewById(R.id.editTxt1);
                pass=view.findViewById(R.id.editTxt2);
                Button login=view.findViewById(R.id.btnLogin);
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                      if(!email.getText().toString().isEmpty()&& !pass.getText().toString().isEmpty())
                      {
                          Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                      }
                      else
                      {
                          Toast.makeText(MainActivity.this,"Plz fill empty fields",Toast.LENGTH_SHORT).show();
                      }
                    }
                });

                builder.setView(view);
                builder.show();




            }
        });


    }
}
