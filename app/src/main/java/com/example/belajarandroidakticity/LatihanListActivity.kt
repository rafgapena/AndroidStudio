package com.example.belajarandroidakticity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val arrayAdapter: ArrayAdapter<*>
        val users= arrayOf(
            "pyhotn","C++","java","mysql","Ruby","go","lang","piet","velato",
        "Intercal","brianfuck"
        )
        var mListView: ListView =findViewById(R.id.listbahasa)
        arrayAdapter= ArrayAdapter( this,
            android.R.layout.simple_list_item_1, users)

        mListView.adapter=arrayAdapter
    }
}