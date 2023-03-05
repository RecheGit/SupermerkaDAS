package com.example.supermerkadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.supermerkadas.db.MiDB;

public class Registro extends AppCompatActivity {

    Button btnRegistrar;
   private EditText textoNombreUsuario;
   private EditText textoPWD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistrar = findViewById(R.id.btnEnviarRegistro);
        textoNombreUsuario = findViewById(R.id.editTextTextPersonName2);
        textoPWD = findViewById(R.id.editTextTextPassword);


        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiDB miDB = new MiDB(Registro.this);
                SQLiteDatabase bd = miDB.getWritableDatabase();

                //Comprobamos si se han añadido los datos
                if(!textoNombreUsuario.getText().toString().equals("") && !textoPWD.getText().toString().equals("")){

                    ContentValues nuevo = new ContentValues();
                    nuevo.put("Nombre", textoNombreUsuario.getText().toString());
                    nuevo.put("Contraseña",textoPWD.getText().toString());
                    bd.insert("Usuarios", null, nuevo);


                    Toast.makeText(Registro.this, "REGISTRADO CORRECTAMENTE",Toast.LENGTH_LONG).show();


                    Intent intent = new Intent(Registro.this, Catalogo.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Registro.this, "RELLENA TODOS LOS CAMPOS",Toast.LENGTH_LONG).show();                }
            }
        });

    }
}