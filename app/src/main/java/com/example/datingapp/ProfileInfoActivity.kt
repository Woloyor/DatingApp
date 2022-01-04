package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProfileInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_info)


        val like = findViewById<ImageView>(R.id.likenavigatebtn);

        like.setOnClickListener {
            val intent = Intent(this, SwapActivity::class.java)
            startActivity(intent)
        }
    }
}