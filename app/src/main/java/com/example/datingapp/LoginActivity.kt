package com.example.datingapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.*
import androidx.appcompat.app.AlertDialog
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


        val login = findViewById<ImageButton>(R.id.btncontinue)
        login.setOnClickListener {
            val intent = Intent(this, SwapActivity::class.java)
            startActivity(intent)
        }


        val start = findViewById<Button>(R.id.foget)


        start.setBackgroundColor(0x00000000);
        start.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Forgot Password")
            val view = layoutInflater.inflate(R.layout.dialog_forgot_password, null)
            val username = view.findViewById<EditText>(R.id.et_username)
            builder.setView(view)
            builder.setPositiveButton("Reset", DialogInterface.OnClickListener { _, _ ->
                forgotPassword(username)
            })
            builder.setNegativeButton("Close", DialogInterface.OnClickListener { _, _ -> })
            builder.show()


        }
        val backbtn = findViewById<ImageView>(R.id.backbtn);

        backbtn.setOnClickListener {
            val intent = Intent(this, LoginAndSingInActivity::class.java)
            startActivity(intent)
        }

    }
    private fun forgotPassword(username: EditText) {
        if (username.text.toString().isEmpty()){
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(username.text.toString()).matches())
        {
            return
        }
        auth.sendPasswordResetEmail(username.text.toString())
            .addOnCompleteListener{ task  ->
                if(task.isSuccessful)(
                        Toast.makeText(this, "Email sent.", Toast.LENGTH_SHORT).show()
                        )
            }
    }
}


