package com.example.actiandintprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.actiandintprac.databinding.ActivityMain2Binding
import com.example.actiandintprac.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MainActivity2 : AppCompatActivity() {
    private lateinit var dialog: BottomSheetDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val showBtn : Button = findViewById(R.id.showBtn)
        val name2 : TextView = findViewById(R.id.name)
        val price2 : TextView = findViewById(R.id.price)
        val image2 : ImageView = findViewById(R.id.image)

        showBtn.setOnClickListener {
            ShowBottomSheet()
        }

        val bundle: Bundle? = intent.extras
        val resId: Int? = bundle?.getInt("Image")
        val name = bundle?.getString("Name")
        val price = intent.getStringExtra("Price")

        name2.text = name
        price2.text = price
        if (resId != null) {
            image2.setImageResource(resId)

        }



    }

    private fun ShowBottomSheet() {
        val dialogView = layoutInflater.inflate(R.layout.bottom_sheet, null)
        dialog = BottomSheetDialog(this , R.style.BottomSheetDiologTheme_)
        setContentView(dialogView)
    }
}