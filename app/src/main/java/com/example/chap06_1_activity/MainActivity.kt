package com.example.chap06_1_activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.chap06_1_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        //Grandle/build.grandle.kts 중 app에 들어가 viewBinding {enable = true } 넣으면
        //activity_main 안에서 선언된 id를 binding.xx로 가져올 수 있다. val로 하나하나 선언 해 줄 필요 없다.
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.invisibleBtn.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }
        binding.visibleBtn.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }
        /*
        setContentView(R.layout.textlinetest)
        setContentView(R.layout.visibility)
        setContentView(R.layout.activity_view)
        setContentView(R.layout.layout_select)
        setContentView(R.layout.set_padding)
        setContentView(R.layout.set_visible)
         */
        /*
        val textView = findViewById<TextView>(R.id.text1)
        textView.text = "잘된다!!!!!"
         */
        /*
        val visibleBtn = findViewById<Button>(R.id.visibleBtn)
        val invisibleBtn:Button = findViewById<Button>(R.id.invisibleBtn)
        val targetView = findViewById<TextView>(R.id.targetView)
        visibleBtn.setOnClickListener{
            targetView.visibility = View.VISIBLE
        }
        visibleBtn.setOnClickListener{
            targetView.visibility = View.VISIBLE
        }
        invisibleBtn.setOnClickListener{
            targetView.visibility = View.INVISIBLE
        }
         */

        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         */
    }
}