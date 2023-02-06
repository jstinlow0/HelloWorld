package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() { //Think of screen on an app
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.HelloButton)
        button.setOnClickListener {
            Log.v("Hello World", "Button Clicked!")
            Toast.makeText( this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}