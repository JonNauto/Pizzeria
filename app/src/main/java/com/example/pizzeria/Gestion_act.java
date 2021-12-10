package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Models.Pizzas;

public class Gestion_act extends AppCompatActivity {

    private EditText name , pre , loca;
    private Button btn;

    FirebaseDatabase firebase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

        name = findViewById(R.id.nombre);
        pre = findViewById(R.id.precio);
        loca = findViewById(R.id.localizacion);
        btn = findViewById(R.id.añadir);

        obtenerDatabase();

        //Añadir
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Pizzas p = new Pizzas();

                p.setId(UUID.randomUUID().toString());
                p.setNombre(name.getText().toString());
                p.setPrecio(pre.getText().toString());
                p.setLocalizacion(loca.getText().toString());

                databaseReference.child("Pizzas").child(p.getId()).setValue(p);
                Toast.makeText(getBaseContext(), "Has añadido", Toast.LENGTH_SHORT).show();
            }


        });
    }







    public void obtenerDatabase()
    {
        FirebaseApp.initializeApp(this);
        firebase = FirebaseDatabase.getInstance();
        databaseReference = firebase.getReference();

    }
}