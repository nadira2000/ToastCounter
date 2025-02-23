package com.example.hellotoastapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var numberText: TextView
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberText = findViewById(R.id.numberText)
        val toastButton: Button = findViewById(R.id.toastButton)
        val countButton: Button = findViewById(R.id.countButton)

        toastButton.setOnClickListener {
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
            numberText.text = "0"
            count = 0
        }

        countButton.setOnClickListener {
            count++
            numberText.text = count.toString()
        }
    }
}


