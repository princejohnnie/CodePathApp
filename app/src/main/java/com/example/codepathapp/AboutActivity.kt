package com.example.codepathapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val githubButton = findViewById<ConstraintLayout>(R.id.github_button)
        githubButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/princejohnnie"))
            startActivity(intent)
        }

        val linkedinButton = findViewById<ConstraintLayout>(R.id.linkedin_button)
        linkedinButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/john-uzodinma-61436b18b/" +
                    ""))
            startActivity(intent)
        }

    }

}