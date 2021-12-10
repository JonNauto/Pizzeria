package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import Models.Adicio;
import Models.Pizzas;

public class Arma_pizza_act extends AppCompatActivity {

    private Spinner tpiza,tpizza;
    private Spinner precio;
    private TextView result,resultt,resulttt;
    Pizzas ar = new Pizzas();
    Adicio a = new Adicio();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arma_pizza);

        tpiza = findViewById(R.id.sp1);
        tpizza = findViewById(R.id.sp2);
        result = findViewById(R.id.txt1);
        resultt = findViewById(R.id.txt2);
        resulttt= findViewById(R.id.txt3);

        Bundle bun = getIntent().getExtras();
        Bundle bune = getIntent().getExtras();

        String[] listado = bun.getStringArray("pizzas");
        String[] listado2 = bun.getStringArray("adicio");



        ArrayAdapter adaptpizza = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listado);
        tpiza.setAdapter(adaptpizza);

        ArrayAdapter adaptpi= new ArrayAdapter(this, android.R.layout.simple_list_item_1,listado2);
        tpizza.setAdapter(adaptpi);




    }

    public void calcular(View view) {
        String opcion = tpiza.getSelectedItem().toString();

        int resultado = 0;

        for (int i = 0; i < opcion.length(); i++) {
            if (opcion.equals(ar.getT_pizza()[i])) {
                resultado = ar.getP_pizza()[i];
                result.setText("Precio Pizza: " + resultado);
                break;

            }

        }

        String opcion2 = tpizza.getSelectedItem().toString();

        int resultado2 = 0;

        for (int i = 0; i < opcion2.length(); i++) {
            if (opcion2.equals(a.getAdicio()[i])) {
                resultado2 = a.getAdicionam()[i];
                resultt.setText("Costo adicional: " + resultado2);
                break;

            }

        }


    }

}