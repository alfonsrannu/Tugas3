package com.example.tugas3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        hanyutRecyclerView = findViewById(R.id.HanyutRV)
        listHanyut = ArrayList()

        listHanyut.add(ItemData(R.drawable.orca2, "ORCA", "Orcinus Orca",
            "Orca adalah paus bergigi yang hidup di laut, dikenal sebagai predator puncak yang cerdas dan memiliki struktur sosial kompleks. Mereka memiliki ciri khas warna hitam dan putih yang kontras.\n" +
                "\n" +
                "Orca hidup di berbagai wilayah laut di dunia dan memakan berbagai jenis mangsa, termasuk ikan, mamalia laut, dan bahkan paus lainnya. Mereka dikenal karena kemampuan berburu yang efektif dan kerja sama tim yang kuat."))

        listHanyut.add(ItemData(R.drawable.hiupaus, "HIU PAUS", "Rhincodon Typus",
            "Hiu Paus (Rhincodon typus) adalah spesies hiu terbesar di dunia yang hidup di laut tropis dan subtropis. Mereka memiliki tubuh yang besar dan panjang, dapat mencapai hingga 20 meter, dengan warna abu-abu dan bintik-bintik putih.\n" +
                    "\n" +
                    "Hiu Paus adalah penyaring makanan yang memakan plankton, ikan kecil, dan organisme laut lainnya. Mereka berenang dengan mulut terbuka lebar, menyaring air laut untuk mendapatkan makanan. Hiu Paus dikenal sebagai hewan yang jinak dan tidak agresif terhadap manusia."))

        listHanyut.add(ItemData(R.drawable.dolphine, "LUMBA LUMBA", "Delphinus delphis",
            "Lumba-lumba biasa (Delphinus delphis) adalah spesies lumba-lumba yang hidup di laut tropis dan subtropis di seluruh dunia. Mereka memiliki tubuh yang ramping dan fleksibel, dengan warna abu-abu dan pola garis-garis khas di sisi tubuhnya.\n" +
                    "\n" +
                    "Lumba-lumba biasa dikenal karena kecerdasannya yang tinggi dan kemampuan sosialnya yang kuat. Mereka hidup dalam kelompok besar, berkomunikasi dengan menggunakan suara klik dan siulan, dan berburu ikan serta organisme laut lainnya dengan kerja sama tim yang efektif."))

        listHanyut.add(ItemData(R.drawable.penguin, "PENGUIN", "Aptenodytes forsteri",
            "Penguin Emperor (Aptenodytes forsteri) adalah spesies penguin terbesar di dunia. Mereka hidup di Antartika dan dikenal karena kemampuan adaptasinya yang luar biasa terhadap lingkungan yang ekstrem. Penguin Emperor memiliki bulu tebal dan lapisan lemak yang membantu mereka tetap hangat di suhu yang sangat rendah.\n" +
                    "\n" +
                    "Penguin Emperor adalah spesies yang sangat sosial dan hidup dalam koloni besar. Mereka memiliki ritual perkawinan yang unik dan induk penguin bergantian mengerami telur dan mencari makanan. Penguin Emperor juga dikenal karena kemampuan berenangnya yang luar biasa dan kemampuannya untuk menyelam hingga kedalaman yang sangat dalam untuk mencari makanan."))

        listHanyut.add(ItemData(R.drawable.squid, "CUMI", "Loligo vulgaris",
            "Cumi-cumi biasa (Loligo vulgaris) adalah spesies cumi-cumi yang hidup di laut dangkal dan hangat di seluruh dunia. Mereka memiliki tubuh yang panjang dan ramping dengan delapan lengan dan dua tentakel yang panjang, yang digunakan untuk menangkap mangsa.\n" +
                    "\n" +
                    "Cumi-cumi biasa adalah predator yang aktif dan memakan berbagai jenis hewan laut kecil, seperti ikan, krustasea, dan moluska. Mereka juga dikenal karena kemampuan kamuflase dan perubahan warna kulitnya yang cepat, yang membantu mereka menghindari predator dan menangkap mangsa. Cumi-cumi biasa juga merupakan sumber makanan penting bagi banyak hewan laut lainnya."))

        listHanyut.add(ItemData(R.drawable.seaeel, "BELUT MORAY", "Gymnothorax javanicus",
            "Belut moray adalah spesies ikan laut yang termasuk dalam famili Muraenidae. Mereka memiliki tubuh yang panjang dan ramping, seperti ular, dengan kulit yang licin dan tidak bersisik. Belut moray hidup di laut tropis dan subtropis, biasanya di celah-celah karang atau batu.\n" +
                    "\n" +
                    "Belut moray adalah predator yang efektif dan memakan berbagai jenis hewan laut kecil, seperti ikan, krustasea, dan moluska. Mereka memiliki gigi yang tajam dan kuat, serta kemampuan untuk menyembunyikan diri di tempat-tempat yang tersembunyi. Meskipun terlihat menakutkan, belut moray umumnya tidak agresif terhadap manusia kecuali jika mereka merasa terancam atau terganggu."))

        listHanyut.add(ItemData(R.drawable.crab, "KEPITING", "Ocypode ceratophthalmus",
            "Kepiting pantai adalah jenis kepiting yang hidup di daerah pantai berpasir dan berbatu. Mereka memiliki cangkang yang keras dan capit yang kuat, yang digunakan untuk melindungi diri dan mencari makanan. Kepiting pantai biasanya memiliki warna yang sesuai dengan lingkungan sekitarnya, sehingga mereka dapat bersembunyi dari predator.\n" +
                    "\n" +
                    "Kepiting pantai dikenal karena kemampuan mereka menggali lubang di pasir dan berlari dengan cepat. Mereka juga memiliki kemampuan untuk beradaptasi dengan lingkungan yang berubah-ubah, seperti perubahan suhu dan kadar air. Kepiting pantai memakan berbagai jenis organisme kecil, seperti plankton, moluska, dan detritus, yang mereka temukan di pantai."))

        listHanyut.add(ItemData(R.drawable.bluewhale, "PAUS BIRU", "Balaenoptera musculus",
            "Paus Biru (Balaenoptera musculus) adalah spesies paus terbesar di dunia, dengan panjang tubuh yang dapat mencapai hingga 30 meter dan berat yang dapat mencapai hingga 180 ton. Mereka hidup di lautan seluruh dunia, dari kutub hingga perairan tropis, dan dikenal karena kemampuan mereka berenang dengan kecepatan yang luar biasa.\n" +
                    "\n" +
                    "Paus Biru adalah hewan penyaring yang memakan krill dan organisme kecil lainnya. Mereka memiliki cara makan yang unik, yaitu dengan menyaring air laut melalui lempengan-lempengan tanduk yang disebut baleen. Paus Biru juga dikenal karena suara mereka yang keras dan kompleks, yang digunakan untuk komunikasi dan navigasi. Namun, Paus Biru saat ini terancam oleh perubahan iklim dan aktivitas manusia lainnya, sehingga upaya konservasi sangat penting untuk melindungi spesies ini."))

        listHanyut.add(ItemData(R.drawable.tuna, "TUNA", "Thunnus albacares",
            "Tuna Madidihang atau Yellowfin Tuna (Thunnus albacares) adalah spesies ikan tuna yang hidup di perairan tropis dan subtropis di seluruh dunia. Mereka memiliki tubuh yang ramping dan sirip kuning yang panjang, yang membantu mereka berenang dengan kecepatan tinggi. Yellowfin Tuna dapat tumbuh hingga panjang 2 meter dan berat hingga 130 kilogram.\n" +
                    "\n" +
                    "Yellowfin Tuna adalah predator yang aktif dan memakan berbagai jenis ikan kecil, krustasea, dan cephalopoda. Mereka juga merupakan sumber makanan penting bagi banyak manusia dan merupakan salah satu spesies tuna yang paling banyak ditangkap secara komersial. Namun, populasi Yellowfin Tuna saat ini terancam oleh penangkapan yang berlebihan, sehingga upaya konservasi dan pengelolaan sumber daya laut sangat penting untuk melindungi spesies ini."))

        listHanyut.add(ItemData(R.drawable.jellyfish, "UBUR UBUR", "Aurelia aurita",
            "Ubur-ubur bulan (Aurelia aurita) adalah spesies ubur-ubur yang umum ditemukan di perairan dangkal di seluruh dunia. Mereka memiliki tubuh yang transparan dan berbentuk seperti bulan, dengan tentakel yang panjang dan tipis. Ubur-ubur bulan relatif tidak berbahaya bagi manusia dan sering ditemukan di pantai dan perairan estuari.\n" +
                    "\n" +
                    "Ubur-ubur bulan memakan plankton dan organisme kecil lainnya yang mereka tangkap dengan tentakel mereka. Mereka memiliki siklus hidup yang kompleks, dengan fase polip yang menetap di dasar laut dan fase medusa yang berenang bebas. Ubur-ubur bulan sering digunakan sebagai contoh dalam studi biologi laut karena siklus hidup mereka yang unik dan kemampuan mereka untuk beradaptasi dengan lingkungan yang berubah-ubah."))

        listHanyut.add(ItemData(R.drawable.plankton, "PLANKTON", "Copepoda (seperti genus Calanus)",
            "Zooplankton laut adalah kelompok organisme kecil yang hidup di laut dan terbawa oleh arus. Mereka termasuk dalam berbagai jenis hewan kecil, seperti copepoda, larva udang, larva ikan, dan lain-lain. Zooplankton laut memakan fitoplankton atau organisme kecil lainnya, dan mereka sendiri menjadi sumber makanan bagi banyak hewan laut lainnya, seperti ikan kecil, paus, dan burung laut.\n" +
                    "\n" +
                    "Zooplankton laut memainkan peran penting dalam ekosistem laut sebagai penghubung antara produsen primer (fitoplankton) dan konsumen tingkat tinggi (ikan, paus, dan lain-lain). Mereka juga berperan dalam proses biologis laut, seperti siklus nutrisi dan penyerapan karbon. Zooplankton laut dapat ditemukan di berbagai kedalaman laut, dari permukaan hingga zona abyssal, dan mereka memiliki adaptasi yang unik untuk bertahan hidup di lingkungan laut yang dinamis."))

        listHanyut.add(ItemData(R.drawable.penyu, "PENYU", "Chelonia mydas",
            "Penyu Hijau (Chelonia mydas) adalah spesies penyu yang hidup di perairan tropis dan subtropis di seluruh dunia. Mereka memiliki cangkang yang kuat dan kaki yang berbentuk dayung, yang membantu mereka berenang dengan kecepatan yang luar biasa. Penyu Hijau memakan rumput laut dan alga, sehingga mereka memainkan peran penting dalam menjaga keseimbangan ekosistem laut.\n" +
                    "\n" +
                    "Penyu Hijau sering ditemukan di daerah terumbu karang dan pantai berpasir, di mana mereka bertelur dan berkembang biak. Namun, spesies ini saat ini terancam oleh perburuan, polusi, dan kerusakan habitat, sehingga upaya konservasi sangat penting untuk melindungi mereka. Penyu Hijau juga merupakan indikator kesehatan ekosistem laut, sehingga perlindungan mereka juga membantu menjaga keseimbangan lingkungan laut secara keseluruhan."))

        listHanyut.add(ItemData(R.drawable.seahorse, "KUDA LAUT", "Hippocampus trimaculatus",
            "Kuda laut biasa (Hippocampus trimaculatus) adalah spesies kuda laut yang hidup di perairan dangkal di wilayah Indo-Pasifik. Mereka memiliki tubuh yang unik dengan bentuk kepala seperti kuda dan ekor yang dapat digunakan untuk berpegangan pada objek lain. Kuda laut biasa memiliki warna tubuh yang bervariasi, dari coklat hingga kuning, dengan bintik-bintik yang membantu mereka berkamuflase di lingkungan sekitar.\n" +
                    "\n" +
                    "Kuda laut biasa memakan plankton dan krustasea kecil yang mereka tangkap dengan moncong panjang mereka. Mereka juga dikenal karena perilaku unik mereka, di mana jantan akan mengandung telur di dalam kantong brood mereka dan melahirkan anak-anak kuda laut. Kuda laut biasa hidup di daerah terumbu karang dan padang lamun, dan mereka sering ditemukan berpasangan atau berkelompok kecil. Namun, populasi kuda laut biasa terancam oleh kerusakan habitat dan penangkapan yang berlebihan."))

        listHanyut.add(ItemData(R.drawable.whiteshark, "HIU PUTIH", "Carcharodon carcharias",
            "Hiu Putih (Carcharodon carcharias) adalah salah satu spesies hiu terbesar di dunia, dengan panjang tubuh yang dapat mencapai hingga 6 meter dan berat yang dapat mencapai hingga 2 ton. Mereka memiliki tubuh yang ramping dan berwarna abu-abu putih, dengan gigi yang tajam dan kuat yang digunakan untuk memangsa mangsa mereka. Hiu Putih hidup di perairan laut di seluruh dunia, dari perairan tropis hingga perairan dingin, dan mereka dikenal karena kemampuan mereka berenang dengan kecepatan yang luar biasa.\n" +
                    "\n" +
                    "Hiu Putih adalah predator puncak yang memainkan peran penting dalam ekosistem laut. Mereka memakan berbagai jenis mangsa, termasuk ikan, anjing laut, dan bahkan paus kecil. Hiu Putih juga dikenal karena kekuatan dan ketahanan mereka yang luar biasa, serta kemampuan mereka untuk mendeteksi mangsa dengan menggunakan indera penciuman yang tajam. Namun, Hiu Putih saat ini terancam oleh penangkapan yang berlebihan dan kerusakan habitat, sehingga upaya konservasi sangat penting untuk melindungi spesies ini."))


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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.Logout -> {
                startActivity(Intent(this, Login::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
