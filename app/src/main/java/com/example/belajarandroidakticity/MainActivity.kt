package com.example.belajarandroidakticity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val judulfrom:TextView=findViewById(R.id.judulform)
        val labelnama:TextView=findViewById(R.id.labelnama)
        val labelkodebuku:TextView=findViewById(R.id.labelkodebuku)

        val inputnama:EditText=findViewById(R.id.inputnama)
        val inputkelas:EditText=findViewById(R.id.inputkelas)
        val inputkodebuku:EditText=findViewById(R.id.inputkodebuku)
        val btnsubmit:Button=findViewById(R.id.btnsubmit)
        val nama:TextView=findViewById(R.id.munculnama)
        val kelas:TextView=findViewById(R.id.munculkelas)
        val buku:TextView=findViewById(R.id.munculbuku)


        btnsubmit.setOnClickListener{
            Toast.makeText(this,"anda pinjam buku${buku.text}",
                Toast.LENGTH_SHORT).show()
            nama.text =inputnama.text
            kelas.text=inputkelas.text
            val kode:Int=inputkodebuku.text.toString().toInt()
            when(kode){
                123->buku.text="assasin cread"
                456->buku.text="10 besar dosa daud"
                else->buku.text="tidak ada"
            }



        }

    }
}