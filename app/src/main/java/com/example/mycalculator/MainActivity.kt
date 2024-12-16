package com.example.mycalculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFirst: EditText = findViewById(R.id.etFirst)
        val etSecond: EditText = findViewById(R.id.etSecond)
        val bAdd: ImageButton = findViewById(R.id.bAdd)
        val bSubtract: ImageButton = findViewById(R.id.bSubtract)
        val bMultiply: ImageButton = findViewById(R.id.bMultiply)
        val bDivision: ImageButton = findViewById(R.id.bDivision)
        val bResult: Button = findViewById(R.id.bResult)
        val tvResult: TextView = findViewById(R.id.tvResult)

        var result: Double? = null


        bAdd.setOnClickListener {
            val num1 = etFirst.text.toString().toDoubleOrNull()
            val num2 = etSecond.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result = num1 + num2
                tvResult.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        bSubtract.setOnClickListener {
            val num1 = etFirst.text.toString().toDoubleOrNull()
            val num2 = etSecond.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result = num1 - num2
                tvResult.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        bMultiply.setOnClickListener {
            val num1 = etFirst.text.toString().toDoubleOrNull()
            val num2 = etSecond.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result = num1 * num2
                tvResult.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        bDivision.setOnClickListener {
            val num1 = etFirst.text.toString().toDoubleOrNull()
            val num2 = etSecond.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    result = num1 / num2
                    tvResult.text = "Result: $result"
                } else {
                    Toast.makeText(this, "Division by zero is not allowed", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        bResult.setOnClickListener {
            if (result != null) {
                tvResult.text = "Final Result: $result"
            } else {
                Toast.makeText(this, "Perform an operation first", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
