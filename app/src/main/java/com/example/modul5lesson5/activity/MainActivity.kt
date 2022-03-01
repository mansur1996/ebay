package com.example.modul5lesson5.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5lesson5.R
import com.example.modul5lesson5.adapter.DailyDealsAdapter
import com.example.modul5lesson5.adapter.FavoriteAdapter
import com.example.modul5lesson5.model.DailyDeals
import com.example.modul5lesson5.model.Favorite

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }
    private fun initViews(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val recyclerViewDailyDeals = findViewById<RecyclerView>(R.id.rv_daily_deals)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewDailyDeals.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        refreshAdapter1(recyclerView, getFavorites())
        refreshAdapter2(recyclerViewDailyDeals, getDailyDeals())
    }

    private fun refreshAdapter1(rv : RecyclerView,items : ArrayList<Favorite>){
        val adapter = FavoriteAdapter(this, items)
        rv.adapter = adapter
    }

    private fun refreshAdapter2(rv: RecyclerView, items: ArrayList<DailyDeals>){
        val adapter = DailyDealsAdapter(this, items)
        rv.adapter = adapter
    }

    private fun getDailyDeals(): ArrayList<DailyDeals> {
        val items : ArrayList<DailyDeals>  = ArrayList()

        items.add(DailyDeals( R.drawable.img_watch_1,  "Apple Watch", "29.99"))
        items.add(DailyDeals( R.drawable.img_watch_2,  "Apple Watch", "123.99"))
        items.add(DailyDeals( R.drawable.img_watch_3,  "Apple Watch", "199.99"))
        items.add(DailyDeals( R.drawable.img_watch_4,  "Apple Watch", "783.99"))
        items.add(DailyDeals( R.drawable.img_watch_5,  "Apple Watch", "456.99"))
        items.add(DailyDeals( R.drawable.img_watch_6,  "Apple Watch", "123.33"))
        items.add(DailyDeals( R.drawable.img_watch_7,  "Apple Watch", "123.55"))

        return items
    }

    private fun getFavorites(): ArrayList<Favorite>{
        val items : ArrayList<Favorite>  = ArrayList()

        items.add(Favorite("Apple Watch", R.drawable.img_watch_1))
        items.add(Favorite("Apple Watch", R.drawable.img_watch_2))
        items.add(Favorite("Apple Watch", R.drawable.img_watch_3))
        items.add(Favorite("Apple Watch", R.drawable.img_watch_4))
        items.add(Favorite("Apple Watch", R.drawable.img_watch_5))
        items.add(Favorite("Apple Watch", R.drawable.img_watch_6))
        items.add(Favorite("Apple Watch", R.drawable.img_watch_7))

        return items
    }
}