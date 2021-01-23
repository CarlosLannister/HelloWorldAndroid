package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text_view) as TextView
        val button: Button = findViewById<Button>(R.id.button)

        var number = 0
        button.setOnClickListener  {
            number++
            textView.text = number.toString()
        }
    }
}