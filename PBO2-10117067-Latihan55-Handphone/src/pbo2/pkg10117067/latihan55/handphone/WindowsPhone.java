/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Windows Phone.
 */
package pbo2.pkg10117067.latihan55.handphone;

/**
 *
 * @author Ihsanmi
 */
public class WindowsPhone extends Handphone {
     private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture=man;
        this.operatingSystem=os;
        this.model=model;
        this.harga=harga;
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
}