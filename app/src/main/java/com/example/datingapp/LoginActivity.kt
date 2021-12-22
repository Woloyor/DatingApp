package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
// Initialize Firebase Auth
        auth = Firebase.auth



        val start = findViewById<TextView>(R.id.foget)
        start.setOnClickListener {
            val intent = Intent(this, ForgotPassowrdActivity::class.java)
            startActivity(intent)
        }
        val backbtn = findViewById<ImageView>(R.id.backbtn);

        backbtn.setOnClickListener{
            val intent = Intent(this, LoginAndSingInActivity::class.java)
            startActivity(intent)
        }

        }

    /*public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            reload();
        }
    }

    private fun reload() {

        TODO("Not yet implemented")
    }


     */

}
