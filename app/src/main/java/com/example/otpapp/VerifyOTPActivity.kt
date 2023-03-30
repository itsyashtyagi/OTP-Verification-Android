package com.example.otpapp

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import com.example.otpapp.R
import android.widget.TextView
import android.text.TextWatcher
import android.text.Editable

class VerifyOTPActivity : AppCompatActivity() {
    private var inputCode1: EditText? = null
    private var inputCode2: EditText? = null
    private var inputCode3: EditText? = null
    private var inputCode4: EditText? = null
    private var inputCode5: EditText? = null
    private var inputCode6: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otpactivity)
        val textMobile = findViewById<TextView>(R.id.textMobile)
        textMobile.text = String.format(
            "+91-%s", intent.getStringExtra("mobile")
        )
        inputCode1 = findViewById(R.id.inputCode1)
        inputCode2 = findViewById(R.id.inputCode2)
        inputCode3 = findViewById(R.id.inputCode3)
        inputCode4 = findViewById(R.id.inputCode4)
        inputCode5 = findViewById(R.id.inputCode5)
        inputCode6 = findViewById(R.id.inputCode6)
        setupOtpInputs()
    }

    private fun setupOtpInputs() {
        inputCode1!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (!s.toString().trim { it <= ' ' }.isEmpty()) {
                    inputCode2!!.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
        })
        inputCode2!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (!s.toString().trim { it <= ' ' }.isEmpty()) {
                    inputCode3!!.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
        })
        inputCode3!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (!s.toString().trim { it <= ' ' }.isEmpty()) {
                    inputCode4!!.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
        })
        inputCode4!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (!s.toString().trim { it <= ' ' }.isEmpty()) {
                    inputCode5!!.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
        })
        inputCode5!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (!s.toString().trim { it <= ' ' }.isEmpty()) {
                    inputCode6!!.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
        })
    }
}