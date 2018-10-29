/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Kartun.
 */
package pbo2.pkg10117067.latihan59.detectiveconan;

/**
 *
 * @author Ihsanmi
 */
public class Kartun extends Conan {
    private String makanan;
    private String name;
    
    public Kartun(String name,boolean sifat,String Hobby,String makanan) {
        super(sifat,Hobby);
        this.name=name;
        this.sifat=sifat;
        this.Hobby=Hobby;
        this.makanan=makanan;
    
    }

    public String getMakanan() {
        return makanan;
    }

    public String getName() {
        return name;
    }

    
}