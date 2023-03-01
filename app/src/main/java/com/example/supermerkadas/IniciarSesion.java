package com.example.supermerkadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.supermerkadas.R;
import com.example.supermerkadas.db.MiDB;

public class IniciarSesion extends AppCompatActivity {

     Button btnAceptar;
     EditText textoPwd;
     EditText textoUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        btnAceptar = findViewById(R.id.btnAceptar);
        textoPwd = findViewById(R.id.textoPWD);
        textoUser = findViewById(R.id.textoUsuario);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Conectamos con la BD
                MiDB miDB = new MiDB(IniciarSesion.this);
                SQLiteDatabase bd = miDB.getWritableDatabase();


                //Comprobamos que usuario y contraseña son correctos

                String[] campos = new String[] {"Nombre","Contraseña"};
                String[] argumentos = new String[] {textoUser.getText().toString(),textoPwd.getText().toString()};
                Cursor cu = bd.query("Usuarios",campos,"Nombre=? and Contraseña=?",argumentos,null,null,null);


                //Si no se ha encontrado usuario que coincida con los datos introducidos:

                if (cu.getCount()==0){

                    UsuarioIncorrecto incorrecto = new UsuarioIncorrecto();
                    incorrecto.show(getSupportFragmentManager(),"error");
                }
                else {
                    Intent intent = new Intent(IniciarSesion.this, MenuUsuario.class);
                    startActivity(intent);

                }
            }
        });
    }

}