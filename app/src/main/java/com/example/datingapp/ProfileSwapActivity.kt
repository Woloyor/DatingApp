package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProfileSwapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_swap)
        val interest = findViewById<ImageView>(R.id.relationship);


        interest.setOnClickListener {
            val intent = Intent(this, MatchActivity::class.java)
            startActivity(intent)
        }
    }
}