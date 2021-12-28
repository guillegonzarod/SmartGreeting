package com.guillegonzarod.smartgreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // UI
    val editTextGreeting = findViewById<EditText>(R.id.editTextGreeting)
    val switchCaps = findViewById<Switch>(R.id.switchCaps)
    val textViewCaps = findViewById<TextView>(R.id.textViewCaps)
    val textViewGreeting = findViewById<TextView>(R.id.textViewGreeting)
    val buttonGreeting = findViewById<Button>(R.id.buttonGreeting)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}