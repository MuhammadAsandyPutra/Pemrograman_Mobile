package com.example.asandyitem

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val image = intent.getIntExtra("image", 0)
        val description = intent.getStringExtra("description")
        val award = intent.getStringExtra("award")
        val domain = intent.getStringExtra("domain")

        val imageView: ImageView = findViewById(R.id.imageView)
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val descriptionTextView: TextView = findViewById(R.id.descriptionTextView)
        val awardTextView: TextView = findViewById(R.id.awardTextView)
        val domainTextView: TextView = findViewById(R.id.domainTextView)

        imageView.setImageResource(image)
        nameTextView.text = name
        descriptionTextView.text = description
        awardTextView.text = award
        domainTextView.text = domain
    }
}
