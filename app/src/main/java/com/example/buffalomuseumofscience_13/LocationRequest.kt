package com.example.buffalomuseumofscience_13

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

object LocationRequest {
    private val LOCATION_PERMISSION_REQUEST_CODE = 1
    
    fun checkLocationPermissions(activity: Activity) {
        // request permission
//        if (ContextCompat.checkSelfPermission(activity,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)

    }
    
}