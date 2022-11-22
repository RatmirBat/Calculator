package com.example.calculator

import android.widget.Button
import com.example.calculator.databinding.ActivityMainBinding
import com.ezylang.evalex.Expression
import java.math.BigDecimal

class ResultField {

    fun resultAction(button: Button, binding: ActivityMainBinding) {
        button.setOnClickListener {
            binding.result.text = calculateResult(binding).toInt().toString()
        }
    }
    private fun calculateResult(binding: ActivityMainBinding): BigDecimal {
        val expr = Expression(binding.expression.text.toString())
        val result = expr.evaluate()
        return result.numberValue
    }
}