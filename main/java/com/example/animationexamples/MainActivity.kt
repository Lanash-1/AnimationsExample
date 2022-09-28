package com.example.animationexamples

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text)
        val nextBtn = findViewById<Button>(R.id.nextBtn)

        nextBtn.setOnClickListener {
//            val animation: Animation = AnimationUtils.loadAnimation(applicationContext,R.anim.zoomin)
//            textView.visibility = View.VISIBLE
//            textView.startAnimation(animation)
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }

    }
}