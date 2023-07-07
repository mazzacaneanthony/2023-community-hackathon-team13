package com.example.buffalomuseumofscience_13

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class useragreement : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.location_agreement)

        findViewById<Button>(R.id.continue_agreement).setOnClickListener{
            val Map1 = Intent(this, map1View::class.java)
            startActivity(Map1)
        }
    }
}