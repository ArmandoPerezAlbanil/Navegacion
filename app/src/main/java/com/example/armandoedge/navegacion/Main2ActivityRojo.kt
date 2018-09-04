package com.example.armandoedge.navegacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2_rojo.*

class Main2ActivityRojo : AppCompatActivity() {
    companion object {
        val Extra_Nombre="extraNombre"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2_rojo)

        var inte =intent
        if(intent !=null && intent.hasExtra(Extra_Nombre)){
            var nombre: String=inte.getStringExtra(Extra_Nombre)
            txtNom.setText(nombre)
        }


    }
}
