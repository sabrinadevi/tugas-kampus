public class PerkalianMatriks {
// Mendeklarasikan kelas bernama Perkalian_Matriks

    public static void main(String[] args) { 
    // Metode utama yang akan dieksekusi pertama kali saat program dijalankan.

        int[][] matrixA = { 
        // Mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksA.

            {2, 4}, 
            // mendefinisikan baris pertama dari matriksA dengan elemen 2,4.
            {8, 10} 
            //mendefinisikan baris kedua dari matriksA dengan elemen 8,10.
        };

        int[][] matrixB = {
        // Mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama matriksB.

            {1, 3}, //mendefinisikan baris pertama dari matriksB dengan elemen 1,3.
            {9, 7}  //mendefinisikan baris kedua dari matriksB dengan elemen 9,7.

        };

        int[][] hasilKali = perkalianMatriks(matrixA, matrixB);
        // Memanggil metode perkalianMatriks dan menyimpan hasilnya kedalam variabel hasilKali
        System.out.println("Hasil perkalian matriks: ");
        // Menampilkan teks "Hasil perkalian matriks" 
        for (int i = 0; i < hasilKali.length; i++) { 
            // Loop melalui setiap baris matriks hasil
            for (int j = 0; j < hasilKali[i].length; j++) {
                // Loop melalui setiap kolom matriks hasil
                System.out.print(hasilKali[i][j] + " ");
                // Mencetak elemen hasil perkalian diikuti oleh spasi
            }
            System.out.println(); 
            // Mencetak baris baru setelah setiap baris matriks hasil
        }
    }

    public static int[][] perkalianMatriks(int[][] firstMatrix, int[][] secondMatrix) {
        // Metode untuk menghitung perkalian dua matriks
        int baris1 = firstMatrix.length; 
        // Mengambil jumlah baris dari matriks pertama
        int kolom1 = firstMatrix[0].length; 
        // Mengambil jumlah kolom dari matriks pertama
        int kolom2 = secondMatrix[0].length; 
        // Mengambil jumlah kolom dari matriks kedua
        int[][] hasilKali= new int[baris1][kolom2]; 
        // Mendeklarasikan matriks baru untuk menyimpan hasil perkalian

        for (int i = 0; i < baris1; i++) { 
            // Loop melalui setiap baris matriks pertama
            for (int j = 0; j < kolom2; j++) { 
                // Loop melalui setiap kolom matriks kedua
                hasilKali[i][j] = 0; 
                // Menginisialisasi elemen hasil dengan nol
                for (int k = 0; k < kolom1; k++) { 
                    // Loop untuk melakukan perkalian dan penjumlahan elemen
                    hasilKali[i][j] += firstMatrix[i][k] * secondMatrix[k][j]; 
                    // Menghitung elemen hasil perkalian
                }
            }
        }
        return hasilKali;
        // Mengembalikan hasil perkalian matriks
    }
}