package com.example.recyclerview_cahyo_06

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailMakananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val makanan = intent.getParcelableExtra<Makanan>(MainActivity.INTENT_PARCELABLE)

        val imgMakanan = findViewById<ImageView>(R.id.img_item_photo)
        val namaMakanan = findViewById<TextView>(R.id.tv_item_name)
        val descMakanan = findViewById<TextView>(R.id.tv_item_description)

        imgMakanan.setImageResource(makanan?.imgMakanan!!)
        namaMakanan.text = makanan.namaMakanan
        descMakanan.text = makanan.descMakanan
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}