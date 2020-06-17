package com.example.frameanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.frameanimation.*
import kotlinx.android.synthetic.main.tweenanimation.*

class MainActivity : AppCompatActivity() {

    lateinit var anim: Animation

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }

    fun Frame(view: View){
        setContentView(R.layout.frameanimation)
        (image_id.background as AnimationDrawable).start()
    }

    fun Tween(view: View){
        setContentView(R.layout.tweenanimation)
    }

    fun TweenStart(view: View){
        anim = AnimationUtils.loadAnimation(this, R.anim.tween_anim)
        imgTween.startAnimation(anim)
    }

}
