package com.example.armandoedge.navegacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    public fun btnRojo(v: View){
        Log.d("Armando", "Dentro de rojo")
        val inte :Intent= Intent(this, Main2ActivityRojo::class.java)
        val sNomb:String= txtNombre.text.toString()
        Log.d("Armando","Dentro de rojo" )
        inte.putExtra(Main2ActivityRojo.Extra_Nombre,sNomb)
        startActivity(inte)


    }
    public fun btnAmarillo(v:View){

        val inte :Intent= Intent(this,Main2ActivityAmarillo::class.java)
        startActivity(inte)
    }
    public fun btnVerde(v: View){
        val inte: Intent=Intent(this,Main2ActivityVerde::class.java)
        startActivity(inte)
    }


}
