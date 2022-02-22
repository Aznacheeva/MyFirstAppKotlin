package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {
    private lateinit var random : TextView
    private lateinit var label : TextView

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        random = findViewById(R.id.textView_random)
        label = findViewById(R.id.textView_label)
        showRandomNumber()
    }

    private fun showRandomNumber() {
        val random = Random()
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        this.random.text = randomInt.toString()
        label.text = getString(R.string.random_heading, count)
    }
}