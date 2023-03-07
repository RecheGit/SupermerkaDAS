package com.example.supermerkadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

public class Catalogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //elementos del list view
        int[] imagenesComida = {R.drawable.aguacate,R.drawable.cestacompra,R.drawable.alitas,R.drawable.pizza,R.drawable.flan,R.drawable.palomitas,R.drawable.rosquilla,R.drawable.donut,R.drawable.sardina};
        String[] nombreComida = {"Aguacate", "Carrito", "Alitas de pollo", "Pizza","Flan de chocolate", "Palomitas", "Rosquillas","Donut", "Sardina"};
        String[] precioComida = {"Precio: 3,25€ ","Precio: 20€ ","Precio: 6€ ","Precio: 1,25€ ","Precio: 2€ ","Precio: 0,75€ ","Precio: 2,20€ ","Precio: 1 ","Precio: 7.50 "};
        String[] cantidad = {"0","0","0","0","0","0","0","0","0"};
        Button btnmas = new Button(this);
        Button btnmenos = new Button(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        ListView catalogo = (ListView) findViewById(R.id.listView);
        AdaptadorListViewCatalogo eladap = new AdaptadorListViewCatalogo(getApplicationContext(),nombreComida,precioComida,imagenesComida,btnmas,btnmenos,cantidad);
        catalogo.setAdapter(eladap);


        /*

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Catalogo">



        <ListView
            android:id="@+id/listView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:layout_editor_absoluteX="-60dp"
            tools:layout_editor_absoluteY="-43dp"
            android:scrollbars="vertical"
            android:scrollbarStyle="insideInset"
            android:fadeScrollbars="false"
            android:scrollbarSize="12dp"
            android:scrollbarThumbVertical="@android:color/darker_gray"
            />


    <ImageView
            android:id="@+id/imageView2"
            android:layout_width="92dp"
            android:layout_height="79dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.006"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.079" />

        <TextView
            android:id="@+id/textoNombre"
            android:layout_width="198dp"
            android:layout_height="72dp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.056"
            app:layout_constraintStart_toEndOf="@+id/imageView2"
            app:layout_constraintTop_toTopOf="parent" />

        <TextView
            android:id="@+id/textoPrecio"
            android:layout_width="95dp"
            android:layout_height="29dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toStartOf="@+id/checkBox"
            app:layout_constraintHorizontal_bias="0.245"
            app:layout_constraintStart_toEndOf="@+id/imageView2"
            app:layout_constraintTop_toBottomOf="@+id/textoNombre" />

        <CheckBox
            android:id="@+id/checkBox"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:visibility="invisible"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.816"
            app:layout_constraintStart_toEndOf="@+id/imageView2"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.096" />
</androidx.constraintlayout.widget.ConstraintLayout>





         */
        /*
         <Button
        android:id="@+id/button4"
        android:layout_width="201dp"
        android:layout_height="64dp"
        android:layout_marginBottom="16dp"
        android:text="Button"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/textoPrecio"
        android:layout_width="156dp"
        android:layout_height="33dp"
        android:layout_marginEnd="108dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textoNombre" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="104dp"
        android:layout_height="98dp"
        android:layout_marginStart="3dp"
        android:layout_marginTop="7dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textoNombre"
        android:layout_width="156dp"
        android:layout_height="32dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="4dp"
        app:layout_constraintStart_toEndOf="@+id/imageView2"
        app:layout_constraintTop_toTopOf="parent" />

    <CheckBox
        android:id="@+id/checkBox"
        android:layout_width="155dp"
        android:layout_height="69dp"
        android:layout_marginTop="36dp"
        android:layout_marginEnd="21dp"
        android:visibility="invisible"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ListView
        android:id="@+id/listView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fadeScrollbars="false"
        android:scrollbarSize="12dp"
        android:scrollbarStyle="insideInset"
        android:scrollbarThumbVertical="@android:color/darker_gray"
        android:scrollbars="vertical"
        tools:layout_editor_absoluteX="3dp"
        tools:layout_editor_absoluteY="0dp" />
         */
    }




}