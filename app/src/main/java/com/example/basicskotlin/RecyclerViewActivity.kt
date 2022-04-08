package com.example.basicskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.basicskotlin.adapter.recyclerviewAdapter
import com.example.basicskotlin.model.ItemsViewModel

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewWidget);

        recyclerView.layoutManager=LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel("Number " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = recyclerviewAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
    }
}