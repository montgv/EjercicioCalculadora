package com.example.ejerciciocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.ejerciciocalculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int numero1, numero2, operacion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.idBoton0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBoton0.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton0.getText().toString()));
                }
            }
        });

        binding.idBoton1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0){
                    binding.idResultado.setText(binding.idBoton1.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton1.getText().toString()));
                }
            }
        });

        binding.idBoton2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBoton2.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton2.getText().toString()));
                }
            }
        });

        binding.idBoton3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBoton3.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton3.getText().toString()));
                }
            }
        });

        binding.idBoton4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBoton4.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton4.getText().toString()));
                }
            }
        });

        binding.idBoton5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBoton5.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton5.getText().toString()));
                }
            }
        });

        binding.idBoton6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBoton6.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton6.getText().toString()));
                }
            }
        });

        binding.idBoton7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBoton7.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton7.getText().toString()));
                }
            }
        });

        binding.idBoton8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().charAt(0) == 0) {
                    binding.idResultado.setText(binding.idBoton8.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton8.getText().toString()));
                }
            }
        });

        binding.idBoton9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().charAt(0) == 0) {
                    binding.idResultado.setText(binding.idBoton9.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton9.getText().toString()));
                }
            }
        });

        binding.idBotonMas.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBotonMas.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonMas.getText().toString()));
                }
            }
        });

        binding.idBotonMenos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBotonMenos.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonMenos.getText().toString()));
                }
            }
        });

        binding.idBotonPor.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBotonPor.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonPor.getText().toString()));
                }
            }
        });

        binding.idBotonDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.toString().length() == 0) {
                    binding.idResultado.setText(binding.idBotonDivide.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonDivide.getText().toString()));
                }
            }
        });

        binding.idBotonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pantalla = binding.idResultado.getText().toString();
                String[] numSeparados = pantalla.split("\\+-\\*/");
                numero1 = Integer.parseInt(numSeparados[0]);
                numero2 = Integer.parseInt(numSeparados[1]);

                if (binding.idResultado.getText().toString().contains("+")) {
                    operacion = numero1 + numero2;
                    binding.idResultado.setText(operacion);
                } else if (binding.idResultado.getText().toString().contains("-")) {
                    operacion = numero1 - numero2;
                    binding.idResultado.setText(operacion);
                } else if (binding.idResultado.getText().toString().contains("*")) {
                    operacion = numero1 * numero2;
                    binding.idResultado.setText(operacion);
                } else if (binding.idResultado.getText().toString().contains("/")) {
                    operacion = numero1 / numero2;
                    binding.idResultado.setText(operacion);
                }
            }
        });

        binding.idResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = 0;
                numero2 = 0;

                binding.idResultado.setText("");
            }
        });
    }

}