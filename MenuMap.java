package com.example.caminalibremaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;

public class MenuMap extends AppCompatActivity {


     EditText txtLon , txtLat, txtLon2 , txtLat2;
     Button dire1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_map);

        txtLon = findViewById(R.id.txtlong);
        txtLat = findViewById(R.id.txtla);
        txtLon2 = findViewById(R.id.txtLong2);
        txtLat2 = findViewById(R.id.txtLa2);


        dire1 = findViewById(R.id.dire1);
    }


    public void mapa (View view){

        Double lon = Double.parseDouble(txtLon.getText().toString());
        Double lat = Double.parseDouble(txtLat.getText().toString());

        Double lon2 = Double.parseDouble(txtLon2.getText().toString());
        Double lat2 = Double.parseDouble(txtLat2.getText().toString());

        Bundle parametros = new Bundle();

        Intent mapa = new Intent(this,MapsActivity.class);


        parametros.putDouble("lon",lon);
        parametros.putDouble("lat",lat);

        parametros.putDouble("lon2",lon2);
        parametros.putDouble("lat2",lat2);

        parametros.putString("title","Direccion 1");
        parametros.putString("title2","Direccion 2");

        mapa.putExtras(parametros);
        startActivity(mapa);
    }

    public void dire1(View view){


        Bundle parametros = new Bundle();

        Intent mapa = new Intent(this,MapsActivity.class);

        parametros.putDouble("lon",-77.074434);
        parametros.putDouble("lat",-12.078213);

        parametros.putDouble("lon2",-77.073793);
        parametros.putDouble("lat2",-12.0775);

        parametros.putString("title","Parque Kennedy");
        parametros.putString("title2","Final");

        mapa.putExtras(parametros);
        startActivity(mapa);


    }
    public void dire2(View view){
        Bundle parametros = new Bundle();

        Intent mapa = new Intent(this,MapsActivity.class);
        parametros.putDouble("lon",-77.033425);
        parametros.putDouble("lat",-12.130104);

        parametros.putDouble("lon2",-77.040252);
        parametros.putDouble("lat2",-12.122805);

        parametros.putString("title","Malecon de miraflores");
        parametros.putString("title2","Final");
        mapa.putExtras(parametros);
        startActivity(mapa);
    }
    public void dire3(View view){
        Bundle parametros = new Bundle();

        Intent mapa = new Intent(this,MapsActivity.class);
        parametros.putDouble("lon",-77.042372);
        parametros.putDouble("lat",-12.118974);

        parametros.putDouble("lon2",-77.029420);
        parametros.putDouble("lat2",-12.119163);

        parametros.putString("title","Alameda Av.pardo");
        parametros.putString("title2","Final");

        mapa.putExtras(parametros);
        startActivity(mapa);
    }
    public void dire4(View view){
        Bundle parametros = new Bundle();

        Intent mapa = new Intent(this,MapsActivity.class);
        parametros.putDouble("lon",-77.039291);
        parametros.putDouble("lat",-12.065004);

        parametros.putDouble("lon2",-77.043631);
        parametros.putDouble("lat2",-12.070589);

        parametros.putString("title","Campo de Marte");
        parametros.putString("title2","Final");

        mapa.putExtras(parametros);
        startActivity(mapa);
    }
    public void dire5(View view){
        Bundle parametros = new Bundle();

        Intent mapa = new Intent(this,MapsActivity.class);
        parametros.putDouble("lon",-77.025024);
        parametros.putDouble("lat",-12.147235);

        parametros.putDouble("lon2",-77.025686);
        parametros.putDouble("lat2",-12.162142);

        parametros.putString("title","Circuito de playas");
        parametros.putString("title2","Final");

        mapa.putExtras(parametros);
        startActivity(mapa);
    }





}