package com.example.smarthouse;

import static androidx.navigation.Navigation.findNavController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

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