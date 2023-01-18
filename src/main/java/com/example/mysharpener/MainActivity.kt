package com.example.mysharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //accessing our textview from layout
        val textView = findViewById<TextView>(R.id.textView) as TextView
        val textView2 = findViewById<TextView>(R.id.textView2) as TextView
    }
}