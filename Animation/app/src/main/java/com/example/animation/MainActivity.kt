package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

// This program displays an animation when a button is clicked
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // When the button is clicked the bounce animation is performed
    fun onTapMe(view: View){
        val bounceAnimation= AnimationUtils.loadAnimation(this, R.anim.bounce)
        view.startAnimation(bounceAnimation)
    }
}