package com.example.asandyitem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ItemAdapter(private val itemList: List<Item>, private val listener: OnItemClickListener) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(item: Item)
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.itemImage)
        val itemName: TextView = itemView.findViewById(R.id.itemName)
        val itemTahun : TextView = itemView.findViewById(R.id.itemTahun)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(itemList[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.itemImage.setImageResource(currentItem.image)
        holder.itemName.text = currentItem.name
        holder.itemTahun.text = currentItem.tahun
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
