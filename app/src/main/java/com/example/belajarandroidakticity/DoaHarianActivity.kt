package com.example.belajarandroidakticity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidakticity.adapter.DataNgajiAdapter
import com.example.belajarandroidakticity.adapter.DoaHarianAdapter
import com.example.belajarandroidakticity.model.DataNgaji
import com.example.belajarandroidakticity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val doaHarian: RecyclerView =
            findViewById(R.id.doaharian)
        val data= arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Istinja","للّٰهُمَّ حَسِّنْ فَرْجِىْ مِنَ الْفَوَاخِشِ وَظَهِّرْ قَلْبِيْ مِنَ النِّفَاقِ","Alloohumma thahhir qolbii minan nifaaqi wa hashshin fajrii minal fawaahisyi"),
            DoaHarian("Doa Sebelum Tidur","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ","Bismikallohumma ahya wa amuutu")
            )
        val adapter= DoaHarianAdapter(data)
        doaHarian.adapter=adapter
        doaHarian.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }
}