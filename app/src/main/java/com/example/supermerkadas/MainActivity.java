package com.example.supermerkadas;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.supermerkadas.db.MiDB;

public class MainActivity extends AppCompatActivity {


    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCrear = findViewById(R.id.button);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiDB miDB = new MiDB(MainActivity.this);
                SQLiteDatabase bd = miDB.getWritableDatabase();/*

                if (bd != null){

                    Toast.makeText(MainActivity.this, "Creado correctamente",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Creado Incorrectamente",Toast.LENGTH_LONG).show();
                }
                */
              // bd.execSQL("INSERT INTO Usuarios ('Nombre','Contraseña') VALUES ('Mikel','123')");
                // bd.delete("Usuarios","Nombre='Mikel'",null);
                //Toast.makeText(MainActivity.this, "Eliminado correctamente",Toast.LENGTH_LONG).show();


            }

        });


    }
}