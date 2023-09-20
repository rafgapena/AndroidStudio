package com.example.belajarandroidakticity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class count : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)
        val num:TextView=findViewById(R.id.count)
        val atas:Button=findViewById(R.id.atas)
        val up:Button=findViewById(R.id.up)
        val apaia:Button=findViewById(R.id.apaia)
        var countup:Int=0


         up.setOnClickListener {
             countup=0
             num.text=countup.toString()
         }
        atas.setOnClickListener {
            countup+=1
            num.text=countup.toString()
        }
        apaia.setOnClickListener {
            countup -=1
            num.text=countup.toString()
        }
    }
}