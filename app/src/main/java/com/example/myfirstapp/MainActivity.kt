package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val student = Student("Софья", 3)
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        print(student.name)
        print(student.toString())
    }

    fun studentMe(view: View) {
        val myStudent = Toast.makeText(this, student.toString(), Toast.LENGTH_SHORT)
        myStudent.show()
    }

    fun addMe(view: View) {
        var count: Int = Integer.parseInt(textView.text.toString())
        count++
        textView.text = count.toString()
    }

    fun substractMe(view: View) {
        var count: Int = Integer.parseInt(textView.text.toString())
        if (count > 0) {
            count--
        }
        textView.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        val count: Int = Integer.parseInt(textView.text.toString())
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }

}
