package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculator.databinding.ActivityMainBinding

//Сделать на viewBinding и разобраться с ним
//почитать про jetpack compose
//на данный момент ничего не работает))


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun numberAction(view: View) {
        if (view is Button) {
            expression.append(view.text)
        }
    }
}