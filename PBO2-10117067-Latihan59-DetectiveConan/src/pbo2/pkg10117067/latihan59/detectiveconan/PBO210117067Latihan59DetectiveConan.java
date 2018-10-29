/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       biodata Detective Conan.
 */
package pbo2.pkg10117067.latihan59.detectiveconan;

import pbo2.pkg10117067.latihan59.detectiveconan.Kartun;

/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kartun mnc = new Kartun("Conan Edogawa",false,"Bermain Sepak Bola","Sushi");
        System.out.println("Nama Saya Adalah "+ mnc.getName());
        System.out.println(" Sifat Saya Pantang menyerah "+ mnc.isSifat());
        System.out.println(" Hobby saya adalah "+ mnc.Hobby);
        System.out.println(" Makanan Kesukaan "+mnc.getMakanan());
        
    }
    
}