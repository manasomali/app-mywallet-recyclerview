package com.example.snackbar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailGastosAdapter(private val listEntradas: List<Gasto>):
    RecyclerView.Adapter<DetailGastosAdapter.DetailGastosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            DetailGastosViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_gasto,
            parent, false)
        return DetailGastosViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: DetailGastosViewHolder, position: Int) {
        val currentItem = listEntradas[position]
        holder.tvDescricao.setText(currentItem.descricao)
        holder.tvCategoria.setText(currentItem.categoria)
        holder.tvDataHora.setText(currentItem.datahora)
        holder.tvValor.setText(currentItem.valor.toString())
    }
    override fun getItemCount() = listEntradas.size

    class DetailGastosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvDescricao:TextView = itemView.findViewById(R.id.tvDescricao)
        val tvCategoria:TextView = itemView.findViewById(R.id.tvCategoria)
        val tvDataHora:TextView = itemView.findViewById(R.id.tvDataHora)
        val tvValor:TextView = itemView.findViewById(R.id.tvValor)
    }
}