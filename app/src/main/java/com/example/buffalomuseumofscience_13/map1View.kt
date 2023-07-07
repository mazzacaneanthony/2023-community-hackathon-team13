package com.example.buffalomuseumofscience_13

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class map1View: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_level1)
        LocationRequest.checkLocationPermissions(this)
//        setContentView(R.layout.map_level1)
        findViewById<ImageView>(R.id.imageView).setOnClickListener{
            val Map2 = Intent(this, map2View::class.java)
            startActivity(Map2)
        }

    }
}