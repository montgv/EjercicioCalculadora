package com.example.ejerciciocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejerciciocalculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}