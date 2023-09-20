package com.example.belajarandroidakticity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
        val arrayAdapter:ArrayAdapter<*>
        val users= arrayOf(
            "Steve","Ross Taylor","Rohit sharma"
        )
        var mListView:ListView=findViewById(R.id.listnamna)
        arrayAdapter= ArrayAdapter( this,
        android.R.layout.simple_list_item_1, users)

        mListView.adapter=arrayAdapter
    }
}