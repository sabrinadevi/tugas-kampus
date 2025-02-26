public class PencarianArray {
    //Mendeklarasikan kelas dengan nama PencarianArray.

    public static void main(String[] args) {
        //Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        //Membuat array nilai yang memiliki 8 elemen dengan indeks dari 0 hingga 7:

        int cari = 90;
        //Mendeklarasikan variabel cari menyimpan angka yang akan dicari di dalam array. Dalam program ini, mencari angka 90.
        

        boolean ketemu = false;
        //mendeklarasikan variabel ketemu bertipe boolean dan menginisialisasinya dengan false. 

        int indeks = -1;
         // mendeklarasikan variabel indeks bertipe integer dan menginisialisasinya dengan -1. Variabel ini menyimpan indeks dari nilai yang dicari jika ditemukan. Nilai -1 digunakan sebagai nilai awal untuk menunjukkan bahwa nilai belum ditemukan.

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) {
            //melooping for yang akan iterasi melalui setiap elemen dalam array nilai.
            if (nilai[i] == cari) {
                //memeriksa apakah elemen array saat ini (nilai[i]) sama dengan nilai yang dicari (cari).
                ketemu = true;
                 //Jika nilai ditemukan, baris ini mengubah nilai variabel ketemu menjadi true.
    
                indeks = i;
                 //menyimpan indeks elemen yang ditemukan ke dalam variabel indeks.
                break;
                 //Menghentikan loop for menggunakan break,Karena nilai yang dicari sudah ditemukan.yvg
            }
        }

        // Menampilkan hasil
        if (ketemu) {
                    //memeriksa apakah nilai yang dicari ditemukan (ketemu bernilai true).
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
           //Mencetak pesan yang menunjukkan nilai yang dicari dan indeksnya.
        } else {
             //Jika nilai tidak ditemukan maka  bernilai false).
            System.out.println("Nilai " + cari + " tidak ditemukan");
            //Jika nilai tidak ditemukan,maka mencetak pesan yang menunjukkan bahwa nilai tidak ditemukan.
        }
    }
}