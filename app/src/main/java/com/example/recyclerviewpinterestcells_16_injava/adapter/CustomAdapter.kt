package com.example.recyclerviewpinterestcells_16_injava.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewpinterestcells_16_injava.R
import android.view.View
import android.widget.ImageView
import com.example.recyclerviewpinterestcells_16_injava.model.Member

class CustomAdapter(private val context: Context, private val members: List<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_custom_layout, viewGroup, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]
        if (holder is CustomViewHolder) {
            if (position % 3 == 0) {
                holder.item_image.setImageResource(R.drawable.image1)
            } else if (position % 4 == 0) {
                holder.item_image.setImageResource(R.drawable.image2)
            } else if (position % 5 == 0) {
                holder.item_image.setImageResource(R.drawable.image4)
            } else {
                holder.item_image.setImageResource(R.drawable.image3)
            }
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val item_image = view.findViewById<ImageView>(R.id.item_image)
    }
}