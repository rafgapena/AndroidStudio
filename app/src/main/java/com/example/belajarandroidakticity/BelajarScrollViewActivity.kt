package com.example.belajarandroidakticity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {
    var bakround:ImageView?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)
        bakround=findViewById(R.id.bakround)
        Glide.with(this)
            .load(R.drawable.moscowa)
            .transform(BlurTransformation(23,3))
            .into(bakround!!)
    }
}