package com.example.supermerkadas;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.supermerkadas.db.MiDB;

public class MainActivity extends AppCompatActivity {


    Button btnIniciarSesion;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnRegistrar = findViewById(R.id.btnRegistro);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiDB miDB = new MiDB(MainActivity.this);
                SQLiteDatabase bd = miDB.getWritableDatabase();
                Intent intent = new Intent(MainActivity.this, IniciarSesion.class);
                startActivityIntent.launch(intent);

              // bd.execSQL("INSERT INTO Usuarios ('Nombre','Contraseña') VALUES ('Mikel','123')");
                // bd.delete("Usuarios","Nombre='Mikel'",null);
                //Toast.makeText(MainActivity.this, "Eliminado correctamente",Toast.LENGTH_LONG).show();


            }

        });



        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MiDB miDB = new MiDB(MainActivity.this);
                SQLiteDatabase bd = miDB.getWritableDatabase();
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent);

                // bd.execSQL("INSERT INTO Usuarios ('Nombre','Contraseña') VALUES ('Mikel','123')");
                // bd.delete("Usuarios","Nombre='Mikel'",null);
                //Toast.makeText(MainActivity.this, "Eliminado correctamente",Toast.LENGTH_LONG).show();


            }

        });


    }

    ActivityResultLauncher<Intent> startActivityIntent =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {
                        @Override
                        public void onActivityResult(ActivityResult result) {

                            if (result.getResultCode() == RESULT_OK){

                            }
                        }
                    });

}