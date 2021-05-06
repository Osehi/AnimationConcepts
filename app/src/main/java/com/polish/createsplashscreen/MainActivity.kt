package com.polish.createsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation

class MainActivity : AppCompatActivity() {

    /**
     * declare variable
     */
    lateinit var topAnimation: Animation
    lateinit var bottomAnimation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}