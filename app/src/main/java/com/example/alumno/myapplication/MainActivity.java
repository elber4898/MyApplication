package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.alumno.myapplication.models.XPath;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<XPath> mylistita = new ArrayList<>();


        XPath mypath = new XPath(-72.2815418, 42.925823);
        mylistita.add(mypath);

        XPath mypath1 = new XPath(-72.2805333, 42.9244482);
        mylistita.add(mypath1);

        XPath mypath2 = new XPath(-72.2794926, 42.9251159);
        mylistita.add(mypath2);

        XPath mypath3 = new XPath(-72.281059, 42.926043);
        mylistita.add(mypath3);

        XPath mypath4 = new XPath(-72.2815526, 42.9258387);
        mylistita.add(mypath4);

        String url="https://www.keene.edu/campus/maps/tool/?coordinates=";

        String ruta="";


        Toast.makeText(this, String.format("Hay %s elementos | %s", mylistita.size(),"Todo va bien"), Toast.LENGTH_SHORT).show();

        int i = 1;

        for (XPath current_object : mylistita){
            ruta += current_object.longitud + "%2C%20" + current_object.latitud;

        if (i < mylistita.size()){
            ruta +="%0A";
        }

        i++;

        }


        Log.v("bichito", url + ruta);

        setContentView(R.layout.activity_main);
    }
}
