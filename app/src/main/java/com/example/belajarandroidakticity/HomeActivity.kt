package com.example.belajarandroidakticity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import android.content.Intent as Intent1

class HomeActivity : AppCompatActivity() {
    var btnshare:MaterialButton?=null
    var btnpindah:MaterialButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnshare=findViewById(R.id.btnshare)
        btnpindah=findViewById(R.id.btnpindah)

        btnpindah?.setOnClickListener {
            val intent= Intent1(this,DetailActivity2::class.java)
            startActivity(intent)
        }
        btnshare!!.setOnClickListener {
//            val intent=Intent1(android.content.Intent.ACT)
        }
    }
}