package com.example.supermerkadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Catalogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //elementos del list view
        int[] imagenesComida = {R.drawable.aguacate,R.drawable.cestacompra};
        String[] nombreComida = {"Aguacate", "Carrito"};
        String[] precioComida = {"3","20"};


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        ListView catalogo = (ListView) findViewById(R.id.listView);
        AdaptadorListViewCatalogo eladap = new AdaptadorListViewCatalogo(getApplicationContext(),nombreComida,precioComida,imagenesComida);
        catalogo.setAdapter(eladap);



    }
}