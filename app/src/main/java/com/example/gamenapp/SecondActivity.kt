package com.example.gamenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack :Button = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            //画面遷移時に遷移元のActivityを終了する
            finish()
        }
    }
}