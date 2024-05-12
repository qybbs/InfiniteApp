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
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 /“Spring Has Come/”",
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
            id = 5,
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 /“Spring Has Come/”",
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
            id = 6,
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 /“Spring Has Come/”",
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
            id = 7,
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 /“Spring Has Come/”",
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
            id = 8,
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 /“Spring Has Come/”",
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
            id = 9,
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 /“Spring Has Come/”",
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
            id = 10,
            title = "Pengumuman Mengenai Stage Activity dan Mini-Live Performance di Personal Meet & Greet Festival 2024 /“Spring Has Come/”",
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
            id = 5,
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
            id = 6,
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
            id = 7,
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
            id = 8,
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
            id = 9,
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
            id = 10,
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
            id = 11,
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
            id = 12,
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
        )
    )
}