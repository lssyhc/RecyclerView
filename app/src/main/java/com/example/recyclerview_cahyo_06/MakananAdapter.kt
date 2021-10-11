package com.example.recyclerview_cahyo_06

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter(private val context: Context, private val makanan: List<Makanan>, val listener: (Makanan) -> Unit) : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {
    class MakananViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgMakanan = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaMakanan = view.findViewById<TextView>(R.id.tv_item_name)
        val descMakanan = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(makanan: Makanan, listener: (Makanan) -> Unit){
            imgMakanan.setImageResource(makanan.imgMakanan)
            namaMakanan.text = makanan.namaMakanan
            descMakanan.text = makanan.descMakanan
            itemView.setOnClickListener {
                listener(makanan)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        return MakananViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        holder.bindView(makanan[position], listener)
    }

    override fun getItemCount(): Int = makanan.size
}