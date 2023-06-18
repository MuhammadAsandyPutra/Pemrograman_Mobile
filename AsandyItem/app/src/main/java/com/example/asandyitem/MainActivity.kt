package com.example.asandyitem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter
    private lateinit var secondAdapter: SecondAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        adapter = ItemAdapter(getItemList(), object : ItemAdapter.OnItemClickListener {
            override fun onItemClick(item: Item) {

                val intent = Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra("name", item.name)
                    putExtra("image", item.image)
                    putExtra("description", item.description)
                    putExtra("award", item.award)
                    putExtra("domain", item.domain)
                }
                startActivity(intent)
            }
        })

        // Inisialisasi Adapter ke dua
        secondAdapter = SecondAdapter(getItemList2(), object : SecondAdapter.OnItemClickListener {
            override fun onItemClick(item: Item2) {
                val intent = Intent(this@MainActivity, DetailActivity2::class.java).apply {
                    putExtra("name", item.name)
                    putExtra("image", item.image)
                    putExtra("description", item.description)
                    putExtra("price", item.price)
                    putExtra("enginePower", item.enginePower)
                }
                startActivity(intent)
            }
        })

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.mobil -> {
                    recyclerView.adapter = adapter
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.motor -> {
                    recyclerView.adapter = secondAdapter
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }
    }

    private fun getItemList(): List<Item> {
        val items = mutableListOf<Item>()
        items.add(
            Item(
                "ASTON MARTIN",
                R.drawable.aston_martin,
                getString(R.string.detail_a),
                " Awards Terakhir: \"Sportscar of the Year\" untuk mobil Vantage di ajang Auto Express New Car Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1913"
            )
        )

        items.add(
            Item(
                "AUDI",
                R.drawable.audi,
                getString(R.string.detail_b),
                "Awards Terakhir: \"Best Electric Car\" untuk Audi e-tron di ajang What Car? Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1909"
            )
        )
        items.add(
            Item(
                "BENTLEY",
                R.drawable.bentley,
                getString(R.string.detail_c),
                "Awards Terakhir: \"Luxury Car of the Year\" untuk Continental GT V8 di ajang Auto Express New Car ",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1919"
            )
        )
        items.add(
            Item(
                "BMW",
                R.drawable.bmw,
                getString(R.string.detail_d),
                "Awards Terakhir: \"Best Executive Car\" untuk Seri 5 di ajang Fleet News Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1916"
            )
        )
        items.add(
            Item(
                "BUGATTI",
                R.drawable.bugatti,
                getString(R.string.detail_e),
                "Awards Terakhir: \"Hypercar of the Year\" untuk Bugatti Chiron Pur Sport di ajang Top Gear Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1909"
            )
        )
        items.add(
            Item(
                "CADILLAC",
                R.drawable.cadillac,
                getString(R.string.detail_f),
                "Awards Terakhir: \"Best Large Luxury SUV\" untuk Cadillac Escalade di ajang Edmunds Top Rated Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1902"
            )
        )
        items.add(
            Item(
                "HYUNDAI",
                R.drawable.hyundai,
                getString(R.string.detail_g),
                "Awards Terakhir: \"North American Car of the Year\" untuk Hyundai Elantra di ajang North American Car, Utility and Truck of the Year Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1967"
            )
        )
        items.add(
            Item(
                "LAMBORGHINI",
                R.drawable.lamborghini,
                getString(R.string.detail_h),
                "Awards Terakhir:  \"Supercar of the Year\" untuk Lamborghini Huracán Evo di ajang Top Gear Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1963"
            )
        )
        items.add(
            Item(
                "MAZDA",
                R.drawable.mazda,
                getString(R.string.detail_i),
                "Awards Terakhir:  \"Best Large SUV\" untuk Mazda CX-9 di ajang Car and Driver 10Best Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1931"
            )
        )
        items.add(
            Item(
                "MERCEDES-BENZ",
                R.drawable.mercedes,
                getString(R.string.detail_j),
                "Awards Terakhir:  \"World Luxury Car\" untuk Mercedes-Benz S-Class di ajang World Car Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1926"
            )
        )
        items.add(
            Item(
                "MITSUBISHI",
                R.drawable.mitsubishi,
                getString(R.string.detail_k),
                "Awards Terakhir: \"Small Crossover of the Year\" untuk Mitsubishi ASX di ajang Auto Express New Car Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1917"
            )
        )
        items.add(
            Item(
                "NISSAN",
                R.drawable.nissan,
                getString(R.string.detail_l),
                "Awards Terakhir: \"Best Small SUV\" untuk Nissan Juke di ajang Auto Trader New Car Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1933"
            )
        )
        items.add(
            Item(
                "PORSCHE",
                R.drawable.porsche,
                getString(R.string.detail_m),
                "Awards Terakhir: \"Best Performance Car\" untuk Porsche 911 di ajang What Car? Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1948"
            )
        )
        items.add(
            Item(
                "TOYOTA",
                R.drawable.toyota,
                getString(R.string.detail_n),
                "Awards Terakhir: \"Best Hybrid Car\" untuk Toyota Yaris di ajang What Car? Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1937"
            )
        )
        items.add(
            Item(
                "VOLVO",
                R.drawable.volvo,
                getString(R.string.detail_o),
                "Awards Terakhir: \"Best Estate Car\" untuk Volvo V60 di ajang What Car? Awards.",
                "Lingkup Produk: Aston Martin: mobil mewah dan sport, seperti mobil sport DB11, DBS Superleggera, Vantage, dan Rapide AMR.",
                "Tahun didirikan: 1927"
            )
        )

        return items
    }

    private fun getItemList2(): List<Item2> {
        val items = mutableListOf<Item2>()
        items.add(
            Item2(
                "ENERGICA EXPERIA",
                "Tahun Pembuatan: 2014",
                R.drawable.motor1,
                "Energica Experia mempunyai tampilan dan handling keseluruhan yang bagus, dipadukan dengan gaya aero dinamis yang menawan." +
                        "Sepeda motor listrik ini merupakan yang terbaik pada ranah marketnya ",
                "Harga: \$25,880",
                "Engine: 75 kW – 102 Hp"
            )
        )
        items.add(
            Item2(
                "CAKE KALK INK E-MBIKE",
                "Tahun Pembuatan: 2020",
                R.drawable.motor2,
                "Cake Kalk INK menggabungkan tiga mode pengendaraan yang menyesuaikan kecepatan dan tenaga untuk memberikan tingkat jangkauan baterai  yang berbeda" +
                        ". Tiga mode pengereman lainnya dapat dengan sempurna beradaptasi dengan apa yang terjadi saat pengguna melepas pedal gas",
                "Harga: \$11,580",
                "Engine: 11 kW – 15 hp"
            )
        )
        items.add(
            Item2(
                "BMW CE 04",
                "Tahun Pembuatan: 2022",
                R.drawable.motor3,
                "BMW CE 04 bukanlah sepeda motor biasa. Bentuknya yang terbilang rendah dengan jok yang memanjang mungkin membuat kita teringat pada jetski",
                "Harga: \$11,795",
                "Engine: 31 kW – 42 hp"
            )
        )
        items.add(
            Item2(
                "ZERO FX",
                "Tahun Pembuatan: 2013",
                R.drawable.motor4,
                "Zero FX paling nyaman digunakan pada jalan setapak, di mana motor ini akan membuat kita fokus untuk menemukan jalan pintas sambil menjelajahi alam",
                "Harga: \$12,995",
                "Engine: 34 kW – 46 hp"
            )
        )
        items.add(
            Item2(
                "ONYX RCR",
                "Tahun Pembuatan: 2018",
                R.drawable.motor5,
                "Menghadirkan kembali nostalgia dengan tampilan cafe-racer dan sticker sert kayu." +
                        "Motor ini dirancang dengan 2 model yang berbeda, satu untuk pengguna jalan biasa dan kedua untuk trail riding",
                "Harga: \$5,750",
                "Engine: 13 kW – 17 hp"
            )
        )
        items.add(
            Item2(
                "VESPA ELETTRICA",
                "Tahun Pembuatan: 2018",
                R.drawable.motor6,
                "Vespa ini memiliki keunggulan di bawah rata-rata. Layar bagian dalam yang dapat terhubung dengan ponsel pengguna." +
                        "Dan memiliki enam varian yang sangat cocok untuk sepeda motor listrik bertipe skuter ini sangat menarik",
                "Harga: \$7,499",
                "Engine: 4 kW – 5 hp"
            )
        )
        items.add(
            Item2(
                "LIGHTNING LS-218",
                "Tahun Pembuatan: 2014",
                R.drawable.motor7,
                "Memiliki harga yang jauh lebih mahal daripada yang lain, desainnya yang luar biasa menghadirkan gaya motor sport yang bagus," +
                        "maka dari itu mulai dari jangkauan kecepatan dan top speed, motor ini yang paling unggul",
                "Harga: \$38,888",
                "Engine: 150 kW – 200 hp"
            )
        )
        items.add(
            Item2(
                "ARC VECTOR",
                "Tahun Pembuatan: 2020",
                R.drawable.motor8,
                "Memiliki penghargaan sebagai motor tercanggih di dunia, Vector menggabungkan Human Machine Interface dengan helm tampilan" +
                        "Head-Up Arc Pilot System dan Origin Jacket yang sangat bagus",
                "Harga: \$120,000",
                "Engine: 87 kW – 117 hp"
            )
        )
        items.add(
            Item2(
                "PURSANG E-TRACKER",
                "Tahun Pembuatan: 2020",
                R.drawable.motor9,
                "Memiliki tampilan yang apik dan bertenaga serta posisi berkendara yang bagis untuk off-road yang cukup agresif",
                "Harga: \$14,900",
                "Engine: 11 kW – 15 hp"
            )
        )
        items.add(
            Item2(
                "CAKE OSA FLEX",
                "Tahun Pembuatan: 2021",
                R.drawable.motor10,
                "Memiliki utilitas yang berkinerja tinggi dan dilengkapi dengan lebih dari seribu aksesori untuk menangani semua situasi" +
                        "dengan mudah.",
                "Harga: \$8,880",
                "Engine: 5 kW – 7 hp"
            )
        )
        items.add(
            Item2(
                "DAMON HYPERSHOT PREMIER",
                "Tahun Pembuatan: 2020",
                R.drawable.motor11,
                "Sebagai salah satu roadster elektrik terbaik dengan 2 roda, Hypersport memiliki kecepatan yang tinggi dan sangat awet walau" +
                        "sudah lama digunakan",
                "Harga: \$19,000",
                "Engine: 149 kW – 200 hp"
            )
        )
        items.add(
            Item2(
                "LIVEWIRE S2 DEL MAR",
                "Tahun Pembuatan: 2022",
                R.drawable.motor12,
                "Dengan tampilannya yang sama seperti Harley Davidson, motor ini terbilang sangat ekslusif dan meskipun tidak bergemuruh seperti" +
                        "layaknya Harleu Davidson",
                "Harga: \$17,699",
                "Engine: 59.6 kW – 80 hp"
            )
        )
        items.add(
            Item2(
                "EVOKE 6061",
                "Tahun Pembuatan: 2019",
                R.drawable.motor13,
                "Sepeda motor listrik rakitan tangan ini sangat memanjakan mata dengan desainnya yang minimalis, akan tetapi juga memiliki" +
                        "kecepatan yang tinggi ketika digunakan",
                "Harga: \$24,995",
                "Engine: 120 kW – 160 hp"
            )
        )
        items.add(
            Item2(
                "SUPER SOCO TC",
                "Tahun Pembuatan: 2017",
                R.drawable.motor14,
                "Super Soco TC memiliki bentuk seperti cafe-racer yang membawa kembali kenangan-kenangan menarik, serta memiliki harga yang " +
                        "masih terbilang terjangkau.",
                "Harga: \$3,330",
                "Engine: 1.9 kW – 2.5 horsepower"
            )
        )
        items.add(
            Item2(
                "SONDORDS METACYCLE",
                "Tahun Pembuatan: 2021",
                R.drawable.motor15,
                "SONDORDS merupakan salah satu motor listrik murah yang terbaik, memiliki kecepatan yang tinggi dan pack baterai" +
                        "yang mudah untuk dikeluarkan sehingga dapat dicas dengan praktis",
                "Harga: \$6,500",
                "Engine: 14.5 kW – 20 hp"
            )
        )
        return items
    }
}
