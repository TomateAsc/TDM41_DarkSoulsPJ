package com.example.darksoulspj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spGift, spClass;
    TextView;
    EditText Classdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> aregloregalos = new ArrayList<String>();
        aregloregalos.add("Bendición Divina");
        aregloregalos.add("Bomba de Fuego Negro");
        aregloregalos.add("Binoculares");
        aregloregalos.add("Colgante");
        aregloregalos.add("Humanidades Gemelas");
        aregloregalos.add("Llave Maestra");
        aregloregalos.add("Anillo de Diminuto");
        aregloregalos.add("Anillo de la Vieja Bruja");
        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1,aregloregalos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spGift = findViewById(R.id.spGift);
        spGift.setAdapter(adapter);
        ArrayList<String> aregloClases = new ArrayList<String>();
        aregloregalos.add("Guerrero");
        aregloregalos.add("Caballero");
        aregloregalos.add("Vagabundo");
        aregloregalos.add("Ladrón");
        aregloregalos.add("Bandido");
        aregloregalos.add("Cazador");
        aregloregalos.add("Hechicero");
        aregloregalos.add("Piromántico");
        aregloregalos.add("Clérigo");
        aregloregalos.add("Marginado");
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1,aregloClases);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spClass = findViewById(R.id.spClass);
        spClass.setAdapter(adapter1);

        //enlazar text viw
        Classdesc = findViewById(R.id.Classdesc);


        spClass.setOnItemClickListener(new AdapterView.OnItemSelectedListener() {

            public void  onItemSelected(AdapterView<?> adapterView, View view, int i, long l){

            }
            @Override
            public void onNoithinSelected(AdapterView<?> parent, View view, int position, long id) {

            }
        }

    }
}