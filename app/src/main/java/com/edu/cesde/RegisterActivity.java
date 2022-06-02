package com.edu.cesde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.edu.cesde.databinding.ActivityMainBinding;
import com.edu.cesde.databinding.ActivityRegisterBinding;

import java.security.Key;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding registerBinding;
    BbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = registerBinding.getRoot();
        setContentView(view);
        dbHelper = new BbHelper(this);
    }

    public void registerUser(View view){

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues userData = new ContentValues();
        String Name = registerBinding.etName.getText().toString();
        String email = registerBinding.etEmail.getText().toString();
        String contrasena = registerBinding.etCosntrasena.getText().toString();
        String ciudad = registerBinding.etCiudad.getText().toString();
        String numero = registerBinding.etNumero.getText().toString();
        userData.put("name", Name);
        userData.put("email", email);
        userData.put("password", contrasena);
        userData.put("City", ciudad);
        userData.put("Number", numero);
        long newUser = db.insert("users",null,userData);
        Toast.makeText(this, "" + newUser, Toast.LENGTH_SHORT).show();
    }
}