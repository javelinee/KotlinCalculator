package com.project.calculatorwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            if(firstNumber.text.toString().isEmpty() || secondNumber.text.toString().isEmpty()){
                firstNumber.setError("Number must be filled")
                secondNumber.setError("Number must be filled")
            } else {
                val first : Int = firstNumber.text.toString().toInt()
                val second : Int = secondNumber.text.toString().toInt()
                val sum : Int = first + second
                result.setText(sum.toString())
            }
        }

        btnMin.setOnClickListener {
            if(firstNumber.text.toString().isEmpty() || secondNumber.text.toString().isEmpty()){
                firstNumber.setError("Number must be filled")
                secondNumber.setError("Number must be filled")
            } else {
                val first : Int = firstNumber.text.toString().toInt()
                val second : Int = secondNumber.text.toString().toInt()
                val min : Int = first - second
                result.setText(min.toString())
            }
        }

        btnMul.setOnClickListener {
            if(firstNumber.text.toString().isEmpty() || secondNumber.text.toString().isEmpty()){
                firstNumber.setError("Number must be filled")
                secondNumber.setError("Number must be filled")
            } else {
                val first : Int = firstNumber.text.toString().toInt()
                val second : Int = secondNumber.text.toString().toInt()
                val mul : Int = first * second
                result.setText(mul.toString())
            }
        }

        btnDiv.setOnClickListener {
            if(firstNumber.text.toString().isEmpty() || secondNumber.text.toString().isEmpty()){
                firstNumber.setError("Number must be filled")
                secondNumber.setError("Number must be filled")
            } else {
                val first : Int = firstNumber.text.toString().toInt()
                val second : Int = secondNumber.text.toString().toInt()
                val div : Int = first / second
                result.setText(div.toString())
            }
        }
    }
}



