package com.example.exercise01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val batteryBtn = findViewById<Button>(R.id.batteryBtn)
        val memoryBtn = findViewById<Button>(R.id.memoryBtn)
        val connectivityBtn = findViewById<Button>(R.id.connectivityBtn)
        val infoText = findViewById<TextView>(R.id.infoText)

        batteryBtn.setOnClickListener {
            infoText.text = "Mobile apps must minimize background processes to save battery."
        }

        memoryBtn.setOnClickListener {
            infoText.text = "Mobile devices have limited RAM. Android may close idle apps."
        }

        connectivityBtn.setOnClickListener {
            infoText.text = "Mobile networks switch between WiFi and mobile data. Apps must handle unstable connections."
        }
    }
}