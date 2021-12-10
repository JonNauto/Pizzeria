package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import Models.Adicio;
import Models.Pizzas;

public class MainActivity extends AppCompatActivity {

    private Pizzas ar = new Pizzas();
    private Adicio a = new Adicio();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }


    //Intents para navegar

    public void Gestion(View view)
    {

        Intent i = new Intent(getBaseContext(),Gestion_act.class);
        startActivity(i);
    }


    public void Listado(View view)
    {

        Intent i = new Intent(getBaseContext(),Listado_act.class);
        startActivity(i);
    }

    public void Armar(View view)
    {


        Intent i = new Intent(this, Arma_pizza_act.class);

        Bundle bun = new Bundle();
        bun.putStringArray("pizzas",  ar.getT_pizza());
        bun.putStringArray("adicio", a.getAdicio());
        i.putExtras(bun);




        startActivity(i);
    }

    public void Facebook(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(i);

    }

    public void Youtube(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com/"));
        startActivity(i);


    }
    public void Twitter(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.twitter.com/"));
        startActivity(i);


    }
    public void Instagram(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.instagram.com/"));
        startActivity(i);


    }



}