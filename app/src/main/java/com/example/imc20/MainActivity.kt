package com.example.imc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPeso = findViewById<EditText>(R.id.et_peso)
        val editTextAltura = findViewById<EditText>(R.id.et_altura)
        val  buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val textViewResultado = findViewById<TextView>(R.id.tv_resultado)


       buttonCalcular.setOnClickListener {
           var peso = editTextPeso.text.toString().toInt()
           var altura = editTextAltura.text.toString().toDouble()

           var imc = peso / Math.pow(altura, 2.0)

           textViewResultado.text = imc.toString()
       }


    }
}
