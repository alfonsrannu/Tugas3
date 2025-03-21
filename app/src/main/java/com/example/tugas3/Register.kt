package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas3.databinding.ActivityMainBinding
import com.example.tugas3.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val editText: EditText = findViewById(R.id.edtTextEmailAddress2)
        editText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                editText.setText("") // Hapus teks saat fokus
            }
        }

        val SpeditText: EditText = findViewById(R.id.edtSetPassword)
        SpeditText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                SpeditText.setText("") // Hapus teks saat fokus
            }
        }

        val CpeditText: EditText = findViewById(R.id.edtConfirmPassword)
        CpeditText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                CpeditText.setText("") // Hapus teks saat fokus
            }
        }
    }
}