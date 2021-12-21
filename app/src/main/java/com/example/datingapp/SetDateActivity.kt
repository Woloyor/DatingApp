package com.example.datingapp

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class SetDateActivity : AppCompatActivity() {

    private val TAG = "SetDateActivity"

    private val mDisplayDate: TextView? = null
    private var mDateSetListener: OnDateSetListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_date)
        val mDisplayDate = findViewById<TextView>(R.id.tvDate);
        val backbtn = findViewById<ImageView>(R.id.backbtn);

        backbtn.setOnClickListener{
            val intent = Intent(this, PasswordActivity::class.java)
            startActivity(intent)
        }
        val start = findViewById<ImageButton>(R.id.continuebtn)
        start.setOnClickListener {
            val intent = Intent(this, GenderActivity::class.java)
            startActivity(intent)}

    mDisplayDate.setOnClickListener(View.OnClickListener {
            val cal: Calendar = Calendar.getInstance()
            val year: Int = cal.get(Calendar.YEAR)
            val month: Int = cal.get(Calendar.MONTH)
            val day: Int = cal.get(Calendar.DAY_OF_MONTH)
            val dialog = DatePickerDialog(
                this@SetDateActivity,
                R.style.Spinner,
                mDateSetListener,
                year, month, day
            )
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.show()
        })

        mDateSetListener =
            OnDateSetListener { datePicker, year, month, day ->
                var month = month
                month = month + 1
                Log.d(TAG, "onDateSet: mm /dd /yyy: $month/$day/$year")
                val date = "$month/$day/$year"
                mDisplayDate.setText(date)
            }
    }
}