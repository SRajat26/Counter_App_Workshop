package com.dipanshusharmaapp.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val increase_counter_btn : Button = findViewById(R.id.counter_button)
        val reset_button : Button = findViewById(R.id.reset_btn)
        val txt : TextView = findViewById<TextView>(R.id.txt)

        increase_counter_btn.setOnClickListener {
            performOnClick(txt)
        }
        reset_button.setOnClickListener{
            count =0
            txt.setText(count.toString())
        }

    }

    fun performOnClick(txt : TextView) {
        count++
        txt.setText(count.toString())
    }
}