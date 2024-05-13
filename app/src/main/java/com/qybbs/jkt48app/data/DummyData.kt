package com.qybbs.jkt48app.data

import com.qybbs.jkt48app.R
import com.qybbs.jkt48app.model.Product
import com.qybbs.jkt48app.model.News
import com.qybbs.jkt48app.model.Member

object DummyData {
    val jkt48member = listOf(
        Member(
            id = 1,
            nama = "Amanda Sukma",
            panggilan = "Amanda",
            gen = "10",
            photo = R.drawable.amanda_sukma
        ),
        Member(
            id = 2,
            nama = "Angelina Christy",
            panggilan = "Christy",
            gen = "7",
            photo = R.drawable.angelina_christy
        ),
        Member(
            id = 3,
            nama = "Aurellia",
            panggilan = "Lia",
            gen = "10",
            photo = R.drawable.aurellia
        ),
        Member(
            id = 4,
            nama = "Azizi Asadel",
            panggilan = "Zee",
            gen = "7",
            photo = R.drawable.azizi_asadel
        ),
        Member(
            id = 5,
            nama = "Callista Alifia",
            panggilan = "Callie",
            gen = "10",
            photo = R.drawable.callista_alifia
        ),
        Member(
            id = 6,
            nama = "Cornellia Vanisa",
            panggilan = "Oniel",
            gen = "8",
            photo = R.drawable.cornelia_vanisa
        ),
        Member(
            id = 7,
            nama = "Febriola Sinambela",
            panggilan = "Olla",
            gen = "7",
            photo = R.drawable.febriola_sinambela
        ),
        Member(
            id = 8,
            nama = "Feni Fitriyanti",
            panggilan = "Feni",
            gen = "3",
            photo = R.drawable.feni_fitriyanti
        ),
        Member(
            id = 9,
            nama = "Fiony Alveria",
            panggilan = "Fiony",
            gen = "8",
            photo = R.drawable.fiony_alveria
        ),
        Member(
            id = 10,
            nama = "Flora Shafiq",
            panggilan = "Flora",
            gen = "8",
            photo = R.drawable.flora_shafiq
        )
    )

