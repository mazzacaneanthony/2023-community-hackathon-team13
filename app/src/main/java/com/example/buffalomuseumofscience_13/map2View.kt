package com.example.buffalomuseumofscience_13

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class map2View: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_level2)
        findViewById<ImageView>(R.id.imageView2).setOnClickListener{
            setContentView(R.layout.map_level3)
        }

    }
}