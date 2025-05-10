package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas3.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        // Tombol untuk menuju ke RecyclerActivity
        binding.btnTugas4.setOnClickListener {
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }

        // Tombol untuk menampilkan pesan Toast dari EditText
        binding.btn2.setOnClickListener {
            Toast.makeText(this, binding.editMessage.text.toString(), Toast.LENGTH_SHORT).show()
        }

        // Tombol untuk logout
        binding.LogOuttext.setOnClickListener {
            firebaseAuth.signOut() // Tambahkan ini agar benar-benar logout dari Firebase
            val intent = Intent(this, Login::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK // Bersihkan backstack
            startActivity(intent)
        }

        // Tombol untuk membagikan pesan dari EditText
        binding.btnShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, binding.editMessage.text.toString())
                type = "text/plain"
            }
            startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"))
        }
    }
}
