package com.example.somasana

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CustomAdapter(
): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    private var topic = arrayOf("Notes 1", "Notes 2", "Assignment 1", "Assignment 2", "Exercise 1", "Exercise 2")
    private var images = intArrayOf(R.drawable.add, R.drawable.add, R.drawable.add, R.drawable.add, R.drawable.add,
        R.drawable.add, R.drawable.edit, R.drawable.edit, R.drawable.edit, R.drawable.edit, R.drawable.edit,
        R.drawable.edit, R.drawable.remove, R.drawable.remove, R.drawable.remove,  R.drawable.remove,  R.drawable.remove,  R.drawable.remove)

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var edit: ImageView
        var add: ImageView
        var remove: ImageView
        var tvTopic: TextView

        init {
            edit = itemView.findViewById(R.id.edit)
            add = itemView.findViewById(R.id.add)
            remove = itemView.findViewById(R.id.remove)
            tvTopic = itemView.findViewById(R.id.tvTopic)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return CustomViewHolder(view)

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.tvTopic.text = topic[position]
        holder.edit.setImageResource(images[position])
        holder.add.setImageResource(images[position])
        holder.remove.setImageResource(images[position])

        }
    override fun getItemCount(): Int {
        return topic.size
    }


    }





