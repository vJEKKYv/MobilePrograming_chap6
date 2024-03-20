package com.example.chap06_1_activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.visibility)
        /*

        setContentView(R.layout.activity_view)
        setContentView(R.layout.layout_select)
        setContentView(R.layout.set_padding)
        setContentView(R.layout.set_visible)
         */
        /*
        val textView = findViewById<TextView>(R.id.text1)
        textView.text = "잘된다!!!!!"
         */
        val visibleBtn = findViewById<Button>(R.id.visibleBtn)
        val invisibleBtn = findViewById<Button>(R.id.invisibleBtn)
        val targetView = findViewById<TextView>(R.id.targetView)
        visibleBtn.setOnClickListener{
            targetView.visibility = View.VISIBLE
        }
        val invisibleBtn = findViewById<Button>(R.id.invisibleBtn)
        visibleBtn.setOnClickListener{
            targetView.visibility = View.INVISIBLE
        }
        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         */
    }
}