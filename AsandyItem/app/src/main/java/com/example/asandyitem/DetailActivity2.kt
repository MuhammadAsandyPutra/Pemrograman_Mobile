package com.example.asandyitem

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        val name2 = intent.getStringExtra("name")
        val image2 = intent.getIntExtra("image", 0)
        val description2 = intent.getStringExtra("description")
        val price2 = intent.getStringExtra("price")
        val enginePower2 = intent.getStringExtra("enginePower")

        val imageView2: ImageView = findViewById(R.id.imageView2)
        val nameTextView: TextView = findViewById(R.id.nameTextView2)
        val descriptionTextView: TextView = findViewById(R.id.descriptionTextView2)
        val priceTextView: TextView = findViewById(R.id.priceTextView2)
        val engineTextView: TextView = findViewById(R.id.engineTextView2)

        imageView2.setImageResource(image2)
        nameTextView.text = name2
        descriptionTextView.text = description2
        priceTextView.text = price2
        engineTextView.text = enginePower2
    }
}
