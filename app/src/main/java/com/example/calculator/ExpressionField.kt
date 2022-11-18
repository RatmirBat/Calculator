package com.example.calculator

import android.widget.Button
import androidx.core.text.isDigitsOnly
import com.example.calculator.databinding.ActivityMainBinding

class ExpressionField {

    fun numberAction(button: Button, binding: ActivityMainBinding) {

        if (button.text.isDigitsOnly()) {
            button.setOnClickListener {
                binding.expression.append(button.text)
            }
        }
    }
}