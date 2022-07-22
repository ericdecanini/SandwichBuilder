package com.example.sandwichbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numberOfSandwiches = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_button.setOnClickListener {
            numberOfSandwiches += 1
            sandwiches_textview.text = numberOfSandwiches.toString()
        }

        minus_button.setOnClickListener {
            numberOfSandwiches -= 1
            sandwiches_textview.text = numberOfSandwiches.toString()
        }

        submit_button.setOnClickListener {
            var totalCost = numberOfSandwiches * 5
            total_cost_textview.text = totalCost.toString()
        }
    }
}