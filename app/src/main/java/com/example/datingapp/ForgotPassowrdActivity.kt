package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ForgotPassowrdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_passowrd)

        val start = findViewById<ImageButton>(R.id.continuebtn)
        start.setOnClickListener {
            val intent = Intent(this, LoginAndSingInActivity::class.java)
            startActivity(intent)
        }
            val backbtn = findViewById<ImageView>(R.id.backbtn);

            backbtn.setOnClickListener{
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
