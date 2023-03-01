package com.example.supermerkadas;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.supermerkadas.R;
import com.example.supermerkadas.db.MiDB;

public class IniciarSesion extends AppCompatActivity {

     Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        btnAceptar = findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiDB miDB = new MiDB(IniciarSesion.this);
                SQLiteDatabase bd = miDB.getWritableDatabase();


                String[] campos = new String[] {"Nombre"};
                String[] argumentos = new String[] {"Mikel"};
                Cursor cu = bd.query("Usuarios",campos,"Nombre=?",argumentos,null,null,null);
                while (cu.moveToNext()) {
                    String Nom = cu.getString(0);//el numero depende del numero de columnas que consiga el cursor
                    if (Nom.equals("Mikel")){

                        Toast.makeText(IniciarSesion.this, "Funciona",Toast.LENGTH_LONG).show();

                    }
                }

               // bd.execSQL("INSERT INTO Usuarios ('Nombre','Contraseña') VALUES ('Mikel','123')");
               /* Cursor c = bd.rawQuery("SELECT Nombre FROM Usuarios WHERE Nombre='Mikel'", null);
                c.moveToNext();
                if (c.getString(1) !=null){

                    Toast.makeText(IniciarSesion.this, "Funciona",Toast.LENGTH_LONG).show();

                }*/
                    /*
                    if(Nom != null){

                        Toast.makeText(IniciarSesion.this, "Funciona",Toast.LENGTH_LONG).show();

                    }
                    else{
                        Toast.makeText(IniciarSesion.this, "Noooooooo",Toast.LENGTH_LONG).show();

                    }*/



            }
        });
    }

}