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

        val likelist = findViewById<ImageView>(R.id.likelistbtn);

        val profile = findViewById<ImageView>(R.id.usernavigatebtn);

        like.setOnClickListener {
            val intent = Intent(this, ProfileSwapActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this, ProfileInfoActivity::class.java)
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

        likelist.setOnClickListener {
            val intent = Intent(this, LIkeListActivity::class.java)
            startActivity(intent)
        }

    }
}