package com.example.sandwichbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numberOfSandwiches = 0
    var sandwichPrice = 5
    val currency = "$"

    var addCheese = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculatePricePerSandwich()

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
            total_cost_textview.text = "Total cost: $currency$totalCost"
        }

        cheese_checkbox.setOnCheckedChangeListener { buttonView, isChecked ->
            addCheese = isChecked
            calculatePricePerSandwich()
        }
    }

    fun calculatePricePerSandwich() {
        sandwichPrice = 5
        if (addCheese) {
            sandwichPrice += 1
        }

        sandwich_price_textview.text = "Sandwich price: $currency$sandwichPrice"
    }
}
