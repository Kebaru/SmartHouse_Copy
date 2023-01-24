package com.example.smarthouse.activities;

import static androidx.navigation.Navigation.findNavController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smarthouse.R;
import com.example.smarthouse.databinding.ActivityHomeBinding;
import com.example.smarthouse.fragments.HomeFragment;
import com.example.smarthouse.fragments.RoutinesFragment;
import com.example.smarthouse.fragments.SettingFragment;
import com.example.smarthouse.fragments.StaticsFragment;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.botnav.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.statics:
                    replaceFragment(new StaticsFragment());
                    break;
                case R.id.routines:
                    replaceFragment(new RoutinesFragment());
                    break;
                case R.id.setting:
                    replaceFragment(new SettingFragment());
                    break;
            }

            return true;
        });

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }

    public void toKitchen(View v){
        Intent kitchenIntent = new Intent(this, KitchenActivity.class);
        startActivity(kitchenIntent);
    }
}