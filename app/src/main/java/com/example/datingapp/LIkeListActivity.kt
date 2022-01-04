package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class LIkeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_like_list)


        val backbtn = findViewById<ImageView>(R.id.backbtn);

        backbtn.setOnClickListener {
            val intent = Intent(this, SwapActivity::class.java)
            startActivity(intent)
        }
    }


}