    val jkt48news = listOf(
        News(
            id = 1,
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 “Spring Has Come”",
            photo = R.drawable._63ba7e10068d,
            desc = "Terima kasih atas dukungannya untuk JKT48\n" +
                    "\n" +
                    "Seperti telah diumumkan sebelumnya, JKT48 akan mengadakan Personal Meet & Greet Festival “Spring Has Come” pada tanggal 11 Mei 2024 di Hall 1 ICE Indonesia, BSD City, Tangerang.\n" +
                    "\n" +
                    "Selain Personal Meet & Greet dan 2-Shot, akan diadakan juga Stage Activity serta Mini Live Performance oleh member JKT48. Berikut adalah detail mengenai aktivitas yang akan dilaksanakan di event tersebut:\n" +
                    "\n" +
                    "Personal Meet & Greet dan 2-Shot akan dilakukan di Hall 1 ICE Indonesia, BSD City, mulai pukul 10.00 WIB Sampai dengan pukul 19.00 WIB.\n" +
                    "\n" +
                    "Demi menjaga kenyamanan acara, hanya pemilik tiket sesi yang sedang berlangsung yang diperbolehkan memasuki area Hall 1 ICE Indonesia, BSD.",
            url = "https://jkt48.com/news/detail/id/1791?lang=id",
        ),
        News(
            id = 2,
            title = "Pengumuman Mengenai Pre-Order Digital Photobook “JKT48 LAST VOYAGE” dengan bonus Video Call with JKT48",
            photo = R.drawable.po_photobook,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Pada tanggal 5 Mei 2024, JKT48 akan membuka Pre-Order untuk pembelian Digital Photobook “JKT48 LAST VOYAGE” dengan bonus Video Call with JKT48.\n" +
                    "\n" +
                    "JKT48 akan me-release digital photobook yang bertajuk Shani Graduation Concert “LAST VOYAGE”. Kami berharap kita semua dapat merasakan momen indah bersama Shani yang akan kita kenang selamanya. Setiap lembar dalam photobook ini merupakan kenangan dari konser perpisahan Shani.\n" +
                    "\n" +
                    "Berikut adalah detailnya:\n" +
                    "\n" +
                    "Nama produk                  : “JKT48 LAST VOYAGE”\n" +
                    "\n" +
                    "Pre-Order OFC               : 5 Mei 2024, 21.00 WIB\n" +
                    "\n" +
                    "Pre-Order General          : 6 Mei 2024, 21.00 WIB\n" +
                    "\n" +
                    "Tanggal Rilis                   : 7 Mei 2024 (download via jkt48.com)\n" +
                    "\n" +
                    "Harga                              : Rp120.000",
            url = "https://jkt48.com/news/detail/id/1786?lang=id",
        ),
        News(
            id = 3,
            title = "Pengumuman Mengenai Merchandise Spesial Shani Graduation Concert “LAST VOYAGE”",
            photo = R.drawable.last_voyage,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Demi merayakan dan menambah keseruan Shani Graduation Concert “LAST VOYAGE”, JKT48 akan merilis beberapa merchandise yang akan dijual di konser ini.\n" +
                    "1. Uchiwa Shani LAST VOYAGE\n" +
                    "\n" +
                    "Harga: Rp 30.000,00\n" +
                    "\n" +
                    "2. Neck Strap Shani LAST VOYAGE\n" +
                    "\n" +
                    "Harga: Rp 40.000,00\n" +
                    "\n" +
                    "3. Neck Strap JKT48 Puzzle\n" +
                    "\n" +
                    "Harga: Rp 40.000,00\n" +
                    "\n" +
                    "4. Neck Strap JKT48 Pink\n" +
                    "\n" +
                    "Harga: Rp 40.000,00\n" +
                    "\n" +
                    "5. T-Shirt Shani LAST VOYAGE\n" +
                    "\n" +
                    "Tersedia 3 T-Shirt dengan warna dan design yang berbeda.\n" +
                    "\n" +
                    "Harga T-Shirt ukuran (S,M,L,XL): Rp 165.000,00\n" +
                    "\n" +
                    "Harga T-Shirt ukuran (2XL,4XL): Rp 180.000,00\n" +
                    "\n" +
                    "6. Photo Pack Shani LAST VOYAGE\n" +
                    "\n" +
                    "Harga: Rp 80.000,00\n" +
                    "\n" +
                    "7. Sticker Pack Shani LAST VOYAGE\n" +
                    "\n" +
                    "Harga: Rp 50.000,00\n" +
                    "\n" +
                    "8. Lightstick JKT48 New Era\n" +
                    "\n" +
                    "Harga: Rp 280.000,00\n" +
                    "\n" +
                    "Seluruh merchandise bisa didapatkan di Official JKT48 Merchandise Booth dari pukul 09.00 WIB - 17.00 WIB. Mohon diperhatikan juga bahwa Official Merchandise Booth JKT48 tidak menerima pembayaran menggunakan cash dan hanya menerima transaksi digital menggunakan QR Code & JKT48 Point. Untuk menghindari antrian panjang ataupun kendala tidak ada sinyal, kami merekomendasikan JKT48 Point sebagai metode pembayaran.\n" +
                    "\n" +
                    "Jangan lupa kunjungi Official Merchandise Booth JKT48 dan lengkapi koleksi merchandise eksklusif kalian!",
            url = "https://jkt48.com/news/detail/id/1791?lang=id",
        ),
        News(
            id = 4,
            title = "Pengumuman Mengenai Penjualan Digital Wallpaper Pack “Ngangkring With Us” dengan bonus Video Call with JKT48 Virtual",
            photo = R.drawable.ngangkring,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Pada tanggal 5 April 2024, JKT48 akan membuka penjualan Digital Wallpaper Pack “Ngangkring With Us” dengan bonus Video Call with JKT48 Virtual.\n" +
                    "\n" +
                    "Berikut adalah detailnya:\n" +
                    "\n" +
                    "Nama produk                                   : “Ngangkring With Us”\n" +
                    "\n" +
                    "Penjualan umum                              : 5 April 2024, 21.00 WIB\n" +
                    "\n" +
                    "Tanggal Rilis                                    : 5 April 2024 (download via jkt48.com)\n" +
                    "\n" +
                    "Tanggal Video Call                          : 18 April 2024\n" +
                    "\n" +
                    "Harga                                              : Rp120.000\n" +
                    "\n" +
                    "*Pembelian hanya bisa dilakukan melalui website jkt48.com\n" +
                    "\n" +
                    "Untuk setiap pembelian Digital Wallpaper Pack “Ngangkring With Us” kalian akan mendapat bonus tiket Video Call with JKT48 Virtual. Video Call with JKT48 Virtual adalah layanan dimana kamu dapat melakukan percakapan berdua dengan member JKT48 Virtual.\n" +
                    "\n" +
                    " Berikut adalah jadwal Video Call untuk bulan April 2024.",
            url = "https://jkt48.com/news/detail/id/1773?lang=id",
        ),
        News(
            id = 5,
            title = "Pengumuman Mengenai Pre-Order Digital Photobook “JKT48 Ramadhan Special Show 2024” dengan bonus Video Call with JKT48",
            photo = R.drawable.ramadhan,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Pada tanggal 1 April 2024, JKT48 akan membuka Pre-Order untuk pembelian Digital Photobook “JKT48 Ramadhan Special Show 2024” dengan bonus Video Call with JKT48. Di bulan Ramadhan yang indah ini JKT48 me-release digital photobook yang bertajuk JKT48 Ramadhan Special Show 2024. Photobook ini menggambarkan keseruan dan kemeriahan bulan Ramadhan bersama JKT48. Setiap lembar dalam buku ini merupakan kenangan dari show special Ramadhan di Theater JKT48.\n" +
                    "\n" +
                    "Melalui digital photobook “JKT48 Ramadhan Special Show 2024” ini, kami harap bisa membawa kembali kenangan dan keceriaan Ramadhan kepada kalian semua. \n" +
                    "\n" +
                    "Berikut adalah detailnya:\n" +
                    "\n" +
                    "Nama produk                               : “JKT48 Ramadhan Special Show 2024”\n" +
                    "\n" +
                    "Pre-Order OFC                            : 1 April 2024, 21.00 WIB\n" +
                    "\n" +
                    "Pre-Order General                      : 2 April 2024, 21.00 WIB\n" +
                    "\n" +
                    "Tanggal Rilis                               : 24 April 2024 (download via jkt48.com)\n" +
                    "\n" +
                    "Harga                                         : Rp120.000\n" +
                    "\n" +
                    "*Pembelian hanya bisa dilakukan melalui website jkt48.com\n" +
                    "\n" +
                    "Untuk setiap pembelian Digital Photobook “JKT48 Ramadhan Special Show 2024” kalian akan mendapat bonus tiket Video Call with JKT48. Video Call with JKT48 adalah layanan dimana kamu dapat melakukan percakapan berdua dengan member JKT48.\n" +
                    "\n" +
                    " Berikut adalah jadwal Video Call untuk bulan April 2024.",
            url = "https://jkt48.com/news/detail/id/1772?lang=id",
        ),
        News(
            id = 6,
            title = "Pengumuman Mengenai Detail Shani Graduation Concert “LAST VOYAGE”",
            photo = R.drawable.last_voyage2,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Selama lebih dari 10  tahun, Shani telah menjadi bagian dari JKT48. Perjalanan Shani sebagai member JKT48 tak terasa telah mendekati akhir. Banyak momen berharga yang telah kita lewati bersama Shani, dari awal hingga puncaknya. Shani telah hadir untuk menghibur dan memberikan semangat untuk banyak orang.\n" +
                    "\n" +
                    "Untuk memeriahkan perayaan momen ini, JKT48 akan mengadakan sebuah konser bertajuk Shani Graduation Concert “LAST VOYAGE”, kami berharap kita semua dapat memberikan momen indah bersama Shani yang akan kita kenang selamanya.\n" +
                    "\n" +
                    "Berikut adalah informasi mengenai event dan detail penjualan tiketnya." +
                    "\n" +
                    "LAST VOYAGE - Shani Graduation Concert\n" +
                    "\n" +
                    "Tennis Indoor Senayan\n" +
                    "\n" +
                    "27 April 2024\n" +
                    "\n" +
                    "Open gate: 17.30 WIB",
            url = "https://jkt48.com/news/detail/id/1764?lang=id",
        ),
        News(
            id = 7,
            title = "Pengumuman Mengenai Shani Photobook “C’est Moi SHANI” & Bonus Signing Event",
            photo = R.drawable.cest_moi,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Perjalanan Shani di penghujung waktu sebagai member JKT48 sudah semakin dekat. Maka dari itu, kami akan merilis sebuah memorabilia sebelum Shani lulus dari JKT48 berupa photobook yang berjudul “C’est Moi SHANI” dan dapat dipesan mulai besok, Jumat 1 Maret 2024 di official store JKT48 di Tokopedia.\n" +
                    "\n" +
                    "Akan ada 400 pembeli beruntung yang dapat menghadiri Shani Photobook “C’est Moi SHANI” Signing Event sebagai bonus pembelian. Pemenang akan ditentukan melalui pengundian nomor invoice transaksi pada periode 1 Maret 2024 - 31 Maret 2024.\n" +
                    "\n" +
                    "Pada setiap 1 invoice transaksi berlaku 1 kesempatan undian. Kelipatan pembelian dalam 1 invoice akan terhitung sebagai 1 kesempatan undian.\n" +
                    "\n" +
                    "Pembeli yang ingin mengikuti undian wajib mengisi catatan produk dengan nama lengkap sesuai identitas sebagai syarat utama pengundian.\n" +
                    "\n" +
                    "Berikut adalah detail Shani Photobook “C’est Moi SHANI” Signing Event :\n" +
                    "\n" +
                    "Tanggal         : 20 April 2024\n" +
                    "Tempat          : FX Sudirman\n" +
                    "\n" +
                    "(Jl. Jend. Sudirman, RT.1/RW.3, Gelora, Kec.Tanah Abang. Jakarta Pusat. 10270) \n" +
                    "\n" +
                    "Pemenang undian akan dihubungi oleh pihak JKT48 melalui pesan di Tokopedia mengenai detail lebih lanjut pada tanggal 5 April 2024.\n" +
                    "\n" +
                    "Pada Shani Photobook “C’est Moi SHANI” Signing Event, para pemenang undian akan mendapatkan bonus sebuah photobook yang nantinya akan ditandatangani oleh Shani secara langsung.\n" +
                    "\n" +
                    "Apabila pemenang tidak hadir di Shani Photobook “C’est Moi SHANI” Signing Event, pemenang tersebut tidak akan mendapatkan bonus photobook yang ditandatangani oleh Shani. Benefit pemenang tidak dapat dipindahtangankan atau diperjualbelikan.\n" +
                    "\n" +
                    "Kami tunggu partisipasinya!\n" +
                    "\n" +
                    "Mohon dukungannya selalu untuk JKT48.",
            url = "https://jkt48.com/news/detail/id/1756?lang=id",
        ),
        News(
            id = 8,
            title = "Pengumuman Mengenai Penjualan Digital Voice Pack “Crescent Chimes” dengan bonus Video Call with JKT48 Virtual",
            photo = R.drawable.crescent,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Pada tanggal 3 Maret 2024, JKT48 akan membuka Pre-Order untuk pembelian Digital Voice Pack “Crescent Chimes” dengan bonus Video Call with JKT48 Virtual. Melalui digital voice pack \"Crescent Chimes\", kami harap kamu akan bersemangat dalam memulai dan menutup hari di bulan penuh berkah ini.\n" +
                    "\n" +
                    "Berikut adalah detailnya:\n" +
                    "\n" +
                    "Nama produk                             : “Crescent Chimes”\n" +
                    "\n" +
                    "Penjualan umum                        : 3 Maret 2024, 21.00 WIB\n" +
                    "\n" +
                    "Tanggal Rilis                               : 11 Maret 2024 (download via jkt48.com)\n" +
                    "\n" +
                    "Tanggal Video Call                     : 16 Maret 2024\n" +
                    "\n" +
                    "Harga                                         : Rp120.000\n" +
                    "\n" +
                    "*Pembelian hanya bisa dilakukan melalui website jkt48.com\n" +
                    "\n" +
                    "Untuk setiap pembelian Digital Voice Pack “Crescent Chimes” kalian akan mendapat bonus tiket Video Call with JKT48 Virtual. Video Call with JKT48 Virtual adalah layanan dimana kamu dapat melakukan percakapan berdua dengan member JKT48 Virtual.\n" +
                    "\n" +
                    " Berikut adalah jadwal Video Call untuk bulan Februari 2024.",
            url = "https://jkt48.com/news/detail/id/1755?lang=id",
        ),
        News(
            id = 9,
            title = "Pengumuman Mengenai Pre-Order Digital Photobook “Season of Warmth” dengan bonus Video Call with JKT48",
            photo = R.drawable.season,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Pada tanggal 1 Maret 2024, JKT48 akan membuka Pre-Order untuk pembelian Digital Photobook “Season of Warmth” dengan bonus Video Call with JKT48. Season of Warmth mencerminkan moment menyambut bulan Ramadhan yang ditunggu-tunggu, salah satunya dengan cara menyambung silaturahmi dan menciptakan momen kehangatan dari kebersamaan keluarga dan teman-teman.\n" +
                    "\n" +
                    "Melalui digital photobook “Season of Warmth” ini, mari rayakan bulan Ramadhan ini dengan penuh kehangatan dan kebersamaan.\n" +
                    "\n" +
                    "Berikut adalah detailnya:\n" +
                    "\n" +
                    "Nama produk                     : “Season of Warmth”\n" +
                    "\n" +
                    "Pre-Order OFC                  : 1 Maret 2024, 21.00 WIB\n" +
                    "\n" +
                    "Pre-Order General             : 2 Maret 2024, 21.00 WIB\n" +
                    "\n" +
                    "Tanggal Rilis                      : 20 Maret 2024 (download via jkt48.com)\n" +
                    "\n" +
                    "Harga                                 : Rp120.000\n" +
                    "\n" +
                    "*Pembelian hanya bisa dilakukan melalui website jkt48.com\n" +
                    "\n" +
                    "Untuk setiap pembelian Digital Photobook “Season of Warmth” kalian akan mendapat bonus tiket Video Call with JKT48. Video Call with JKT48 adalah layanan dimana kamu dapat melakukan percakapan berdua dengan member JKT48.\n" +
                    "\n" +
                    " Berikut adalah jadwal Video Call untuk bulan Maret 2024.",
            url = "https://jkt48.com/news/detail/id/1754?lang=id",
        ),
        News(
            id = 10,
            title = "Pengumuman Mengenai Penjualan Digital Wallpaper Pack “A Sweet Surprise” dengan bonus Video Call with JKT48 Virtual",
            photo = R.drawable.a_sweet,
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Pada tanggal 15 Februari 2024, JKT48 akan membuka Pre-Order untuk pembelian Digital Wallpaper Pack “A Sweet Surprise” dengan bonus Video Call with JKT48 Virtual.\n" +
                    "\n" +
                    "Berikut adalah detailnya:\n" +
                    "\n" +
                    "Nama produk                             : “A Sweet Surprise”\n" +
                    "\n" +
                    "Penjualan umum                        : 15 Februari 2024, 21.00 WIB\n" +
                    "\n" +
                    "Tanggal Rilis                               : 15 Februari 2024 (download via jkt48.com)\n" +
                    "\n" +
                    "Tanggal Video Call                     : 18 Februari 2024\n" +
                    "\n" +
                    "Harga                                         : Rp120.000\n" +
                    "\n" +
                    "*Pembelian hanya bisa dilakukan melalui website jkt48.com\n" +
                    "\n" +
                    "Untuk setiap pembelian Digital Wallpaper Pack “A Sweet Surprise” kalian akan mendapat bonus tiket Video Call with JKT48 Virtual. Video Call with JKT48 Virtual adalah layanan dimana kamu dapat melakukan percakapan berdua dengan member JKT48 Virtual.\n" +
                    "\n" +
                    " Berikut adalah jadwal Video Call untuk bulan Februari 2024.",
            url = "https://jkt48.com/news/detail/id/1791?lang=id",
        ),
    )

