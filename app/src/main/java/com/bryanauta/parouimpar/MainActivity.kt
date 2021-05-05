package com.bryanauta.parouimpar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num = findViewById<EditText>(R.id.edtNumero)

        val parouimp = findViewById<TextView>(R.id.txtResposta)

        val btn = findViewById<Button>(R.id.btnCalcular)

        btn.setOnClickListener {
            val num = num.text.toString().toInt()

            if (num%2==0) {
                parouimp.text = ("$num is even!").toString()
            } else {
                parouimp.text = ("$num is odd!").toString()
            }
        }
    }
}
