package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SimpleAdapter.ViewBinder
import com.example.calculator.databinding.ActivityMainBinding

//Сделать на viewBinding и разобраться с ним
//почитать про jetpack compose
//на данный момент ничего не работает))


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val expressionField = ExpressionField()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bt1: Button = findViewById(R.id.button1)
        val bt2: Button = findViewById(R.id.button2)
        val bt3: Button = findViewById(R.id.button3)
        val bt4: Button = findViewById(R.id.button4)
        val bt5: Button = findViewById(R.id.button5)
        val bt6: Button = findViewById(R.id.button6)
        val bt7: Button = findViewById(R.id.button7)
        val bt8: Button = findViewById(R.id.button8)
        val bt9: Button = findViewById(R.id.button9)
        val bt0: Button = findViewById(R.id.button0)

        expressionField.numberAction(bt1, binding)
        expressionField.numberAction(bt2, binding)
        expressionField.numberAction(bt3, binding)
        expressionField.numberAction(bt4, binding)
        expressionField.numberAction(bt5, binding)
        expressionField.numberAction(bt6, binding)
        expressionField.numberAction(bt7, binding)
        expressionField.numberAction(bt8, binding)
        expressionField.numberAction(bt9, binding)
        expressionField.numberAction(bt0, binding)
    }
}