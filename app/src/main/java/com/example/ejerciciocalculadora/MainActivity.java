package com.example.ejerciciocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.ejerciciocalculadora.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    //Creamos el binding que nos sirve para la vinculación de la vista
    private ActivityMainBinding binding;

    //Creamos la diferentes variables que las vamos a usar para las operaciones
    private int numero1, numero2, operacion = 0;

    //Este es el metodo que se llama para que comienze el activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Estas tres lineas hace que se nos vincule las vistas con el activity
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton0.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton0.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton0.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton1.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")){
                    binding.idResultado.setText(binding.idBoton1.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton1.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton2.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton2.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton2.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton3.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton3.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton3.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton4.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton4.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton4.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton5.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton5.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton5.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton6.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton6.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton6.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton7.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton7.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton7.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton8.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton8.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton8.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado cambiamos para que ponga el texto de ese boton, sino en idResultado
        // cambiamos para que se añada a lo que tiene, el texto de ese boton.
        binding.idBoton9.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBoton9.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBoton9.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado muestre su contenido, sino en idResultado cambiamos para que se añada a lo
        //que tiene, el texto de ese boton.
        binding.idBotonMas.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.getText();
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonMas.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado muestre su contenido, sino en idResultado cambiamos para que se añada a lo
        //que tiene, el texto de ese boton.
        binding.idBotonMenos.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBotonMenos.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonMenos.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado muestre su contenido, sino en idResultado cambiamos para que se añada a lo
        //que tiene, el texto de ese boton.
        binding.idBotonPor.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBotonPor.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonPor.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón si idResultado contiene un 0 entonces
        //en idResultado muestre su contenido, sino en idResultado cambiamos para que se añada a lo
        //que tiene, el texto de ese boton.
        binding.idBotonDivide.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (binding.idResultado.getText().toString().equals("0")) {
                    binding.idResultado.setText(binding.idBotonDivide.getText());
                } else {
                    binding.idResultado.setText((binding.idResultado.getText().toString()) +
                            (binding.idBotonDivide.getText().toString()));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón, comento linea a linea.
        binding.idBotonIgual.setOnClickListener(new View.OnClickListener() {
            //Indica que se debe ignorar las advertencias especificas
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                //Declaramos una variable de tipo string que contiene lo que tiene idResultado en
                //ese momento.
                String pantalla = binding.idResultado.getText().toString();
                //Declaramos un array de string para que guarde los diferentes operadores
                String[] operadores = new String[]{"\\+", "\\-", "\\/", "\\*"};
                //Declaramos un array de string para que con ayuda del metodo split separemos los
                //numeros del operador de la variable pantalla
                String[] numSeparados = pantalla.split(Arrays.toString(operadores));
                numero1 = Integer.parseInt(numSeparados[0]);
                numero2 = Integer.parseInt(numSeparados[1]);

                //Si idResultado asociado al binding devuelve su texto y contiene el operador indicado
                //entonces dependiendo de cual sea el operador se realiza la operacion y despues
                //cambiamos idResultado con setText y como operacion es un numero, lo convertimos a
                //string
                if (binding.idResultado.getText().toString().contains("+")) {
                    operacion = numero1 + numero2;
                    binding.idResultado.setText(String.valueOf(operacion));
                } else if (binding.idResultado.getText().toString().contains("-")) {
                    operacion = numero1 - numero2;
                    binding.idResultado.setText(String.valueOf(operacion));
                } else if (binding.idResultado.getText().toString().contains("*")) {
                    operacion = numero1 * numero2;
                    binding.idResultado.setText(String.valueOf(operacion));
                } else if (binding.idResultado.getText().toString().contains("/")) {
                    operacion = numero1 / numero2;
                    binding.idResultado.setText(String.valueOf(operacion));
                }
            }
        });

        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al
        //boton que se ve y al binding, cuando se pulse el botón, las variable que se ven se inicializan
        //a 0, y idResultado asociado al binding con el metodo setText cambiamos el texto a 0,
        // es una manera de borrar los datos.
        binding.idResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = 0;
                numero2 = 0;

                binding.idResultado.setText("0");
            }
        });
    }
}