package com.example.ryousuke.howtouserecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter:RecyclerView.Adapter<Adapter.ViewHolder>() {

    //ViewHolderの役割は一行分のビューを保持、どんな要素があるかを覚えておく
    class ViewHolder(view:View): RecyclerView.ViewHolder(view){
        val text: TextView = view.findViewById(R.id.textView2)
    }


    //1行分のビューを作りViewHolderに渡す処理
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //1行分のレイアウト
        R.layout.item_text
        val inflater = LayoutInflater.from(parent.context)
        val root = inflater.inflate(R.layout.item_text,parent,false)

        return ViewHolder(root)
    }


    //ViewHolderとリストでどの位置にあるかを教えてくれる
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(position%3){
            0-> holder.text.text="Satou"
            1-> holder.text.text="Suzuki"
            2-> holder.text.text="Tanaka"
        }
    }


    //データの件数を教えてくれる
    override fun getItemCount()=300

}