package com.example.modul5lesson5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5lesson5.R
import com.example.modul5lesson5.model.DailyDeals

class DailyDealsAdapter(context: Context, val items : ArrayList<DailyDeals>) :RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DailyDealsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_daily_deals, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if(holder is DailyDealsViewHolder){
            holder.apply {
                iv_image.setImageResource(item.img)
                tv_desc.text=item.desc
                tv_price.text=item.price
            }
        }
    }

    override fun getItemCount(): Int = items.size

    class DailyDealsViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var iv_image = view.findViewById<ImageView>(R.id.iv_photo)
        var tv_desc = view.findViewById<TextView>(R.id.tv_info)
        var tv_price = view.findViewById<TextView>(R.id.tv_price)
    }
}