package com.example.buffalomuseumofscience_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.buffalomuseumofscience_13.onclick.guestLogin
import com.example.buffalomuseumofscience_13.onclick.loginButton
import com.example.buffalomuseumofscience_13.onclick.userAgreement

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.login_button).setOnClickListener(loginButton)
        findViewById<EditText>(R.id.guest_login).setOnClickListener(guestLogin)
        findViewById<EditText>(R.id.userAgreement).setOnClickListener(userAgreement)
    }
}