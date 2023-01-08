package com.example.recycleviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recKeranjang : RecyclerView? = null
    var edNamaBarang : EditText? = null
    var edHargaBarang : EditText? = null
    var adapterKeranjang : AdapterKeranjang?=null
    val listKeranjang : ArrayList<ModelKeranjang> = ArrayList<ModelKeranjang>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recKeranjang = findViewById(R.id.id_rec_keranjang_saya)
        edNamaBarang = findViewById(R.id.id_input_nama_item)
        edHargaBarang = findViewById(R.id.id_input_harga_item)
       var  btnTambahKeranjang : Button = findViewById(R.id.id_btn_tambah_keranjang)
        btnTambahKeranjang.setOnClickListener {
            tambahDataKeKeranjang()
        }
    }
    fun tambahDataKeKeranjang(
    ){
        var dataBaru : ModelKeranjang = ModelKeranjang("${edNamaBarang?.text}",
            Integer.parseInt(edHargaBarang?.text.toString()))
        listKeranjang.add(dataBaru)
        adapterKeranjang = AdapterKeranjang(listKeranjang)
        recKeranjang?.adapter =adapterKeranjang
        adapterKeranjang!!.notifyDataSetChanged()

    }

}