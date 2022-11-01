package com.example.smarthouse.activities;

import static androidx.navigation.Navigation.findNavController;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smarthouse.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void toKitchen(View v){
        Intent kitchenIntent = new Intent(this, KitchenActivity.class);
        startActivity(kitchenIntent);
    }
}