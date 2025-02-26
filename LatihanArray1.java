public class LatihanArray1 { 
//Mendeklarasikan kelas publik bernama LatihanArray1.
    public static void main(String[] args) { 
        //Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
        // 1. Membuat array dengan 10 bilangan bulat
        // 2. Mengisi array dengan bilangan genap mulai dari 2
        // 3. Menampilkan isi array
        // 4. Menghitung jumlah semua elemen array

        int[] bilanganGenap = new int[10]; 
        //Mendeklarasikan array bilanganGenap dengan tipe data int yang berisikan 10 elemen.
        int jumlah = 0; 
        //Mendeklarasikan variabel jumlah dengan tipe data int dan menginisialisasinya dengan nilai 0.

        // Mengisi array
        for (int i = 0; i < bilanganGenap.length; i++) { 
          //loop for mengisi array dengan bilangan genap mulai dari 2. 
        
        
            bilanganGenap[i] = (i + 1) * 2; 
             //baris ini mengisi setiap elemen array bilanganGenap dengan bilangan genap.   
             
        }

        // Menampilkan array
        System.out.println("Isi array:"); 
        //Menampilkan teks "Isi array:"
        for (int bilangan : bilanganGenap) { 
         //loop foreach yang mengiterasi setiap elemen dari array. 
            System.out.print(bilangan + " ");
            //mencetak setiap elemen array diikuti dengan spasi.  
            jumlah += bilangan; 
            //Menambahkan nilai bilangan saat ini ke variabel jumlah.
        }

        System.out.println("Jumlah semua elemen: " + jumlah); 
                //Baris ini mencetak baris baru (\n) dan teks "Jumlah semua elemen: " diikuti dengan nilai variabel jumlah
    }
}
