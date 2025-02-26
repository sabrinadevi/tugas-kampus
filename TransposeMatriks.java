public class TransposeMatriks { 
    //Mendeklarasikan kelas publik bernama TransposeMatriks.
    public static int[][] transposeMatrix(int[][] matrix) {
    // Mendeklarasikan metode transposeMatrix yang menerima array 2D (matrix) dan mengembalikan array 2D hasil transposisi.
        int rows = matrix.length;
        //Menyimpan jumlah baris dari matriks input ke variabel rows
        int cols = matrix[0].length;
        // Menyimpan jumlah kolom dari matriks input ke variabel cols
        int[][] transposed = new int[cols][rows];
        // Membuat array transposed dengan ukuran dibalik dari matriks awal (cols x rows).
        for (int i = 0; i < rows; i++) { 
            // Perulangan pertama untuk setiap baris pada matriks input.

            for (int j = 0; j < cols; j++) { 
                //Perulangan kedua untuk setiap kolom dalam baris tersebut.
                transposed[j][i] = matrix[i][j];
                //memindahkan elemen dari (i,j) matriks asli ke posisi (j,i)di matriks hasil
            }
        }
        return transposed;
        // mengembalikan matriks yang sudah di transposisi ke fungsi yang memanggil
    }

    public static void main(String[] args) {
        //Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
        int[][] matrix = { 
            //Mendeklarasikan dan menginisialisasi matriks 3×3.
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] result = transposeMatrix(matrix); 
        //Memanggil metode transposeMatrix untuk mendapatkan matriks transposisi.

        for (int[] row : result) {
            //Loop for-each untuk menelusuri setiap baris dalam result.

            for (int num : row) { 
                //Loop for-each kedua untuk menelusuri setiap elemen dalam baris tersebut.

                System.out.print(num + " ");
                // menampilkan angka di layar
            }
            System.out.println();
            //pindah ke baris baru setelah mencetak satu baris matriks
        }
    }
}