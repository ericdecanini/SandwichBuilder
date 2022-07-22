package com.example.sandwichbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numberOfSandwiches = 0
    val sandwichPrice = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_button.setOnClickListener {
            numberOfSandwiches += 1
            sandwiches_textview.text = "Number of sandwiches: $numberOfSandwiches"
        }

        minus_button.setOnClickListener {
            numberOfSandwiches -= 1
            sandwiches_textview.text = "Number of sandwiches: $numberOfSandwiches"
        }

        submit_button.setOnClickListener {
            val totalCost = numberOfSandwiches * sandwichPrice
            total_cost_textview.text = "Total cost: $totalCost"
        }
    }
}