/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Conan
 */
package pbo2.pkg10117067.latihan59.detectiveconan;

/**
 *
 * @author Ihsanmi
 */
public class Conan {
    protected boolean sifat;
    protected String Hobby;
    
    public Conan(boolean sifat, String Hobby){
        this.sifat=sifat;
        this.Hobby=Hobby;
    }

    public boolean isSifat() {
        return sifat;
    }
    
    public String Hobby(){
        return Hobby;
    }
}