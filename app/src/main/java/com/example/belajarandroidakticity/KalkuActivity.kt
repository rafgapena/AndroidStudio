package com.example.belajarandroidakticity

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KalkuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalku)
        val msk1: EditText =findViewById(R.id.msk1)
        val msk2: EditText =findViewById(R.id.msk2)

        val tambah: Button =findViewById(R.id.tambah)
        val kurang: Button =findViewById(R.id.kurang)
        val persen: Button =findViewById(R.id.persen)
        val kali : Button =findViewById(R.id.kali)
        val bagi : Button =findViewById(R.id.bagi)
        val clear : Button =findViewById(R.id.clear)

        val rumus: TextView =findViewById(R.id.rumus)
        var count:Int

        val builder: AlertDialog.Builder=
            AlertDialog.Builder(this@KalkuActivity)

        tambah.setOnClickListener {
            count=msk1.text.toString().toInt()+msk2.text.toString().toInt()
            rumus.text=count.toString()
        }
        kurang.setOnClickListener {
            count=msk1.text.toString().toInt()-msk2.text.toString().toInt()
            rumus.text=count.toString()
        }
        persen.setOnClickListener {
            count=msk1.text.toString().toInt()% msk2.text.toString().toInt()
            rumus.text=count.toString()
        }
        persen.setOnClickListener {
            count=msk1.text.toString().toInt() * msk2.text.toString().toInt()
            rumus.text=count.toString()
        }
        persen.setOnClickListener {
            count=msk1.text.toString().toInt() / msk2.text.toString().toInt()
            rumus.text=count.toString()
        }

        clear.setOnClickListener {
            builder.setTitle("PERHATIAN!!")
            builder.setMessage("APAKAH ANDA YAKIN?")
            builder.setCancelable(false)
            builder.setPositiveButton(
                "yes",
                DialogInterface.OnClickListener { dialog, which ->
                    count=0
                    msk1.setText("")
                    msk2.setText("")
                    rumus.text=count.toString()
                }
            )
            builder.setNegativeButton(
                "CANCEL",
                DialogInterface.OnClickListener{ dialog, which ->  }
            )
            builder.setIcon(R.drawable.info_24)
            val alertDialog: AlertDialog =builder.create()
            alertDialog.show()
        }
    }
}