package com.example.sqdan.registro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sqdan.registro.Modelo.Estudiante;

import java.util.ArrayList;

/**
 * Created by sqdan on 12-Apr-18.
 */

public class Adapter extends BaseAdapter {
    ArrayList<Estudiante> lista;
    Context context;

    public Adapter(Context context, ArrayList<Estudiante> lista) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.lyt_item,null);
        }

        ImageView imgUser = convertView.findViewById(R.id.imgUser);

        TextView txtNombre = convertView.findViewById(R.id.txtNombre);
        TextView txtCarnet = convertView.findViewById(R.id.txtCarnet);
        TextView txtCarrera = convertView.findViewById(R.id.txtCarrera);

        imgUser.setImageURI(lista.get(position).getImgUser());
        txtNombre.setText(lista.get(position).getNombre());
        txtCarnet.setText(lista.get(position).getCarnet());
        txtCarrera.setText(lista.get(position).getCarrera());

        return convertView;
    }
}
