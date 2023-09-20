package com.example.belajarandroidakticity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Travel_ctivity : AppCompatActivity() {
    var ibcall:ImageButton?=null
    var ibnav:ImageButton?=null
    var ibshare:ImageButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_ctivity)
        ibcall=findViewById(R.id.ibcall)
        ibnav=findViewById(R.id.ibnav)
        ibshare=findViewById(R.id.ibshare)
        ibcall?.setOnClickListener {
            val phoneNumber="+6281210878169"
            val phoneIntent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(phoneIntent)
        }
     ibnav?.setOnClickListener {
         val mapIntent=Intent(Intent.ACTION_VIEW,
             Uri.parse("geo:-6.906533566007589, 106.95743895666835"))
         mapIntent.setPackage("com.google.android.apps.maps")
         startActivity(mapIntent)
     }

    }
}