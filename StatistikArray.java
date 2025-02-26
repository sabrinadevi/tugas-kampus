public class StatistikArray {
    //Mendeklarasikan kelas publik bernama StatistikArray
    public static void main(String[] args) {
        //Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
       
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        //Mendeklarasikan array bertipe integer dengan nama nilai, dan mengisi Array dengan 8 elemen
        int tertinggi = nilai[0]; 
        //Mendeklarasikan variabel tertinggi dengan tipe data intdan menginisialisasinya dengan elemen pertama dari array nilai.
        int terendah = nilai[0];
         //Mendeklarasikan variabel tereendah dengan tipe data intdan menginisialisasinya dengan elemen pertama dari array nilai.
        int total = nilai[0];
         //Mendeklarasikan variabel total dengan tipe data intdan menginisialisasinya dengan elemen pertama dari array nilai.

        for (int i = 1; i < nilai.length; i++) {
            //Melooping dari indeks 1 hingga akhir array untuk menghitung statistik.
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            // Jika nilai i lebih besar dari tertinggi, maka tertinggi diperbarui.
            if (nilai[i] < terendah) terendah = nilai[i];
            //Jika nilai i lebih kecil dari terendah,  maka terendah diperbaru
            total += nilai[i];
            //Menambahkan nilai i ke dalam total
        }

        double rataRata = (double) total / nilai.length;
        // Menghitung rata-rata nilai dengan membagi total dengan jumlah elemen.

        System.out.println("Nilai tertinggi: " + tertinggi);
        // Mencetak nilai tertinggi pada  layar.
        System.out.println("Nilai terendah: " + terendah);
        // Mencetak nilai terendah pada  layar
        System.out.println("Rata-rata: " + rataRata);
        // Mencetak nilai rata-rata pada  layar
    }
}