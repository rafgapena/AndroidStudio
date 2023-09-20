package com.example.belajarandroidakticity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class OpenCameraActivity : AppCompatActivity() {
    var ibcamera:ImageButton?=null
    var ivsample:ImageView?=null
    val pic_id=123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)
        ibcamera=findViewById(R.id.ibcamera)
        ivsample=findViewById(R.id.ivsample)

        ibcamera!!.setOnClickListener {
            intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==pic_id) {
            val photo: Bitmap = data?.extras?.get("data") as Bitmap
            ivsample?.setImageBitmap(photo)
        }
    }
}