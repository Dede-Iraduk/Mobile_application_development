package com.example.somasana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class teacher : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<CustomAdapter.CustomViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

       adapter = CustomAdapter()
        recyclerView.adapter = adapter




    }
}