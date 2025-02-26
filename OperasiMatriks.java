 public class OperasiMatriks {
   //Mendeklarasikan kelas publik bernama operasiMatriks
    public static void main(String[] args) {
    //Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
        
        // Program operasi matriks
        int[][] matriksA= {
            //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksA.
            {1, 2, 3},
            //mendefinisikan baris pertama dari matriks_A dengan elemen 1, 2, dan 3.
            {4, 5, 6}
            //Baris ini mendefinisikan baris kedua dari matriks_A dengan elemen 4, 5, dan 6.
        };

        int[][] matriksB = {
            //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksB.
            {7, 8, 9},
            //mendefinisikan baris pertama dari matrikB dengan elemen 7, 8, dan 9.
            {10, 11, 12}
            //mendefinisikan baris kedua dari matriksB dengan elemen 10, 11, dan 12.
        };

        // Penjumlahan matriks
        int[][] hasil = new int[2][3];
        //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama hasil dengan 2 baris dan 3 kolom. Matriks ini akan digunakan untuk menyimpan hasil penjumlahan.

        for (int i = 0; i < matriksA.length; i++) {
            // loop for luar yang akan beriterasi melalui setiap baris dari matriksA. matriksA.length memberikan jumlah baris.
            for (int j = 0; j < matriksA[0].length; j++) {
                // loop for dalam yang akan beriterasi melalui setiap kolom dari matriksA. matriksA[0].length memberikan jumlah kolom.
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                // baris ini menambahkan elemen matriksA[i][j] dengan matriksB[i][j] dan menyimpan hasilnya ke hasil[i][j].
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:");
        //mencetak teks "Hasil penjumlahan matriks"
        for (int[] baris : hasil) {
            //loop for-each luar yang akan beriterasi melalui setiap baris dari matriks hasil.
            for (int nilai : baris) {
                //loop for-each dalam yang akan beriterasi melalui setiap elemen dalam baris saat ini.
                System.out.print(nilai + " ");
                //baris ini mencetak nilai elemen saat ini diikuti dengan spasi.
            }
            System.out.println();
            // mencetak baris baru setelah setiap baris matriks dicetak.
        }
    }
}
