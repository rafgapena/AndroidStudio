package com.example.belajarandroidakticity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidakticity.R
import com.example.belajarandroidakticity.model.Language

class LanguageAdapter(val data:ArrayList<Language>)
    :RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    class LanguageViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val tvbahasapemograman:TextView=view.findViewById(R.id.tvbahasapemograman)
        val ivbahasapemograman:ImageView=view.findViewById(R.id.ivbahasapemograman)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemograman2,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item=data.get(position)
        holder.tvbahasapemograman.text=item.name
        holder.ivbahasapemograman.setImageResource(item.image)

    }
}