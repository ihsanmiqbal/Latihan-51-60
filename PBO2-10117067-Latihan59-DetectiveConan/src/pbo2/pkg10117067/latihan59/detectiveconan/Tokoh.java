/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Tokoh.
 */
package pbo2.pkg10117067.latihan59.detectiveconan;

/**
 *
 * @author Ihsanmi
 */
public class Tokoh {
    protected String nama;
    protected String sifat;
    protected String makanan;
    
    public Tokoh(String nama, String sifat, String makanan){
        this.nama=nama;
        this.sifat=sifat;
        this.makanan=makanan;
}
    public void displayKarakter(){
        System.out.println("Nama : "+nama);
        System.out.println("Makanan kesukaan : "+makanan);
        System.out.println("sifat : "+sifat);
}
}