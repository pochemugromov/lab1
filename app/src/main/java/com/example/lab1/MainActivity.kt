package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<View>(R.id.TextView) as TextView
        val but = findViewById<View>(R.id.Button)
        val mes = findViewById<EditText>(R.id.inputText)

        but.setOnClickListener{
            textView.text = mes.text.toString()
        }
    }
}