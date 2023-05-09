package com.example.actiandintprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.actiandintprac.databinding.ActivityMain2Binding
import com.example.actiandintprac.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name2 : TextView = findViewById(R.id.name)
        val price2 : TextView = findViewById(R.id.price)
        val image2 : ImageView = findViewById(R.id.image)

        val bundle: Bundle? = intent.extras
        val resId: Int? = bundle?.getInt("Image")
        val name = intent.getStringExtra("Name")
        val price = intent.getStringExtra("Price")

        name2.text = name
        price2.text = price
        if (resId != null) {
            image2.setImageResource(resId)
        }



    }
}