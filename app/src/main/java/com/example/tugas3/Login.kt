package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas3.databinding.ActivityLoginBinding
import com.example.tugas3.databinding.ActivityMainBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        val EmaileditText: EditText = findViewById(R.id.editTextTextEmailAddress)
        EmaileditText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                EmaileditText.setText("") // Hapus teks saat fokus
            }
        }

        val PasswordeditText: EditText = findViewById(R.id.editTextTextPassword)
        PasswordeditText.setOnFocusChangeListener{_, hasFocus ->
            if (hasFocus) {
                PasswordeditText.setText("") // Hapus teks saat fokus
            }
        }

        val NewText: TextView = findViewById(R.id.textView3)
        NewText.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)

            // Opsional: Menutup MainActivity jika logout
            finish()
        }


    }
}