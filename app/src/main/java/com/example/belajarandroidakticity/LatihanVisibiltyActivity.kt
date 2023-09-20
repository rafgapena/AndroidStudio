package com.example.belajarandroidakticity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibiltyActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibilty)
        val tvtext:TextView=findViewById(R.id.tvtext)
        val btnshow:Button=findViewById(R.id.btnshow)

        btnshow.setOnClickListener {
            tvtext.visibility=View.VISIBLE
            if (tvtext.visibility==View.VISIBLE){
                tvtext.visibility==View.VISIBLE
            }
            else{
                tvtext.visibility= View.VISIBLE
            }
        }
    }
}