package com.example.buffalomuseumofscience_13

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class map1View: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_level1)
        findViewById<ImageView>(R.id.imageView).setOnClickListener{
            setContentView(R.layout.map_level2)
        }

    }
}