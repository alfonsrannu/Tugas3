package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas3.databinding.ActivityForgetBinding
import com.example.tugas3.databinding.ActivityMainBinding

class Forget : AppCompatActivity() {
    private lateinit var binding: ActivityForgetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forget)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityForgetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val EmaileditText: EditText = findViewById(R.id.edtEmail)
        EmaileditText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                EmaileditText.setText("") // Hapus teks saat fokus
            }
        }

        val editText: EditText = findViewById(R.id.edtSetPassword)
        editText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                editText.setText("") // Hapus teks saat fokus
            }
        }





    }
}