package com.example.actiandintprac.adapter

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.actiandintprac.databinding.CardItemsBinding
import com.example.actiandintprac.model.Datasource
import com.example.actiandintprac.model.Card as Card

class CardAdapter(context: Context) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {
    val dataset = Datasource.cards

    var onItemClick : ((Card) -> Unit)? = null






    class CardViewHolder(val binding: CardItemsBinding) : RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val adapterlayout =
            CardItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(adapterlayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.cardName.text = item.cardname
        holder.binding.cardPrice.text = item.price
        holder.binding.cardImage.setImageResource(item.image)
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(item)
        }



    }




}

