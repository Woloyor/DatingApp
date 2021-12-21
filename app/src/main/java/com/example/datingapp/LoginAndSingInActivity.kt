package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.ImageButton
import android.widget.TextView

class LoginAndSingInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_and_sing_in)

        var text  = findViewById<TextView>(R.id.txtView);
        val text1 = getColoredSpanned("By continuing you agree to the", "#00011A")
        val text2 = getColoredSpanned("Privacy Policy", "#FF2F50")
        text.setText(Html.fromHtml(text1+" "+text2));
        val login = findViewById<ImageButton>(R.id.loginbtn)
        login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val register = findViewById<ImageButton>(R.id.signinbtn)
        register.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }

    }
    private fun getColoredSpanned(text: String, color: String): String? {
        return "<font color=$color>$text</font>"
    }
    }
