package com.example.recyclerview_cahyo_06

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makananList = listOf<Makanan>(
            Makanan(
                R.drawable.mochi,
            "Mochi",
                "Mochi adalah kue Jepang yang terbuat dari beras ketan, ditumbuk sehingga lembut dan lengket, kemudian dibentuk menjadi bulat."
            ),
            Makanan(
                R.drawable.pangsit,
            "Pangsit",
                "Pangsit, atau kadang disebut sebagai wonton, adalah makanan berupa daging cincang yang dibungkus lembaran tepung terigu."
            ),
            Makanan(
                R.drawable.rendang,
            "Rendang",
                "Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau."
            ),
            Makanan(
                R.drawable.nasigoreng,
            "Nasi Goreng",
                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega."
            ),
            Makanan(
                R.drawable.pempek,
                "Pempek",
                "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam."
            ),
            Makanan(
                R.drawable.sate,
                "Sate",
                "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MakananAdapter(this, makananList){
            val intent = Intent(this, DetailMakananActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}