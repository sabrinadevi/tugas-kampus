public class TicTacToe { 
    //Mendeklarasikan kelas utama bernama TicTacToe
    
        public static void main(String[] args) { 
        //Method main untuk memulai eksekusi program
    
            char[][] papan = new char[3][3]; 
            //Deklarasi array 2D ukuran 3x3  untuk menyimpan simbol prtmainain tic-tac-toe
    
            for (int i = 0; i < 3; i++) { 
            //Looping untuk iterasi melalui setiap baris papan
    
                for (int j = 0; j < 3; j++) { 
            //Looping untuk iterasi melalui setiap kolom papan
    
                    papan[i][j] = '-';
            //Menginisialisasi setiap elemen papan dengan karakter '-'
                }
            }
    
            papan[0][0] = 'X'; 
            //Menempatkan 'X' di posisi (0,0)
    
            papan[1][1] = 'O'; 
            //Menempatkan 'O' di posisi (1,1)
    
            papan[2][2] = 'X';
            //Menempatkan 'X' di posisi (2,2)
    
            System.out.println("Status Papan:"); 
            //Menampilkan teks "Status Papan:"
    
            tampilkanPapan(papan); 
            //Memanggil method tampilkanPapan untuk menampilkan status papan
        }
    
        public static void tampilkanPapan(char[][] papan) { 
        //Method untuk menampilkan status papan
    
            for (int i = 0; i < 3; i++) { 
        //Looping melalui setiap baris dari array 2D papan
    
                for (int j = 0; j < 3; j++) { 
        //Looping melalui setiap kolom dari array 2D papan
    
                    System.out.print(papan[i][j] + " "); 
            //Menampilkan setiap elemen papan diikuti dengan spasi
                }
    
                System.out.println(); 
            //Menampilkan baris baru setelah setiap baris papan ditampilkan
            }
        }
    }