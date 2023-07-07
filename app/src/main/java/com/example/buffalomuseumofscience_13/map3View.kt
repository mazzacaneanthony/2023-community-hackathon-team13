package com.example.buffalomuseumofscience_13

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class map3View: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_level3)
        findViewById<ImageView>(R.id.imageView4).setOnClickListener{
            setContentView(R.layout.map_level1)
        }

    }
}