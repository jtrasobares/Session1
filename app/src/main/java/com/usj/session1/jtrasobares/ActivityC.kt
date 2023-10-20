package com.usj.session1.jtrasobares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usj.session1.jtrasobares.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {

    private val view by lazy{
        ActivityCBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        view.btnCall.setOnClickListener {
            val intent = Intent(this, ActivityE::class.java)
            startActivity(intent)
        }
    }




}