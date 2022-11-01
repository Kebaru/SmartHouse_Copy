package com.example.smarthouse.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smarthouse.R;
import com.example.smarthouse.activities.HomeActivity;
import com.example.smarthouse.activities.RegistrationActivity;

public class Splash extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_login);
    }

    public void toRegistration(View v){
        Intent registerIntent = new Intent(this, RegistrationActivity.class);
        startActivity(registerIntent);
    }

    public void toHome(View v){
        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);
    }
}
