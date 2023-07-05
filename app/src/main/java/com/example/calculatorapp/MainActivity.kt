package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener{
            val value1 = input1.text.toString().toInt();
            val  value2 = input2.text.toString().toInt();
            output.text = (value1+value2).toString();
            input1.setText("");
            input2.setText("");

        }

        btnSub.setOnClickListener{
            val value1 = input1.text.toString().toInt();
            val  value2 = input2.text.toString().toInt();
            output.text = (value1-value2).toString();
            input1.setText("");
            input2.setText("");

        }

        btnMul.setOnClickListener{
            val value1 = input1.text.toString().toInt();
            val  value2 = input2.text.toString().toInt();
            output.text = (value1*value2).toString();
            input1.setText("");
            input2.setText("");

        }

        btnDiv.setOnClickListener{
            val value1 = input1.text.toString().toInt();
            val  value2 = input2.text.toString().toInt();
            if(value2==0)
                output.text = "MATH ERROR!";
            else
                output.text = (value1/value2).toString();
            input1.setText("");
            input2.setText("");

        }
    }
}