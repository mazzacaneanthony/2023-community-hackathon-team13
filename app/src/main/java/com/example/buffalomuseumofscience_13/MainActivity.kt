package com.example.buffalomuseumofscience_13

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        LocationRequest.requestLocationPermission(this)

//        // Call the getGPSLocation function
//        FineLocation.getGPSLocation(this) { latitude, longitude ->
//            if (latitude != 0.0 && longitude != 0.0) {
//                // Use the latitude and longitude as needed
//                Log.d("GPS Location", "Latitude: $latitude, Longitude: $longitude")
//            } else {
//                // Handle the case where the GPS coordinates are not available
//            }
//        }
    }

//        setContentView(R.layout.activity_main)
//
//        // Setting the login the button to the onclick event
//        findViewById<Button>(R.id.login_button).setOnClickListener{
//
//        }
    
    
    
    
}