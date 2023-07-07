package com.example.buffalomuseumofscience_13

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class map3View: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_level3)
        findViewById<ImageView>(R.id.imageView4).setOnClickListener{
            val Map1 = Intent(this, map1View::class.java)
            startActivity(Map1)
        }

    }
}