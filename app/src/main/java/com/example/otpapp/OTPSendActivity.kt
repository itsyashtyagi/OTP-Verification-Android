package com.example.otpapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.otpapp.R
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.otpapp.VerifyOTPActivity

class OTPSendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpsend)
        val inputMobile = findViewById<EditText>(R.id.inputMobile)
        val buttonGetOtp = findViewById<Button>(R.id.btnGetOtp)
        buttonGetOtp.setOnClickListener(View.OnClickListener {
            if (inputMobile.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(this@OTPSendActivity, "Enter Mobile number", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val intent = Intent(applicationContext, VerifyOTPActivity::class.java)
            intent.putExtra("mobile", inputMobile.text.toString())
            startActivity(intent)
        })
    }
}