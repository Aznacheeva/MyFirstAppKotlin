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
        var student = Student("Ivan", 2)
        print(student.name)
        print(student.toString())
    }
}

data class Student(var name : String, var course : Int = 1) {
    override fun toString(): String {
        return "My name is $name and I'm in my $course year"
    }

}