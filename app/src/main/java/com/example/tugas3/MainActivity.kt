package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTugas4.setOnClickListener {
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {
            Toast.makeText(this, binding.editMessage.text.toString(), Toast.LENGTH_SHORT).show()
        }

        binding.LogOuttext.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


        binding.btnShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, binding.editMessage.text.toString()) // Pesan yang akan dibagikan
                type = "text/plain" // Jenis data yang akan dibagikan
            }
            startActivity(Intent.createChooser(shareIntent, "Bagikan melalui")) // Menampilkan aplikasi-aplikasi berbagi pesan
        }


    }
}