package com.theo.finalexam

object CatsData {
    private val catNames = arrayOf("Kucing Anggora",
        "Kucing Blacan",
        "Kucing Caracal",
        "Kucing Domestik",
        "Kucing Maine",
        "Kucing Persia",
        "Kucing Ragdoll",
        "Kucing Rusia",
        "Kucing Siam",
        "Kucing Sphynx")

    private val catDetails = arrayOf("Kucing anggora asli memiliki ciri-ciri wajah runcing, hidung mancung, tulang dan tubuh panjang. Kucing asal Turki ini memiliki warna bulu yang tidak berubah, umumnya berwarna putih bersih.",
        "Dari Sejarah kucing Blacan atau Bengal diketahui bahwa kucing macan tutul (Leopardette) atau kucing Bengal, seperti yang dikenal sekarang, adalah hasil dari percobaan yang gagal. Pada tahun 1970-an, para ilmuwan mencoba mengawin-silangkan kucing domestik berbulu pendek dengan kucing liar, macan tutul kecil - asli Asia Tenggara. Percobaan tersebut dilakukan untuk memperkenalkan kekebalan alami kucing liar terhadap penyakit Leukemia (Feline Leukaemia - FeLV) pada kucing domestik, namun sayangnya tidak berhasil. Tetapi, hibrida yang dihasilkan disilangkan lagi dengan berbagai jenis keturunan kucing seperti kucing Egyptian Mau, kucing Bombay, kucing Abyssinian, dan kucing British Shorthair, yang mana kemudian menghasilkan ras cantik ini – kucing Bengal.",
        "Kucing caracal merupakan kucing liar yang biasa ditemukan di sebagian besar wilayah Afrika dan Timur Tengah. Bulunya berwarna kuning kecokelatan atau kemerahan dan dagunya berwarna putih. Tak seperti ras kucing lainnya, kucing caracal tumbuh menjadi kucing penjelajah. Ia biasa menjelajahi sabana, gurun, dan hutan, Kucing caracal memiliki telinga yang runcing dan besar dengan ujung berwarna hitam serta sebagian bulu telinganya berumbai.",
        "Kucing domestik atau kucing yang berada di suatu daerah (wilayah), Dan di Indonesia juga memiliki kucing Domestik, yaitu kucing kampung lokal.Kucing domestik tidak bisa dikatakan sebagai kucing kampung lokal Indonesia saja karena kucing anggora juga termasuk kucing domestik yang berasal dari turki. Namun kucing domestik yang sering dikawin silangkan dengan kucing ras adalah kucing kampung lokal indonesia.",
        "Kucing Maine Coon dapat dengan mudah dibedakan karena ukuran kucing Maine Coon yang tergolong besar dan bulu mereka yang panjang. Lucunya, sejarah kucing Maine Coon menganggap ras ini sebagai penduduk asli Maine, walaupun keturunan kucing Maine Coon dapat ditemukan di berbagai negara di seluruh dunia. Meskipun merupakan ras kucing domestik terbesar, salah satu ciri-ciri kucing Maine Coon adalah memiliki sifat yang tenang dan manis",
        "Ras kucing Persia sangat lembut, tenang, dan sangat setia pada pemiliknya. Jika sifat ramah dan manis dari kucing Persia belum cukup untuk membuat Anda jatuh hati dengan mereka, perhatikan bagaimana mereka bermanja mendekam pada Anda, Anda pasti akan takluk dibuatnya. Meskipun kucing Persia berhidung datar memerlukan perhatian dan perawatan yang rutin, mereka adalah hewan peliharaan yang menyenangkan untuk dimiliki di rumah. Juga, dengan ukuran tubuh kucing Persia yang sedang, mereka cocok untuk keluarga kecil.",
        "Pemberian nama Ragdoll pada jenis kucing yang cantik ini sangat tepat karena mereka adalah jenis kucing yang akan dengan senang hati duduk di pangkuan Anda untuk waktu yang cukup lama. Kucing Ragdoll tidak hanya sangat ramah, tetapi mereka juga memiliki watak yang sangat lembut, membuat ras kucing Ragdoll cocok untuk keluarga yang memiliki anak kecil dan hewan peliharaan lainnya.",
        "Kucing biru rusia (bahasa Inggris: Russian Blue cat) adalah salah satu ras kucing yang memiliki bulu berwarna perak biru. Kucing ini sangat cerdas dan lucu, tetapi cenderung pemalu di sekitar orang asing. Kucing biru rusia merupakan kucing yang memiliki ikatan yang erat dengan sahabatnya manusia. Kucing biru rusia sering dicari karena memiliki kepribadian dan warna bulu yang disukai orang-orang. Beberapa Kucing biru rusia memiliki kupalan kecil pada bulu di bagian atas kedua matanya yang miring sedikit ke bawah untuk memberikan perasaan bahwa Kucing biru rusia terlihat kesal.",
        "Kucing Siam sangat sensitif terhadap temperatur di sekelilingnya dan tidak cocok berada di iklim yang dingin karena mantel bulu mereka yang pendek. Meskipun mereka lebih suka di lingkungan hangat, tetapi ras yang sangat cantik ini juga tidak begitu menyukai iklim yang terlalu panas,Kucing Siam termasuk salah satu ras kucing tertua yang tercatat. Mereka adalah keturunan dari keluarga kucing Felidae.",
        "Sphynx merupakan salah satu ras kucing dengan penampilan yang begitu berbeda dari kucing pada umumnya. Saat dilihat sekilas, kucing Sphynx seolah tidak memiliki bulu sama sekali alias botak, sehingga kulit tubuhnya begitu kelihatan.")

    private val catImages = intArrayOf(R.drawable.anggora,
        R.drawable.blacan,
        R.drawable.caracal,
        R.drawable.domestik,
        R.drawable.maine,
        R.drawable.persia,
        R.drawable.ragdoll,
        R.drawable.rusia,
        R.drawable.siam,
        R.drawable.sphynx)

    val listData: ArrayList<Cat>
        get() {
            val list = arrayListOf<Cat>()
            for (position in catNames.indices) {
                val cat = Cat()
                cat.name = catNames[position]
                cat.detail = catDetails[position]
                cat.photo = catImages[position]
                list.add(cat)
            }
            return list
        }
}