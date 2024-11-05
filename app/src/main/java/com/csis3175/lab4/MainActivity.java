package com.csis3175.lab4;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.csis3175.lab4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MainFragment()).commit();

        Button vancouverButton = findViewById(R.id.btn_vancouver);
        Button surreyButton = findViewById(R.id.btn_surrey);
        Button richmondButton = findViewById(R.id.btn_richmond);

        vancouverButton.setOnClickListener(v -> switchFragmentTo(new VancouverFragment()));
        surreyButton.setOnClickListener(v -> switchFragmentTo(new SurreyFragment()));
        richmondButton.setOnClickListener(v -> switchFragmentTo(new RichmondFragment()));
    }

    private void switchFragmentTo(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }


}