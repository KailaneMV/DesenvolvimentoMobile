package com.example.contador

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textViewContador)

        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        button.setOnClickListener {
            contador++
            textView.text = contador.toString()
        }

        val button2 = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

        button2.setOnClickListener{
            if (contador > 0){
                contador--
                textView.text = contador.toString()
            }
        }

        }
    }
