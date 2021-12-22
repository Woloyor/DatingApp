package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginAndPasswordActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_and_password)


        // Initialize Firebase Auth
        auth = Firebase.auth

        val backbtn = findViewById<ImageView>(R.id.backbtn);


        backbtn.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }
        val start = findViewById<ImageButton>(R.id.continuebtn)
        start.setOnClickListener {
            singUpUser()
            /*  val intent = Intent(this, PasswordActivity::class.java)
              startActivity(intent)*/
        }
    }

    fun singUpUser() {
        val emailhint = findViewById<EditText>(R.id.emailhint);
        val passwordhint = findViewById<EditText>(R.id.passwordhint);
        if (emailhint.text.toString().isEmpty()) {
            emailhint.error = "Please enter email"
            emailhint.requestFocus()
            return

        }
      /* if (Patterns.EMAIL_ADDRESS.matcher(emailhint.text.toString()).matches()) {
            emailhint.error = "Please enter email"
            emailhint.requestFocus()
            return
        }*/
        if (passwordhint.text.toString().isEmpty()) {
            passwordhint.error = "Please enter password"
            passwordhint.requestFocus()
            return

        }


        auth.createUserWithEmailAndPassword(emailhint.text.toString(), passwordhint.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this, SetDateActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        baseContext, "Sign Up failed. Try again after some time.",
                        Toast.LENGTH_SHORT
                    ).show()

                }
            }
    }
}