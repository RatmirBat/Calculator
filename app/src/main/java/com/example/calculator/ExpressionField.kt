package com.example.calculator

import android.widget.Button
import com.example.calculator.databinding.ActivityMainBinding

class ExpressionField {
    private var canAddOperation: Boolean = false

    fun numberAction(button: Button, binding: ActivityMainBinding) {
        button.setOnClickListener {
            binding.expression.append(button.text)
            canAddOperation = true
        }
    }

    fun operationAction(button: Button, binding: ActivityMainBinding) {
        button.setOnClickListener {
            if (canAddOperation) {
                binding.expression.append(button.text)
                canAddOperation = false
            }
        }

    }

    fun clearAction(button: Button, binding: ActivityMainBinding) {
        button.setOnClickListener {
            binding.expression.text = ""
            binding.result.text = ""
        }
        canAddOperation = false
    }
}