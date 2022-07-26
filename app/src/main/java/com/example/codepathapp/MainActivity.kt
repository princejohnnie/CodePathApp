package com.example.codepathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton = findViewById<Button>(R.id.helloButton)
        helloButton.setOnClickListener {
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }

        val learnMoreButton = findViewById<Button>(R.id.learnMoreButton)
        learnMoreButton.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

    }
}