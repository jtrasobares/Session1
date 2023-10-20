package com.usj.session1.jtrasobares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usj.session1.jtrasobares.databinding.ActivityEBinding

class ActivityE : AppCompatActivity() {

    private val view by lazy{
        ActivityEBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnC.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }


}