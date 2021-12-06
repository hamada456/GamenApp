package com.example.gamenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            //val intent = Intent(this,遷移先のクラス::class.java)
            val intent = Intent(this,SecondActivity::class.java)
            //生成したオブジェクトを引数に画面を起動！
            startActivity(intent)
        }
    }
}