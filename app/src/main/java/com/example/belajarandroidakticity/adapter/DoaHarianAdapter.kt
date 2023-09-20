package com.example.belajarandroidakticity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidakticity.R
import com.example.belajarandroidakticity.model.DoaHarian

class DoaHarianAdapter(val data:ArrayList<DoaHarian>)
    :RecyclerView.Adapter<DoaHarianAdapter.DoaHarianViewholder>()
{
    class DoaHarianViewholder(view: View)
        :RecyclerView.ViewHolder(view)
    {
        val jdltidur:TextView=view.findViewById(R.id.jdltidur)
        val isidoaarabnya:TextView=view.findViewById(R.id.isidoaarabnya)
        val isidoalatin:TextView=view.findViewById(R.id.isidoalatin)
        val penanda:ImageButton=view.findViewById(R.id.penanda)
        val isidoa:RelativeLayout=view.findViewById(R.id.isidoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewholder {
       val view=LayoutInflater.from(parent.context)
           .inflate(R.layout.item_doa_harian,parent,false)
        return DoaHarianViewholder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaHarianViewholder, position: Int) {
        val item=data.get(position)
        holder.jdltidur.text=item.judul
        holder.isidoaarabnya.text=item.textarab
        holder.isidoalatin.text=item.textlatin

        holder.penanda.setOnClickListener {
            if (holder.isidoa.visibility==View.GONE){
                holder.isidoa.visibility=View.VISIBLE
            }else{
                holder.isidoa.visibility=View.GONE
        }
        }
    }

}