package com.example.recycleviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class AdapterKeranjang(var listKeranjang : ArrayList<ModelKeranjang>) : RecyclerView.Adapter<AdapterKeranjang.ViewHolder>() {

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      var textNamaKeranjang : TextView? = itemView.findViewById(R.id.id_nama_keranjang)
      var jumlahKeranjang : TextView? = itemView.findViewById(R.id.id_jumlah_item_keranjang)

  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v : View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_keranjang,parent,false);
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder.textNamaKeranjang?.setText(listKeranjang.get(position).namaKeranjang)
        holder.jumlahKeranjang?.setText(listKeranjang.get(position).hargaItem.toString())
    }

    override fun getItemCount(): Int {
        return listKeranjang.size
    }
}
