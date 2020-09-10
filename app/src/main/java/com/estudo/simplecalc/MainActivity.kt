package com.estudo.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum()
        sub()
        div()
        mult()
    }

    private fun sum() {
        val firstNumber = edit_first_number.text
        val secondNumber = edit_second_number.text

        image_sum.setOnClickListener {
            if (firstNumber.toString().isEmpty() && secondNumber.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.toast_sum), Toast.LENGTH_LONG).show()
            } else {
                var calculate =
                    (firstNumber.toString().trim().toFloat() + secondNumber.toString().trim()
                        .toFloat())
                text_result.text = "$calculate"
                firstNumber.clear()
                secondNumber.clear()
                calculate = 0f
            }
        }
    }

    private fun sub() {
        val firstNumber = edit_first_number.text
        val secondNumber = edit_second_number.text

        image_sub.setOnClickListener {
            if (firstNumber.toString().isEmpty() && secondNumber.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.toast_sub), Toast.LENGTH_LONG).show()
            } else {
                var calculate =
                    (firstNumber.toString().trim().toFloat() - secondNumber.toString().trim()
                        .toFloat())
                text_result.text = "$calculate"
                firstNumber.clear()
                secondNumber.clear()
                calculate = 0f
            }
        }
    }

    private fun div() {
        val firstNumber = edit_first_number.text
        val secondNumber = edit_second_number.text

        image_div.setOnClickListener {
            if (firstNumber.toString().isEmpty() && secondNumber.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.toast_div), Toast.LENGTH_LONG).show()
            } else {
                var calculate =
                    (firstNumber.toString().trim().toFloat() / secondNumber.toString().trim()
                        .toFloat())
                text_result.text = "$calculate"
                firstNumber.clear()
                secondNumber.clear()
                calculate = 0f
            }
        }
    }
    private fun mult() {
        val firstNumber = edit_first_number.text
        val secondNumber = edit_second_number.text

        image_mult.setOnClickListener {
            if (firstNumber.toString().isEmpty() && secondNumber.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.toast_mult), Toast.LENGTH_LONG).show()
            } else {
                var calculate =
                    (firstNumber.toString().trim().toFloat() * secondNumber.toString().trim()
                        .toFloat())
                text_result.text = "$calculate"
                firstNumber.clear()
                secondNumber.clear()
                calculate = 0f
            }
        }
    }

}