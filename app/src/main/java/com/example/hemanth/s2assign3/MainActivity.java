package com.example.hemanth.s2assign3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);


    }

    public void login(View view){
        if (email.length()!= 0 && password.length()!=0){
            Toast.makeText(this,"Successfull",Toast.LENGTH_LONG).show();
        }else
        {
            Toast.makeText(this,"Please enter Something",Toast.LENGTH_LONG).show();
        }
    }
}
