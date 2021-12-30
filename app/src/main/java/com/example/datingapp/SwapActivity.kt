package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_swap.*

class SwapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swap)

        val like = findViewById<ImageView>(R.id.likebtn);

        val skip = findViewById<ImageView>(R.id.closebtn);

        val filter = findViewById<ImageView>(R.id.filterbtn);

        like.setOnClickListener {
            val intent = Intent(this, ProfileSwapActivity::class.java)
            startActivity(intent)
        }

        skip.setOnClickListener{
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        filter.setOnClickListener {
            var dialog = CustomDialogFragment()

                dialog.show(supportFragmentManager, "customDialog")

        }


    }
}