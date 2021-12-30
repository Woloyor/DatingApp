package com.example.datingapp

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_custom_dialog.*
import kotlinx.android.synthetic.main.fragment_custom_dialog.view.*
import android.view.Gravity

import android.view.WindowManager





class CustomDialogFragment: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.fragment_custom_dialog, container, false )


        val window = dialog!!.window
        val lp = WindowManager.LayoutParams()
        lp.gravity = Gravity.TOP or Gravity.RIGHT
        lp.x = 100
        lp.y = 0
        window!!.attributes = lp

        rootView.cancelButton.setOnClickListener {
            dismiss()
        }


        rootView.sumbit_button.setOnClickListener {
            val selectedID = rattingRagioGroup.checkedRadioButtonId
            
            val radio = rootView.findViewById<RadioButton>(selectedID)

            var ratingResult = radio.text.toString()

            Toast.makeText(context, "You rate: $ratingResult", Toast.LENGTH_LONG)
            dismiss()
        }



        return  rootView

    }
}

