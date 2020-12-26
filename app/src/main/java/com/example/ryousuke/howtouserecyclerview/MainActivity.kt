package com.example.ryousuke.howtouserecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ryousuke.howtouserecyclerview.R.navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fragmentの作成
        val mainFragment = MainFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmet_container,mainFragment)
        fragmentTransaction.commit()
    }
}