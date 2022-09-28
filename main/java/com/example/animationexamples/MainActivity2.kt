package com.example.animationexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val image = findViewById<ImageView>(R.id.image)
        image.setOnClickListener{
            val animation: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoomin)
//            image.visibility = View.VISIBLE
            image.startAnimation(animation)
        }
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        val animation: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.zoomin)
//        val image = findViewById<ImageView>(R.id.image)
//        image.startAnimation(animation)
//    }
}