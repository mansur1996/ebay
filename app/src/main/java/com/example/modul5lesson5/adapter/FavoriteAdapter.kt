package com.example.modul5lesson5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5lesson5.R
import com.example.modul5lesson5.model.Favorite

class FavoriteAdapter(val context : Context, var items : ArrayList<Favorite>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return StoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_food_favorite, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if(holder is StoryViewHolder){
            holder.apply {
                iv_image.setImageResource(item.image)
                tv_title.text=item.title
            }
        }
    }

    override fun getItemCount(): Int = items.size

    class StoryViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var iv_image = view.findViewById<ImageView>(R.id.iv_image)
        var tv_title = view.findViewById<TextView>(R.id.tv_title)
    }
}