package com.example.actiandintprac.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.actiandintprac.R
import com.example.actiandintprac.model.Datasource

class CardAdapter(context: Context, private val listener: RecyclerViewEvent) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {
    val dataset = Datasource.cards


    inner class CardViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }

        val cardName: TextView = view.findViewById(R.id.cardName)
        val cardPrice: TextView = view.findViewById(R.id.cardPrice)
        val cardImage: ImageView = view.findViewById(R.id.cardImage)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_items, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = dataset[position]
        holder.cardName.text = item.cardname
        holder.cardPrice.text = item.price
        holder.cardImage.setImageResource(item.image)


    }

    interface RecyclerViewEvent {
        fun onItemClick(position: Int)
    }

}

