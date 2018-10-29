/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Warna Koordinat.
 */
package pbo2.pkg10117067.latihan54.koordinat;

/**
 *
 * @author Ihsanmi
 */
public class WarnaKoordinat extends Koordinat {
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);

    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
}