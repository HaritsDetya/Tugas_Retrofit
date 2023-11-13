package com.example.tugas_retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_retrofit.databinding.ItemBinding
import com.example.tugas_retrofit.model.Data
import com.squareup.picasso.Picasso

class Adapter(private val listItem: List<Data>)  :
    RecyclerView.Adapter<Adapter.ItemViewHolder>() {
    inner class ItemViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val item_image : ImageView = itemView.findViewById(R.id.img)
        fun bind(data: Data) {
            with(binding) {
                title.text = data.title
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(listItem[position])
        Picasso.get().load(listItem[position].image).into(holder.item_image)
    }

    override fun getItemCount(): Int = listItem.size
}