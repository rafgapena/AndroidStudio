package com.example.belajarandroidakticity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidakticity.adapter.LanguageAdapter
import com.example.belajarandroidakticity.model.Language

class ListPemegroramanActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemegroraman)
        val rvbahsapememograman:RecyclerView=
            findViewById(R.id.rvbahsapemograman)
        val data= arrayListOf<Language>(
            Language("Golang",R.drawable.golang),
            Language("pyhton",R.drawable.python) ,
            Language("pyhton",R.drawable.cplus),
            Language("Golang",R.drawable.golang),
            Language("pyhton",R.drawable.python) ,
            Language("pyhton",R.drawable.cplus),
            Language("Golang",R.drawable.golang),
            Language("pyhton",R.drawable.python) ,
            Language("pyhton",R.drawable.cplus)

        )
       val adapter=LanguageAdapter(data)
        rvbahsapememograman.adapter=adapter
        rvbahsapememograman.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}