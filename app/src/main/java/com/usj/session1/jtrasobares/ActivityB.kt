package com.usj.session1.jtrasobares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usj.session1.jtrasobares.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    private val view by lazy{
        ActivityBBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        view.btnD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode== 1){
            view.tvB.text = data?.getStringExtra("result")
        }
    }
}