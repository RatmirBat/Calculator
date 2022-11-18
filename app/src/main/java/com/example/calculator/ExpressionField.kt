package com.example.calculator

import android.widget.Button
import com.example.calculator.databinding.ActivityMainBinding

class ExpressionField {

    fun numberAction(button: Button, binding: ActivityMainBinding) {
        button.setOnClickListener {
            binding.expression.append(button.text)
        }

    }


}