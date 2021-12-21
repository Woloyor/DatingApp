package com.example.datingapp

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text  = findViewById<TextView>(R.id.txtView);
        val text1 = getColoredSpanned("By continuing you agree to the", "#00011A")
        val text2 = getColoredSpanned("Privacy Policy", "#FF2F50")
        text.setText(Html.fromHtml(text1+" "+text2));

        val start = findViewById<ImageButton>(R.id.findbtn)
        start.setOnClickListener{
            val intent = Intent(this, LoginAndSingInActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getColoredSpanned(text: String, color: String): String? {
        return "<font color=$color>$text</font>"
    }

}