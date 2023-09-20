package com.example.belajarandroidakticity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidakticity.R
import com.example.belajarandroidakticity.model.DataNgaji
//import com.example.belajarandroidakticity.model.Language

class DataNgajiAdapter(val data:ArrayList<DataNgaji>)
    :RecyclerView.Adapter<DataNgajiAdapter.DataNgajiViewHolder>()
{
    class DataNgajiViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val ivdoa:TextView=view.findViewById(R.id.ivdoa)
        val iddoa:ImageView=view.findViewById(R.id.iddoa)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  DataNgajiViewHolder{
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.list_doanya_dandzikir,parent,false)
        return DataNgajiViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DataNgajiViewHolder, position: Int) {
        val item=data.get(position)
        holder.ivdoa.text=item.name
        holder.iddoa.setImageResource(item.image)

    }
}