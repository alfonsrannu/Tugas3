package com.example.tugas3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<ItemData>("item")

        data?.let {
            binding.imageView6.setImageResource(it.img)
            binding.textView3.text = it.nama
            binding.textView8.text = it.detail
        }
    }
}
