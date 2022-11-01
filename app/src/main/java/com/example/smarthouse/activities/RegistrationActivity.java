package com.example.smarthouse.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smarthouse.R;
import com.example.smarthouse.activities.HomeActivity;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void toHome(View v){
        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);
    }
}