import java.util.Scanner;
    = Mengimpor kelas Scanner  untuk membaca input dari pengguna

public class Uas_Daspro 
    = Mendeklarasikan kelas utama

public static void main(String[] args) 
    =metode utama yang akan dieksekusi pertama kali saat program dijalankan.

Scanner sc = new Scanner(System.in);
    = Membuat objek Scanner untuk membaca input dari pengguna.

String[] namaMahasiswa = new String[100];
String[] nimMahasiswa = new String[100];
String[] jenisPrestasi = new String[100];
String[] tingkatPrestasi = new String[100];
int[] tahunPrestasi = new int[100];
    = Membuat Array untuk menyimpan data mahasiswa diatas dengan kapasitas Array 100 elemen

int count = 0;
    = Digunakan untuk menghitung jumlah prestasi yang telah dimasukkan.

int choice;
    = Digunakan untuk menyimpan pilihan menu dari pengguna.

do 
    System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
    System.out.println("1. Tambah Prestasi Mahasiswa");
    System.out.println("2. Tampilkan Daftar Prestasi");
    System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
    System.out.println("4. Keluar");
    System.out.print("Pilih menu: ");
    choice = input.nextInt();
    sc.nextLine();
        = Menggunakan do-while karena agar menu utama terus berjalan hingga pengguna memilih keluar.

        = System.out.print("Pilih menu: ");  Digunakaan  untuk menampilkan teks di layar untuk meminta pengguna memilih menu.

        = choice = input.nextInt(); Digunakan untuk membaca input angka dari pengguna dan menyimpannya dalam variabel choice.

        = sc.nextLine(); Digunakan untuk membersihkan buffer input, agar nextInt() tidak menyebabkan error saat membaca input string berikutnya.
        =




