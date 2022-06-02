package com.edu.cesde;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.cesde.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  {

    private ActivityMainBinding MainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = MainBinding.getRoot();
        setContentView(view);
        //MainBinding.btnSignIn.setOnClickListener(this);
        //MainBinding.btnSignUp.setOnClickListener(this);
    }
    
    public void showMessage(){
        Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show();
    }

    public void showMessage2(){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void goToRegister(View view){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

   /* @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSignIn:
                showMessage();
                break;

            case R.id.btnSignUp:
                showMessage2();
                break;
        }
    }*/
}