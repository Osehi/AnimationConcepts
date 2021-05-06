package com.polish.createsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.polish.createsplashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**
     * binding reference object
     */
    lateinit var binding: ActivityMainBinding

    /**
     * declare variable
     */
    lateinit var topAnimation: Animation
    lateinit var bottomAnimation: Animation
    lateinit var myCar:ImageView
    lateinit var carName:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // initialize the animation
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        // initiaze views
        myCar = binding.activityMainCarIv
        carName = binding.activityMainCarNameTv

        // set the animation to the views.
        myCar.animation = topAnimation
        carName.animation = bottomAnimation


    }
}