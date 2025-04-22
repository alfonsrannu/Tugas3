package com.example.tugas3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas3.databinding.ActivityMainBinding
import com.example.tugas3.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var hanyutRecyclerView: RecyclerView
    private lateinit var hanyutAdapter: MyAdapter
    private lateinit var listHanyut: ArrayList<ItemData>
    private lateinit var binding: ActivityRecyclerBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        hanyutRecyclerView = findViewById(R.id.HanyutRV)
        listHanyut = ArrayList()

        listHanyut.add(
            ItemData(
                R.drawable.orca2,
                "ORCA",
                "King Of the Sea",
                " Apong Made In Papua"
            )
        )
        listHanyut.add(ItemData(R.drawable.hiupaus, "HIU PAUS", "Deep Sea Voyager", ""))
        listHanyut.add(ItemData(R.drawable.dolphine, "LUMBA LUMBA", "Naugthy Gang", ""))
        listHanyut.add(ItemData(R.drawable.penguin, "PENGUIN", "Ice Prince", ""))
        listHanyut.add(ItemData(R.drawable.squid, "CUMI", "Dark Ocean Knight", ""))
        listHanyut.add(ItemData(R.drawable.seaeel, "BELUT MORAY", "King Of The Ocean Tunnels", ""))
        listHanyut.add(ItemData(R.drawable.crab, "KEPITING", "Coast Guard", ""))
        listHanyut.add(ItemData(R.drawable.bluewhale, "PAUS BIRU", "Marine Melodist", ""))
        listHanyut.add(ItemData(R.drawable.tuna, "TUNA", "Ocean Sprinter", ""))
        listHanyut.add(ItemData(R.drawable.jellyfish, "UBUR UBUR", "Sea Angel", ""))
        listHanyut.add(ItemData(R.drawable.plankton, "PLANKTON", "Marine Luminary", ""))
        listHanyut.add(ItemData(R.drawable.penyu, "PENYU", "Wise Ocean Knigth", ""))
        listHanyut.add(ItemData(R.drawable.seahorse, "KUDA LAUT", "Sea Cowboy", ""))
        listHanyut.add(ItemData(R.drawable.whiteshark, "HIU PUTIH", "Great White Shark", ""))


        hanyutRecyclerView.layoutManager = LinearLayoutManager(this)
        hanyutRecyclerView.setHasFixedSize(true)
        hanyutAdapter = MyAdapter(listHanyut)
        hanyutRecyclerView.adapter = hanyutAdapter

        hanyutAdapter.onItemClick = { selectedItem ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("item", selectedItem)
            startActivity(intent)
        }
    }
}
