import java.util.Scanner;

public class Uas_Daspro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaMahasiswa = new String[100];
        String[] nimMahasiswa = new String[100];
        String[] jenisPrestasi = new String[100];
        String[] tingkatPrestasi = new String[100];
        int[] tahunPrestasi = new int[100];
        int count = 0;
        int choice;
        do {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Prestasi Mahasiswa");
            System.out.println("2. Tampilkan Daftar Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                if (count >= 100) { 
                    System.out.println("Jumlah prestasi telah mencapai batas maksimal."); 
                    break; 
                    } 

                    System.out.print("Nama Mahasiswa: "); 
                    namaMahasiswa[count] = input.nextLine(); 
                    System.out.print("NIM: "); 
                    nimMahasiswa[count] = input.nextLine(); 
                    System.out.print("Jenis Prestasi: "); 
                    jenisPrestasi[count] = input.nextLine(); 
                    while (true) { 
                        System.out.print("Tingkat Prestasi (Lokal, Nasional, Internasional): "); 
                        tingkatPrestasi[count] = input.nextLine(); 
                        if (tingkatPrestasi[count].equalsIgnoreCase("Lokal") || 
                        tingkatPrestasi[count].equalsIgnoreCase("Nasional") || 
                        tingkatPrestasi[count].equalsIgnoreCase("Internasional")) {
                            break; 
                        } else { 
                            System.out.println("Input tidak valid. Harap masukkan salah satu dari: Lokal, Nasional, Internasional."); 
                        } 
                    }
                    while (true) { 
                        System.out.print("Tahun Prestasi (2010 hingga tahun saat ini): "); 
                        int tahun = input.nextInt(); 
                        input.nextLine(); 
                        if (tahun >= 2010 && tahun <= 2024) { 
                            tahunPrestasi[count] = tahun; 
                            break; 
                        } else { 
                            System.out.println("Input tidak valid. Harap masukkan tahun antara 2010 hingga tahun saat ini."); 
                        } 
                    }

                    count++; 
                    System.out.println("Prestasi berhasil ditambahkan!");
                    break;
                case 2:
                if (count > 0) {
                    System.out.println("=== DAFTAR SEMUA PRESTASI ==="); 
                    for (int i = 0; i < count; i++) { 
                        System.out.println("Nama: " + namaMahasiswa[i] + "| NIM: " + nimMahasiswa[i] + "| Jenis: " + jenisPrestasi[i] + "| Tingkat: " + tingkatPrestasi[i] + "| Tahun: " + tahunPrestasi[i]); 
                    }
                } else {
                    System.out.println("belum ada data prestasi");
                }                  
                    break;
                case 3:
                System.out.print("Masukkan jenis prestasi yang ingin dianalisis: "); 
                String jenis = input.nextLine(); 
                System.out.println("=== ANALSIS PRESTASI ==="); 
                for (int i = 0; i < count; i++) { 
                    if (jenisPrestasi[i].equalsIgnoreCase(jenis)) { 
                        System.out.println("Nama: " + namaMahasiswa[i] + "| NIM: " + nimMahasiswa[i] + "| Tingkat: " + tingkatPrestasi[i] + "| Tahun: " + tahunPrestasi[i]); 
                    } 
                }
                    break;
                case 4: 
                    System.out.println("Terima kasih!"); 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 4);
    }
}
           