package com.example.supermerkadas;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AdaptadorListViewCatalogo extends BaseAdapter {

    //Datos a mostrar

    private Context contexto;
    private LayoutInflater inflater;
    private String[] nombreComida;
    private String[] precioComida;
    private int[] imagenesComida;
    private Button btnmas;
    private Button btnmenos;
    private String[] cantidad;

    //Constructora

    public AdaptadorListViewCatalogo(Context pContext, String[] pNombreComida, String[] pPrecioComida, int[] pImagenesComida, Button pBtnmas, Button pBtnmenos, String[] pCantidad){

        contexto = pContext;
        nombreComida = pNombreComida;
        imagenesComida = pImagenesComida;
        precioComida = pPrecioComida;
        btnmas = pBtnmas;
        btnmas =pBtnmenos;
        cantidad=pCantidad;
        inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }



    @Override
    public int getCount() {
        return nombreComida.length;
    }

    @Override
    public Object getItem(int i) {
        return nombreComida[i];
    }

    @Override
    public long getItemId(int i) {
        return i ;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view =inflater.inflate(R.layout.activity_catalogo,null);
        TextView nombre = (TextView) view.findViewById(R.id.textoNombre);
        TextView precio = (TextView) view.findViewById(R.id.textoPrecio);
        ImageView img=(ImageView) view.findViewById(R.id.imageView2);
        Button btnMas = view.findViewById(R.id.btnmas);
        Button btnMenos = view.findViewById(R.id.btnmenos);
        TextView cantidadVista = view.findViewById(R.id.textView);

        cantidadVista.setVisibility(View.VISIBLE);
        cantidadVista.setText(cantidad[i]);
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Log.i("comida",nombreComida[i]);
            Log.i("cantidad",cantidad[i]);
            int suma=Integer.parseInt(cantidad[i])+1;
            cantidad[i]=String.valueOf(suma);
            cantidadVista.setText(cantidad[i]);
            Log.i("Nuevo valor", cantidad[i]);

            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(cantidad[i])>0){
                    Log.i("comida",nombreComida[i]);
                    Log.i("cantidad",cantidad[i]);
                    int resta=Integer.parseInt(cantidad[i])-1;
                    cantidad[i]=String.valueOf(resta);
                    cantidadVista.setText(cantidad[i]);
                    Log.i("Nuevo valor", cantidad[i]);
                }
            }
        });


        Button btn = (Button) view.findViewById(R.id.button4);
        btn.setVisibility(View.INVISIBLE);
        btnMas.setVisibility(View.VISIBLE);
        btnMenos.setVisibility(View.VISIBLE);

        nombre.setText(nombreComida[i]);
        precio.setText(precioComida[i]);
        img.setImageResource(imagenesComida[i]);
        return view;
    }
}
