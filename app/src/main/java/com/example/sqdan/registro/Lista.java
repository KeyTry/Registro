package com.example.sqdan.registro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sqdan.registro.Modelo.Estudiante;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    ListView listView;
    Adapter adapterP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listView = findViewById(R.id.listaE);
        ArrayList<Estudiante> lista = new ArrayList<>();

        lista = (ArrayList)getIntent().getParcelableArrayListExtra("Lista");
        adapterP = new Adapter(Lista.this,lista);
        listView.setAdapter(adapterP);
    }
}
