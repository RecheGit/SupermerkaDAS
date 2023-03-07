package com.example.supermerkadas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorListViewCatalogo extends BaseAdapter {

    //Datos a mostrar

    private Context contexto;
    private LayoutInflater inflater;
    private String[] nombreComida;
    private String[] precioComida;
    private int[] imagenesComida;
    private CheckBox box;

    //Constructora

    public AdaptadorListViewCatalogo(Context pContext, String[] pNombreComida, String[] pPrecioComida, int[] pImagenesComida, CheckBox pBox){

        contexto = pContext;
        nombreComida = pNombreComida;
        imagenesComida = pImagenesComida;
        precioComida = pPrecioComida;
        box = pBox;
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
        CheckBox checkBox = ( CheckBox) view.findViewById(R.id.checkBox);
        nombre.setText(nombreComida[i]);
        precio.setText(precioComida[i]);
        img.setImageResource(imagenesComida[i]);
        checkBox.setVisibility(View.VISIBLE);
        checkBox.setText("Añadir a la cesta");
        return view;
    }
}
