package com.example.basicskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Simple_Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calculator)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)

        val result = findViewById<TextView>(R.id.result);

        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val mul = findViewById<Button>(R.id.mul)
        val div = findViewById<Button>(R.id.div)

        var temp = String()
        var temp1= String()
        var finalNumber:Double?=null

        if(num1.text.toString().isEmpty() && num2.text.toString().isEmpty()) {
            add.setOnClickListener {
                temp = num1.text.toString()
                temp1 = num2.text.toString()
                finalNumber = temp.toDouble() + temp1.toDouble()
                result.setText(finalNumber.toString())
            }
            sub.setOnClickListener {
                temp = num1.text.toString()
                temp1 = num2.text.toString()
                finalNumber = temp.toDouble() - temp1.toDouble()
                result.setText(finalNumber.toString())
            }
            mul.setOnClickListener {
                temp = num1.text.toString()
                temp1 = num2.text.toString()
                finalNumber = temp.toDouble() * temp1.toDouble()
                result.setText(finalNumber.toString())
            }
            div.setOnClickListener {
                temp = num1.text.toString()
                temp1 = num2.text.toString()
                finalNumber = temp.toDouble() / temp1.toDouble()
                result.setText(finalNumber.toString())
            }
        }

    }
}