switch (choice) {
    = Menggunakan switch-case untuk menangani berbagai pilihan menu yang diberikan pengguna.


case 1:
    if (count >= 100) { 
        System.out.println("Jumlah prestasi telah mencapai batas maksimal."); 
        break; 
    }
    = Memeriksa apakah jumlah prestasi telah mencapai batas maksimal (100).


System.out.print("Nama Mahasiswa: "); 
namaMahasiswa[count] = sc.nextLine();
System.out.print("NIM: "); 
nimMahasiswa[count] = sc.nextLine();
System.out.print("Jenis Prestasi: "); 
jenisPrestasi[count] = sc.nextLine();
    = Meminta input dari pengguna untuk Nama,Nim,dan Jenis prestasi


while (true) { 
    System.out.print("Tingkat Prestasi (Lokal, Nasional, Internasional): "); 
    tingkatPrestasi[count] = sc.nextLine();
    if (tingkatPrestasi[count].equalsIgnoreCase("Lokal") || 
        tingkatPrestasi[count].equalsIgnoreCase("Nasional") || 
        tingkatPrestasi[count].equalsIgnoreCase("Internasional")) {
        break; 
    } else { 
        System.out.println("Input tidak valid. Harap masukkan salah satu dari: Lokal, Nasional, Internasional."); 
    } 
}
    = While (true) digunakan untuk melooping secara terus menerus sampai perintah break dijalankan jadi  pengguna harus memasukan input yang valid

    = System.out.print ("Tingkat Prestasi (Lokal, Nasional, Internasional): ");  Digunakan menampilkan pesan agar pengguna memasukkan tingkat prestasi.

    = tingkatPrestasi[count] = input.nextLine(); Digunakan untuk membaca input dari pengguna dan menyimpannya dalam array tingkatPrestasi pada indeks count (data keberapa yang sedang dimasukkan).

    = equalsIgnoreCase digunakan untuk  Membandingkann input tanpa memperhatikan huruf besar/ kecil

    = Break  digunakan untuk menghentikan perulangan 

    = else jika pengguna memasukkann sesuatu yang tidak sesuai, maka program akan masuk ke blok else 




while (true) { 
    System.out.print("Tahun Prestasi (2010 hingga tahun saat ini): "); 
    int tahun = sc.nextInt(); 
    sc.nextLine(); 
    

        = while (true) digunakan untuk melooping tak terbatas yang akan terus berjalan sampai pengguna memasukkan tahun yang valid.

        = System.out.print("Tahun Prestasi (2010 hingga tahun saat ini):")  untuk Menampilkan teks untuk meminta pengguna memasukkan tahun prestasi.

        = int tahun = sc.nextInt();  Digunakan  untuk membaca input angka dari pengguna dan menyimpannya dalam variabel tahun

        = sc.nextLine(); Digunakan untuk membersihkan buffer input, sehingga tidak terjadi error saat membaca input berikutnya.
        

if (tahun >= 2010 && tahun <= 2024) { 
        tahunPrestasi[count] = tahun; 
        break; 

        = Mengecek apakah input tahun berada dalam rentang 2010 hingga 2024.
        Jika tahun valid, maka tahun akan  disimpan ke dalam array tahunPrestasi[count].

        =break; menghentikan perulangan dan program lanjut ke bagian berikutnya.

} else { 
        System.out.println("Input tidak valid. Harap masukkan tahun antara 2010 hingga tahun saat ini."); 
    } 
}
        = Jika pengguna memasukkan angka di luar rentang maka program menampilkan pesan error  dan meminta input ulang, karena perulangan masih berjalan.



count++; 
System.out.println("Prestasi berhasil ditambahkan!");
break;
    = Menambah jumlah count setelah data prestasi berhasil ditambahkan.

case 2:
if (count > 0) {
    System.out.println("=== DAFTAR SEMUA PRESTASI ==="); 
    for (int i = 0; i < count; i++) { 
         System.out.println("Nama: " + namaMahasiswa[i] + "| NIM: " + nimMahasiswa[i] + "| Jenis: " + jenisPrestasi[i] + "| Tingkat: " + tingkatPrestasi[i] + "| Tahun: " + tahunPrestasi[i]); 
        }
} else {
        System.out.println("Belum ada data prestasi");
}
break;

    
    = Jika count > 0, berarti ada data yang tersimpan di array, sehingga program akan mencetak daftar prestas

    = for (int i = 0; i < count; i++) Perulangan untuk mencetak semua prestasi yang telah dicatat.

    = } else {
    System.out.println("Belum ada data prestasi");
    Jika count == 0, berarti belum ada data prestasi yang dimasukkan. Program akan menampilkan pesan "Belum ada data prestasi" kepada pengguna

    = break; digunakan untuk menghentikan eksekusi switch-case dan kembali ke menu utama.


case 3:
System.out.print("Masukkan jenis prestasi yang ingin dianalisis: "); 
String jenis = scs.nextLine(); 
System.out.println("=== ANALISIS PRESTASI ==="); 
for (int i = 0; i < count; i++) { 
        if (jenisPrestasi[i].equalsIgnoreCase(jenis)) { 
            System.out.println("Nama: " + namaMahasiswa[i] + "| NIM: " + nimMahasiswa[i] + "| Tingkat: " + tingkatPrestasi[i] + "| Tahun: " + tahunPrestasi[i]); 
        } 
    }
    break;

     = String jenis = input.nextLine(); untuk membaca input dari pengguna dan menyimpannya dalam variabel jenis

     = for (int i = 0; i < count; i++) untuk melakukan perulangan untuk memeriksa setiap data yang telah disimpan.

     = Menggunakan equalsIgnoreCase() agar tidak sensitif terhadap huruf besar/kecil 

     = break; digunakan untuk menghentikan eksekusi switch-case dan kembali ke menu utam


case 4: 
    System.out.println("Terima kasih!"); 
    break;
    = Menampilkan pesan "Terima kasih!" sebelum program berhenti.
        

default:
    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
    = Jika pengguna memasukkan angka yang tidak tersedia di menu, maka akan muncul pesan error.

} while (choice != 4);
    = Program akan terus berjalan sampai pengguna memilih 4 untuk keluar.
