public class SistemNilai {
    // //Mendeklarasikan kelas publik bernama SistemNilai
    public static void main(String[] args) {
        //Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
        //  //mendeklarasikan dan menginisialisasi sebuah array string bernama namaSiswa yang berisi nama-nama siswa.
        int[][] nilai = {
            //mendeklarasikan dan menginisialisasi sebuah array dua dimensi (matriks) bilangan bulat bernama nilai.
            {80, 85, 90}, // Mendefinnisikan baris pertama dari nilai dengan elemen didalam kurung yang merupakan nilai dari Ani
            {75, 70, 85}, // Mendefinnisikan baris kedua dari nilai dengan elemen didalam kurung yang merupakan nilai dari Budi
            {85, 80, 88}, // Mendefinnisikan baris ketiga dari nilai dengan elemen didalam kurung yang merupakan nilai dari Cici
            {90, 85, 95}, // Mendefinnisikan baris keempat dari nilai dengan elemen didalam kurung yang merupakan nilai dari Dodi
            {70, 75, 80}  // Mendefinnisikan baris kelima dari nilai dengan elemen didalam kurung yang merupakan nilai dari Edi
        };
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};
        // lisasi sebuah array String bernama mapel yang berisikan mata pelajaran.\

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:");
         //mencetak teks "Rata-rata nilai per siswa:"
        for (int i = 0; i < nilai.length; i++) {
        // loop for luar yang akan beriterasi melalui setiap baris dari nilai (setiap siswa).
            double total = 0;
            //Mendeklarasikan variabel total bertipe double dan menginisialisasinya dengan 0. Variabel ini akan digunakan untuk menghitung total nilai setiap siswa.

            for (int n : nilai[i]) {
                //memulai loop for-each yang akan iterasi melalui setiap nilai dalam baris nilai[i]
                total += n;
                // menambahkan nilai elemen saat ini ke variabel total.
            
            }
            double rataSiswa = total / nilai[i].length;
            //Menghitung rata-rata nilai siswa dengan membagi total dengan jumlah elemen dalam baris nilai[i].            
            System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa);
            //Menampilkan hasil rata-rata siswa dengan format dua angka desimal.
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\\nRata-rata nilai per mata pelajaran:");
        //Mencetak baris baru dan teks "Rata-rata nilai per mata pelajaran:"
        for (int j = 0; j < nilai[0].length; j++) {
        //  Menambahkan elemen nilai[i][j] ke variabel total.
            double total = 0;
            // Baris ini mendeklarasikan variabel total bertipe double dan menginisialisasinya dengan 0
            for (int i = 0; i < nilai.length; i++) {
                //  loop for yang akan iterasi melalui setiap siswa dalam matriks nilai.
                total += nilai[i][j];
                //  menambahkan nilai elemen nilai[i][j] ke variabel total.

            }
            double rataMapel = total / nilai.length;
            //Menghitung rata-rata nilai mata pelajaran dengan membagi total dengan jumlah siswa.
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel);
            // Mencetak nama mata pelajaran dan rata-rata nilainya deengan output 2 desimal.
        }
    }
}
