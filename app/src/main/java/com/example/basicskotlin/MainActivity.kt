package com.example.basicskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpleSplashButton = findViewById<Button>(R.id.splashButton)
        val animatedSplashButton = findViewById<Button>(R.id.animatedSplashButton)
        val simpleCalculator = findViewById<Button>(R.id.simpleCalculator);

        simpleSplashButton.setOnClickListener {
            val splashIntent = Intent(this,SplashScreen::class.java)
            startActivity(splashIntent)
        }
        animatedSplashButton.setOnClickListener {
            val splashIntent = Intent(this,AnimatedSplashScreen::class.java)
            startActivity(splashIntent)
        }
        simpleCalculator.setOnClickListener {
            val splashIntent = Intent(this,Simple_Calculator::class.java)
            startActivity(splashIntent)
        }
    }
}