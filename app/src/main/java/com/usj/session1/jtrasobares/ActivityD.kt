package com.usj.session1.jtrasobares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usj.session1.jtrasobares.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {

    private val view by lazy{
        ActivityDBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.putExtra("result","Hemos Vuelto!")
            startActivityForResult(intent, RESULT_OK)
        }
    }


}