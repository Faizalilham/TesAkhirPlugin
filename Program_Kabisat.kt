import java.util.*

object TahunKabisat {
    @JvmStatic
    fun main(args: Array<String>) {
        val tahun: Int
        val scan = Scanner(System.`in`)
        print("Masukkan tahun : ")
        tahun = scan.nextInt()
        if (tahun % 400 == 0) {
            print("$tahun Merupakan Tahun Kabisat jumlah harinya 366 hari\n")
        } else if (tahun % 100 == 0) {
            print("$tahun Bukan Tahun Kabisat jumlah harinya 365 hari\n")
        } else if (tahun % 4 == 0) {
            print("$tahun Merupakan Tahun Kabisat jumlah harinya 366 hari\n ")
        } else {
            print("$tahun Bukan Tahun Kabisat jumlah harinya 365 hari\n")
        }
    }
}