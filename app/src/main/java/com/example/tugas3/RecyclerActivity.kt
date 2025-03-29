package com.example.tugas3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    private lateinit var hanyutRecyclerView: RecyclerView
    private lateinit var hanyutAdapter: MyAdapter
    private lateinit var listHanyut : ArrayList<ItemData>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        hanyutRecyclerView = findViewById(R.id.HanyutRV)
        listHanyut = ArrayList()

        listHanyut.add(ItemData(R.drawable.orca2, nama = "ORCA", desc = "King Of the Sea"))
        listHanyut.add(ItemData(R.drawable.hiupaus, nama = "HIU PAUS", desc = "Deep Sea Voyager"))
        listHanyut.add(ItemData(R.drawable.dolphine, nama = "LUMBA LUMBA", desc = "Naugthy Gang"))
        listHanyut.add(ItemData(R.drawable.penguin, nama = "PENGUIN", desc = "Ice Prince"))
        listHanyut.add(ItemData(R.drawable.squid, nama = "CUMI", desc = "Dark Ocean Knight"))
        listHanyut.add(ItemData(R.drawable.seaeel, nama = "BELUT MORAY", desc = "King Of The Ocean Tunnels"))
        listHanyut.add(ItemData(R.drawable.crab, nama = "KEPITING", desc = "Coast Guard"))
        listHanyut.add(ItemData(R.drawable.bluewhale, nama = "PAUS BIRU", desc = "Marine Melodist"))
        listHanyut.add(ItemData(R.drawable.tuna, nama = "TUNA", desc = "Ocean Sprinter"))
        listHanyut.add(ItemData(R.drawable.jellyfish, nama = "UBUR UBUR", desc = "Sea Angel"))
        listHanyut.add(ItemData(R.drawable.plankton, nama = "PLANKTON", desc = "Marine Luminary"))
        listHanyut.add(ItemData(R.drawable.penyu, nama = "PENYU", desc = "Wise Ocean Knigth"))
        listHanyut.add(ItemData(R.drawable.seahorse, nama = "KUDA LAUT", desc = "Sea Cowboy"))
        listHanyut.add(ItemData(R.drawable.whiteshark, nama = "HIU PUTIH", desc = "Great White Shark"))





        hanyutRecyclerView.layoutManager = LinearLayoutManager(this)
        hanyutRecyclerView.setHasFixedSize(true)
        hanyutAdapter = MyAdapter(listHanyut)
        hanyutRecyclerView.adapter = hanyutAdapter
    }
}