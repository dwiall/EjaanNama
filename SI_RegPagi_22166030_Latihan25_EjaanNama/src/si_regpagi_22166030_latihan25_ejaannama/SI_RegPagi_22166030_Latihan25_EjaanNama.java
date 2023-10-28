package si_regpagi_22166030_latihan25_ejaannama;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program ejaan nama yang inputannya berasal dari user.
 */
public class SI_RegPagi_22166030_Latihan25_EjaanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Variabel
        String nama;
        
        //Memasukkan nama depan untuk dieja
        System.out.print("Masukkan nama depan untuk dieja: ");
        nama = input.nextLine();

        System.out.println("\n");
        //Mencetak nama untuk dieja
        System.out.println("Ejaan untuk" + " " + "'" + nama + "'" + " " + "adalah : " );
        
        //Menampilkan kondisi perulangan menggunakan for
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }
    }
}
