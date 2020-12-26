package com.example.ryousuke.howtouserecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.main_fragment,container,false)

        val recyclerView = root.findViewById<RecyclerView>(R.id.recycler)
        //LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(inflater.context,
        LinearLayoutManager.VERTICAL,false)

        //Adapter
        recyclerView.adapter = Adapter()

        return root
    }

}