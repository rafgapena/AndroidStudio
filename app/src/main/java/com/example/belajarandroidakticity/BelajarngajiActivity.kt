package com.example.belajarandroidakticity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidakticity.adapter.DataNgajiAdapter
import com.example.belajarandroidakticity.adapter.LanguageAdapter
import com.example.belajarandroidakticity.model.DataNgaji
import com.example.belajarandroidakticity.model.Language

class BelajarngajiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajarngaji)
        val ivdoa: RecyclerView =
            findViewById(R.id.doanya)
        val data= arrayListOf<DataNgaji>(
            DataNgaji("Doa",R.drawable.doadoa),
            DataNgaji("dzikir",R.drawable.dzikirkarton),
            DataNgaji("Sunah",R.drawable.cartoonngaji),
            DataNgaji("Hadits",R.drawable.cartoonngaji),

        )
        val adapter= DataNgajiAdapter(data)
        ivdoa.adapter=adapter
        ivdoa.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val buttonngaji :Button=findViewById(R.id.buttonngaji)
        buttonngaji.setOnClickListener {
            val intent=Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}