package com.example.supermerkadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListView;

public class Catalogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //elementos del list view
        int[] imagenesComida = {R.drawable.aguacate,R.drawable.cestacompra,R.drawable.alitas,R.drawable.pizza,R.drawable.flan,R.drawable.palomitas,R.drawable.rosquilla,R.drawable.donut,R.drawable.sardina};
        String[] nombreComida = {"Aguacate", "Carrito", "Alitas de pollo", "Pizza","Flan de chocolate", "Palomitas", "Rosquillas","Donut", "Sardina"};
        String[] precioComida = {"Precio: 3,25€ ","Precio: 20€ ","Precio: 6€ ","Precio: 1,25€ ","Precio: 2€ ","Precio: 0,75€ ","Precio: 2,20€ ","Precio: 1 ","Precio: 7.50 "};
        CheckBox box = new CheckBox(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        ListView catalogo = (ListView) findViewById(R.id.listView);
        AdaptadorListViewCatalogo eladap = new AdaptadorListViewCatalogo(getApplicationContext(),nombreComida,precioComida,imagenesComida,box);
        catalogo.setAdapter(eladap);


        /*







         */



    }
}