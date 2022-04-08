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
        val recyclerView = findViewById<Button>(R.id.recyclerView);

        simpleSplashButton.setOnClickListener {
            val splashIntent = Intent(this,SplashScreen::class.java)
            startActivity(splashIntent)
        }
        animatedSplashButton.setOnClickListener {
            val animSplashIntent = Intent(this,AnimatedSplashScreen::class.java)
            startActivity(animSplashIntent)
        }
        simpleCalculator.setOnClickListener {
            val calculatorIntent = Intent(this,Simple_Calculator::class.java)
            startActivity(calculatorIntent)
        }
        recyclerView.setOnClickListener{
            val recyclerViewIntent = Intent(this,RecyclerViewActivity::class.java)
            startActivity(recyclerViewIntent)
        }
    }
}