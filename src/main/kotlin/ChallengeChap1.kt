interface CC1{
    fun polaBintang()
}

class PiramidaBintang():CC1{
    override fun polaBintang() {
        val bintang1 = 5
        var k = 0

        for (i in 1..bintang1) {
            for (space in 1..bintang1 - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
            k = 0
        }
    }
}

class BintangPiramidaTerbalik():CC1{
    override fun polaBintang() {
        val bintang1 = 5
        for (i in bintang1 downTo 1) {
            for (bintang1 in 1..bintang1 - i) {
                print("  ")
            }
            for (j in i..2 * i - 1) {
                print("* ")
            }
            for (j in 0..i - 1 - 1) {
                print("* ")
            }
            println()
        }
    }
}

abstract class Segitiga(){
    abstract fun segitiga()
    fun tampilSegitiga(){
        val bintang = 5
        var bintang1 = 0

        for (i in 1..bintang) {
            for (bitang2 in 1..bintang - i) {
                print("  ")
            }
            while (bintang1 != 2 * i - 1) {
                print("* ")
                ++bintang1
            }
            println()
            bintang1 = 0
        }
    }
}

class AnakSegitiga():Segitiga(){
    override fun segitiga() {
        val bintang3 = 5

        for (i in bintang3 downTo 1) {

            for (bintang4 in 1..bintang3 - i) {
                print("  ")
            }

            for (j in i..2 * i - 1) {
                print("* ")
            }

            for (j in 0..i - 1 - 1) {
                print("* ")
            }

            println()
        }
    }
}

class BintangX : CC1{
    override fun polaBintang() {

        val star : Int = 8
        val bintang = star * 2 - 1;

        for(i in 1..bintang){
            for(j in 1..bintang){
                if(j==i || (j==bintang - i + 1)){
                    print("*");
                }
                else
                {
                    print(" ");
                }
            }

            println("")
        }
    }
}

class SegitigaSikuSiku(){
    fun segitigaSiku(){
        val bintang = 5

        for (i in 1..bintang) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }
}

class PolaPlus():CC1{
    override fun polaBintang() {
        val size = 5
        val middle = size / 2

        for (i in 0 until size) {
            for (j in 0 until size) {
                if (i == middle || j == middle) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}

fun main(){
    println("Pola Piramida Bintang")
    println()
    println()
    val tampilan = PiramidaBintang()
    tampilan.polaBintang()
    println()
    println()
    println("Pola Piramida Bintang Terbalik")
    println()
    println()
    val  tampilan1 = BintangPiramidaTerbalik()
    tampilan1.polaBintang()
    println()
    println()
    println("Pola Peramida Bintang Digabung Dengan Piramida Bintang Terbalik")
    println()
    println()
    val tampilkan2 = AnakSegitiga()
    tampilkan2.tampilSegitiga()
    tampilkan2.segitiga()
    println()
    println()
    println("Pola Bintang X")
    println()
    println()
    val tampilkan3 = BintangX()
    tampilkan3.polaBintang()
    println()
    println()
    println("Pola Bintang Segita Siku-Siku")
    println()
    println()
    val tampilkan4 = SegitigaSikuSiku()
    tampilkan4.segitigaSiku()
    println()
    println()
    println("Pola Bintang Plus")
    println()
    println()
    val tampilkan5 = PolaPlus()
    tampilkan5.polaBintang()
}