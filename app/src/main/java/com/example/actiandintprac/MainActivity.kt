package com.example.actiandintprac

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.actiandintprac.adapter.CardAdapter
import com.example.actiandintprac.databinding.ActivityMainBinding
import com.example.actiandintprac.model.Card
import com.example.actiandintprac.model.Datasource

class MainActivity : AppCompatActivity(), CardAdapter.RecyclerViewEvent{


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView1: RecyclerView = findViewById(R.id.recyclerView1)
        val recyclerView2: RecyclerView = findViewById(R.id.recyclerView2)


        val myaa = CardAdapter(this, this)
        recyclerView1.adapter = myaa
        recyclerView1.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recyclerView2.adapter = myaa
        recyclerView2.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }


    override fun onItemClick(position: Int) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent )
    }





}
