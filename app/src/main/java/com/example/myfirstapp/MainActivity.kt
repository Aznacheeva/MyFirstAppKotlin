package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val view = findViewById<TextView>(R.id.testView)
        view.text = "Привет"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var student = Student("Софья", 3)
        print(student.name)
        print(student.toString())
    }
}
