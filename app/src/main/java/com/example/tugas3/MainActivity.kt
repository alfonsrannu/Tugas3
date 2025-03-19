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

        binding.btn2.setOnClickListener {
            Toast.makeText(this, binding.editMessage.text.toString(), Toast.LENGTH_SHORT).show()
        }

        val editText: EditText = findViewById(R.id.editMessage)
        editText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                editText.setText("") // Hapus teks saat fokus
            }
        }


        val logoutText: TextView = findViewById(R.id.LogOuttext)
        logoutText.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

            // Opsional: Menutup MainActivity jika logout
            finish()
        }

    }
}