    val jkt48product = listOf(
        Product(
            id = 1,
            nama = "JKT48 Shani Last Voyage Sticker Pack",
            photo = R.drawable.dfcf0723_cdd8_4130_bbdc_ad357f8ed1f4,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-shani-last-voyage-sticker-pack?extParam=src%3Dshop%26whid%3D4003898",
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Demi merayakan dan menambah keseruan Shani Graduation Concert “LAST VOYAGE”, JKT48 sudah merilis beberapa merchandise untuk melengkapi koleksi kamu.\n" +
                    "\n" +
                    "Dapatkan sekarang juga karena stocknya terbatas!!\n" +
                    "\n" +
                    "*1 Set berisi 3 lembar sticker dengan 11 pose berbeda"
        ),
        Product(
            id = 2,
            nama = "(Pre Order) JKT48 Photobook \"C'est Moi SHANI\"",
            photo = R.drawable.photobook_shani,
            url = "https://www.tokopedia.com/officialjkt48/pre-order-jkt48-photobook-c-est-moi-shani?extParam=src%3Dshop%26whid%3D4003898",
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Perjalanan Shani di penghujung waktu sebagai member JKT48 sudah semakin dekat. Maka dari itu, kami akan merilis sebuah memorabilia sebelum Shani lulus dari JKT48 berupa photobook yang berjudul “C’est Moi SHANI”. Periode pemesanan telah berlangsung. Kamu bisa order produk ini di official Tokopedia JKT48.\n" +
                    "\n" +
                    "Akan ada 400 pembeli beruntung yang dapat menghadiri Shani Photobook “C’est Moi SHANI” Signing Event sebagai bonus pembelian. Pemenang akan ditentukan melalui pengundian nomor invoice transaksi pada periode 1 Maret 2024 - 31 Maret 2024.\n" +
                    "\n" +
                    "Untuk 1 invoice pembelian berlaku 1 kesempatan undian. Kelipatan pembelian dalam 1 invoice akan terhitung sebagai 1 kesempatan undian dan hanya 1 buku yang ditandatangani."
        ),
        Product(
            id = 3,
            nama = "JKT48 11th Anniversary T-Shirt - Eleven B, M",
            photo = R.drawable._1anniv_shirt,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-11th-anniversary-t-shirt-eleven-b-m?extParam=src%3Dshop%26whid%3D4003898",
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Demi merayakan JKT48 11th Anniversary Concert: Flying High! JKT48 telah merilis beberapa merchandise eksklusif.\n" +
                    "\n" +
                    "T-Shirt Special Concert\n" +
                    "\n" +
                    "Tersedia 2 tipe T-Shirt dengan desain yang berbeda. Berikut adalah detail harganya:\n" +
                    "\n" +
                    "T-Shirt JKT48 11th Anniversary Type A: Rp.165.000,00\n" +
                    "T-Shirt JKT48 11th Anniversary Type B: Rp.165.000,00"
        ),
        Product(
            id = 4,
            nama = "Enamel Pin JKT48th Anniversary Concert - Artemis",
            photo = R.drawable.artemis,
            url = "https://www.tokopedia.com/officialjkt48/enamel-pin-jkt48th-anniversary-concert-artemis?extParam=src%3Dshop%26whid%3D4003898",
            desc = "Enamel Pin JKT48th Anniversary Concert\n" +
                    "\n" +
                    "Merchandise spesial JKT48 10th Anniversary Concert “Heaven”\n" +
                    "Tersedia dalam tiga tipe design:\n" +
                    "- Artemis (Gambar Bulan)\n" +
                    "- Poseidon (Gambar Laut)\n" +
                    "- Apollo (Gambar Matahari)"
        ),
        Product(
            id = 5,
            nama = "JKT48 High Tension (CD+DVD)",
            photo = R.drawable.high_tension,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-high-tension-cd-dvd?extParam=src%3Dshop%26whid%3D4003898",
            desc = "REGULAR/CD-DVD VERSION\n" +
                    "\n" +
                    "High Tension\n" +
                    "01. High Tension\n" +
                    "02. Musim yang Selanjutnya - Tsugi no Season (次のSeason)\n" +
                    "03. After Rain\n" +
                    "04. Kesucian Hati Hingga Umur 19 Tahun - Junjou U-19 (純情U-19)\n" +
                    "05. Kenyataan yang Ternoda - Kagereteiru Shinjitsu (汚れてる真実)\n" +
                    "\n" +
                    "DVD\n" +
                    "01. High Tension Music Video\n" +
                    "02. Musim yang Selanjutnya Music Video\n" +
                    "03. High Tension Behind the Scenes\n" +
                    "\n" +
                    "Bonus :\n" +
                    "- 1 Lembar Photopack Senbatsu High Tension (Random)\n" +
                    "- 6 Hak Vooting Request Hour 2019 s.d tgl 13 April 2019"
        ),
        Product(
            id = 6,
            nama = "JKT48 Kachuusa Uza (CD+DVD)",
            photo = R.drawable.everyday,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-kachuusa-uza-cd-dvd?extParam=src%3Dshop%26whid%3D4003898",
            desc = "Everyday, Kachuusha/UZA\n" +
                    "\n" +
                    "01. Everyday, Kachuusha (Everyday, \"\"\"\"\"\"\"\"\"\"\"\"\")\n" +
                    "02. UZA\n" +
                    "03. Sekarang Para-Para - Imapara (\"\"\"\"'\"\"'\"\")\n" +
                    "04. Wahai Kesatria - Tsuyokimono yo (\"\"'\"\"')\n" +
                    "05. Seesaw Game Penuh Air Mata - Namida no Seesaw Game (\"'\"\"\"\"\"\"\"\"\"'\"\"\"\"\"'\"\"\"\"\")\n" +
                    "\n" +
                    "DVD\n" +
                    "01. Everyday, Kachuusha (Music Video)\n" +
                    "02. UZA (Music Video)\n" +
                    "03. MV Behind the Scene\n" +
                    "\n" +
                    "BONUS\n" +
                    "- Photopack member (1 lembar random)\n" +
                    "- Nomor serial untuk Pemilihan Member Single ke-20 JKT48 (berbentuk fisik) 6 suara\n" +
                    "\n" +
                    "SPESIFIKASI PRODUK\n" +
                    "Berat : 150gr\n" +
                    "\n" +
                    "* 1 cd dvd sudah mendapatkan 2 cover, Kachuusa dan Uza ya\n" +
                    "*Untuk pembelian di tokopedia JKT48 tidak mendapat bonus poster\n" +
                    "*pengiriman hari kerja (Senin-Jumat)\n" +
                    "\n" +
                    "FAST MOVING GOODS!\n" +
                    "Produk siap dikirimkan segera setelah Anda melakukan pembayaran dan konfirmasi.\n" +
                    "Dengan membeli official merchandise JKT48 kamu sudah satu langkah lebih maju untuk mendukung JKT48!\n" +
                    "Tetap dukung JKT48 ya! :D"
        ),
        Product(
            id = 7,
            nama = "JKT48 Re:boost Totebag",
            photo = R.drawable.totebag,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-re-boost-totebag?extParam=src%3Dshop%26whid%3D4003898",
            desc = "JKT48 Circus sedang berlangsung nih!\n" +
                    "\n" +
                    "Udah punya produk baru dari Re:boost belum?\n" +
                    "Ayo dapatkan segera, Produk bisa didapat di Official Booth Merchandise Circus JKT48 yang akan datang ke kotamu.\n" +
                    "\n" +
                    "Untuk di Jakarta produk sudah tersedia di Official Booth Merchandise Theater dan Tokopedia Official JKT48 lohhh!!!\n" +
                    "\n" +
                    "Product on Photo :\n" +
                    "Re:boost Totebag :Rp150.000, -\n" +
                    "Tinggi 42cm, Lebar 33cm\n" +
                    "#JKT48 #OfficialMerchandise #Idolgroup #Indonesia #Re:boost #jkt48mrch #jkt48reboost\n" +
                    "\n" +
                    "*pengiriman Senin-Jumat"
        ),
        Product(
            id = 8,
            nama = "JKT48 Clear Folder Love Trip",
            photo = R.drawable.love_trip,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-clear-folder-love-trip?extParam=src%3Dshop%26whid%3D4003898",
            desc = "JKT48 Clear Folder Love Trip\n" +
                    "\n" +
                    "ukuran A4"
        ),
        Product(
            id = 9,
            nama = "JKT48 Shani Last Voyage T-Shirt (Blue)",
            photo = R.drawable.last_voyage_blue,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-shani-last-voyage-t-shirt-blue?extParam=src%3Dshop",
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Demi merayakan dan menambah keseruan Shani Graduation Concert “LAST VOYAGE”, JKT48 telah merilis beberapa merchandise untuk melengkapi koleksi kamu.\n" +
                    "\n" +
                    "Dapatkan sekarang juga karena stocknya terbatas!!\n"
        ),
        Product(
            id = 10,
            nama = "JKT48 Shani Last Voyage T-Shirt (White)",
            photo = R.drawable.last_voyage_white,
            url = "https://www.tokopedia.com/officialjkt48/jkt48-shani-last-voyage-t-shirt-white?extParam=src%3Dshop",
            desc = "Terima kasih atas dukungannya untuk JKT48.\n" +
                    "\n" +
                    "Demi merayakan dan menambah keseruan Shani Graduation Concert “LAST VOYAGE”, JKT48 telah merilis beberapa merchandise untuk melengkapi koleksi kamu.\n" +
                    "\n" +
                    "Dapatkan sekarang juga karena stocknya terbatas!!"
        )
    )
}