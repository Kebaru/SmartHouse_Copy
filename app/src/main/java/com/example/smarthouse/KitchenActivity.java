package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KitchenActivity extends AppCompatActivity {

    Button lightBtn, thermoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        lightBtn = findViewById(R.id.lightbutton);
        thermoBtn = findViewById(R.id.thermobutton);

        lightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new light_frament)
            }
        });

        thermoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new thermo_frament)
            }
        });
    }

    private void replaceFragment(Fragment fragment){

    }
}