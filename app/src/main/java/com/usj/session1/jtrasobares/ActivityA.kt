package com.usj.session1.jtrasobares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.usj.session1.jtrasobares.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    private val view by lazy{
        ActivityABinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)
        Log.v("MTSA","onCreate")

        view.btnB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }

        view.btnC.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.v("MTSA","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.v("MTSA","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("MTSA","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("MTSA","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("MTSA","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("MTSA","onDestroy")
    }
}