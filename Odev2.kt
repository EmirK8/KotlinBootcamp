package com.example.kotlindersleri.Odevler


/*
 fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun main() {
    print("Kenar sayisini giriniz: ")
    val input = readLine()
    if (input != null) {
        val kenarSayisi = input.toIntOrNull()
        if (kenarSayisi != null && kenarSayisi >= 3) {
            val toplamIcAci = icAciToplami(kenarSayisi)
            println("Ic acilar toplami: $toplamIcAci derece")
        }
    }
}
----------


fun maasHesapla(gunSayisi: Int): Int {
    val saatUcreti = 10
    val mesaiUcreti = 20
    val calismaSaat = gunSayisi * 8
    return if (calismaSaat <= 160) {
        calismaSaat * saatUcreti
    } else {
        (160 * saatUcreti) + ((calismaSaat - 160) * mesaiUcreti)
    }
}

fun main() {
    print("Calisilan gun sayisini giriniz: ")
    val input = readLine()
    if (input != null) {
        val gunSayisi = input.toIntOrNull()
        if (gunSayisi != null && gunSayisi > 0) {
            val maas = maasHesapla(gunSayisi)
            println("Toplam maas: $maas")
        }
    }
}
----------


fun kotaUcretiHesapla(kota: Int): Int {
    val standartUcret = 100
    val standartKota = 50
    val fazlaKotaUcreti = 4

    return if (kota <= standartKota) {
        standartUcret
    } else {
        standartUcret + ((kota - standartKota) * fazlaKotaUcreti)
    }
}

fun main() {
    print("Kullanilan kota miktarini (GB) giriniz: ")
    val input = readLine()
    if (input != null) {
        val kotaMiktari = input.toIntOrNull()
        if (kotaMiktari != null && kotaMiktari >= 0) {
            val ucret = kotaUcretiHesapla(kotaMiktari)
            println("Odemeniz gereken ucret: $ucret")
        }
    }
}
----------


fun dereceToFahrenheit(c: Double): Double {
    return c * 1.8 + 32
}

fun main() {
    print("Santigrat dereceyi giriniz: ")
    val input = readLine()
    if (input != null) {
        val derece = input.toDoubleOrNull()
        if (derece != null) {
            val fahrenheit = dereceToFahrenheit(derece)
            println("Fahrenheit karsiligi: $fahrenheit F")
        }
    }
}
----------


fun dikdortgenCevresi(kisa: Int, uzun: Int): Int {
    return 2 * (kisa + uzun)
}

fun main() {
    print("Kisa kenari giriniz: ")
    val kisaInput = readLine()
    print("Uzun kenari giriniz: ")
    val uzunInput = readLine()

    val kisa = kisaInput?.toIntOrNull()
    val uzun = uzunInput?.toIntOrNull()

    if (kisa != null && uzun != null && kisa > 0 && uzun > 0) {
        val cevre = dikdortgenCevresi(kisa, uzun)
        println("Dikdortgenin cevresi: $cevre")
    }
}
----------


fun faktoriyel(sayi: Int): Long {
    var sonuc = 1L
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun main() {
    print("Faktoriyeli alinacak sayiyi giriniz: ")
    val input = readLine()
    val sayi = input?.toIntOrNull()

    if (sayi != null && sayi >= 0) {
        val sonuc = faktoriyel(sayi)
        println("$sayi! = $sonuc")
    }
}
----------


fun aHarfiSayisi(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}

fun main() {
    print("Bir kelime giriniz: ")
    val input = readLine()

    if (!input.isNullOrBlank()) {
        val sayi = aHarfiSayisi(input)
        println("Girilen kelimede $sayi adet 'a' harfi var.")
    }
}
*/






