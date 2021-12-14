package com.example.newsapp.data

import com.example.newsapp.R

object DataBook {
    private val titleAll = arrayOf(
        "Pergi",
        "he house of the light",
        "Di balik senja",
        "Hujan",
        "25 nabi dan rasul",
        "30 kisah pengantar tidur",
        "Peta bintang",
        "Rentang waktu",
        "Anak rantau",
        "Ayah"
    )

    private val contentAll = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec."
    )


    private val authorAll = arrayOf(
        "Galih Pangestu Jati",
        "Ariska Puspita Anggraini",
        "Gloria Setyvani Putri",
        "Yosepha Pusparisa",
        "Wahyunanda Kusuma Pertiwi",
        "CNN Indonesia",
        "Dwi Widijatmiko",
        "CNN Indonesia",
        "Rachmat Fahzry",
        "jpnn.com"
    )


    private val photoAll = intArrayOf(
        R.drawable.book_1,
        R.drawable.book_2,
        R.drawable.book_3,
        R.drawable.book_4,
        R.drawable.book_5,
        R.drawable.book_6,
        R.drawable.book_7,
        R.drawable.book_8,
        R.drawable.book_9,
        R.drawable.book_10
    )

    private val categoryAll = arrayOf(
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home"
    )

    val dataHome: ArrayList<Book>
    get() {
        val listBook = arrayListOf<Book>()
        for (position in titleAll.indices) {
            val book = Book(
                content = contentAll[position],
                title = titleAll[position],
                author = authorAll[position],
                photo = photoAll[position],
                category = categoryAll[position]
            )
            listBook.add(book)
        }
        return listBook
    }

    private val titlePopular = arrayOf(
        "Pergi",
        "he house of the light",
        "Di balik senja",
        "Hujan",
        "25 nabi dan rasul",
        "30 kisah pengantar tidur",
        "Peta bintang",
        "Rentang waktu",
        "Anak rantau",
        "Ayah"
    )

    private val contentPopular = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec."
    )


    private val authorPopular = arrayOf(
        "Galih Pangestu Jati",
        "Ariska Puspita Anggraini",
        "Gloria Setyvani Putri",
        "Yosepha Pusparisa",
        "Wahyunanda Kusuma Pertiwi",
        "CNN Indonesia",
        "Dwi Widijatmiko",
        "CNN Indonesia",
        "Rachmat Fahzry",
        "jpnn.com"
    )


    private val photoPopular = intArrayOf(
        R.drawable.book_1,
        R.drawable.book_2,
        R.drawable.book_3,
        R.drawable.book_4,
        R.drawable.book_5,
        R.drawable.book_6,
        R.drawable.book_7,
        R.drawable.book_8,
        R.drawable.book_9,
        R.drawable.book_10
    )

    private val categoryPopular = arrayOf(
        "POPULAR",
        "POPULAR",
        "POPULAR",
        "POPULAR",
        "POPULAR",
        "POPULAR",
        "POPULAR",
        "POPULAR",
        "POPULAR",
        "POPULAR"
    )

    val dataRecent: ArrayList<Book>
        get() {
            val listBook = arrayListOf<Book>()
            for (position in titlePopular.indices) {
                val book = Book(
                    content = contentPopular[position],
                    title = titlePopular[position],
                    author = authorPopular[position],
                    photo = photoPopular[position],
                    category = categoryPopular[position]
                )
                listBook.add(book)
            }
            return listBook
        }

    private val titleTop = arrayOf(
        "Pergi",
        "he house of the light",
        "Di balik senja",
        "Hujan",
        "25 nabi dan rasul",
        "30 kisah pengantar tidur",
        "Peta bintang",
        "Rentang waktu",
        "Anak rantau",
        "Ayah"
    )

    private val contentTop = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec."
    )


    private val authorTop = arrayOf(
        "Galih Pangestu Jati",
        "Ariska Puspita Anggraini",
        "Gloria Setyvani Putri",
        "Yosepha Pusparisa",
        "Wahyunanda Kusuma Pertiwi",
        "CNN Indonesia",
        "Dwi Widijatmiko",
        "CNN Indonesia",
        "Rachmat Fahzry",
        "jpnn.com"
    )


    private val photoTop = intArrayOf(
        R.drawable.book_1,
        R.drawable.book_2,
        R.drawable.book_3,
        R.drawable.book_4,
        R.drawable.book_5,
        R.drawable.book_6,
        R.drawable.book_7,
        R.drawable.book_8,
        R.drawable.book_9,
        R.drawable.book_10
    )

    private val categoryTop = arrayOf(
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home",
        "Home"
    )

    val dataPopular: ArrayList<Book>
        get() {
            val listBook = arrayListOf<Book>()
            for (position in titleTop.indices) {
                val book = Book(
                    content = contentTop[position],
                    title = titleTop[position],
                    author = authorTop[position],
                    photo = photoTop[position],
                    category = categoryTop[position]
                )
                listBook.add(book)
            }
            return listBook
        }

    val titleHeadline = arrayOf(
        "Daun yang jatuh tak pernah membenci angin",
        "Kisah Tanah Jawa",
        "Kata-Tentang senja yang kehilangan langitnya"
    )

    val contentHeadline = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit nec ligula eu ultrices. Curabitur dictum quam pharetra, euismod.\n" +
                "\n" +
                "sapien et, tempus ex. Donec volutpat porta eros, vel ultrices sem. \"Donec volutpat porta eros,\" Donec volutpat porta eros \"Nullam id leo hendrerit, faucibus nisi a, laoreet augue. Nunc non nulla sed leo tristique lobortis in non elit.\" sed leo tristique lobortis in non elit\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Maecenas pharetra\" Maecenas pharetra\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna. Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. Maecenas pharetra ac purus id pharetra.\n" +
                "\n" +
                "\"Ut lacus lectus, efficitur ac tincidunt in, ultricies id magna,\" Vestibulum placerat elementum elit, ut aliquam risus pharetra nec. \"Vestibulum placerat elementum elit, ut aliquam risus pharetra nec,\" pharetra nec."
    )

    val dateHeadline = arrayOf(
        "Selasa, 22 Juni 2021",
        "Selasa, 22 Juni 2021",
        "Selasa, 22 Juni 2021"
    )

    val authorHeadline = arrayOf(
        "Tere Liye",
        "Tere Liye",
        "Tere Liye"
    )

    val photoHeadline = arrayOf(
        R.drawable.book_headline_1,
        R.drawable.book_headline_2,
        R.drawable.book_headline_3,
    )
}