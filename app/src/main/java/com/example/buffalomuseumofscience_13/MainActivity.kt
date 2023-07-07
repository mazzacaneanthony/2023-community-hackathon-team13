package com.example.buffalomuseumofscience_13

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.buffalomuseumofscience_13.onclick.guestLogin
import com.example.buffalomuseumofscience_13.onclick.loginButton
//import com.example.buffalomuseumofscience_13.onclick.userAgreement
import com.example.buffalomuseumofscience_13.useragreement

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.login_button).setOnClickListener(loginButton)
        findViewById<EditText>(R.id.guest_login).setOnClickListener{
            val mine = Intent(this, useragreement::class.java)
           startActivity(mine)
        }
    }
}