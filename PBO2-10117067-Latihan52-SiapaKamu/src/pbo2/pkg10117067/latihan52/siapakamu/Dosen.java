/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Dosen
 */
package pbo2.pkg10117067.latihan52.siapakamu;
/**
 *
 * @author Ihsanmi
 */
public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Nama Saya "+nama+" umur "+umur+" tahun sedang mengajar mata kuliah "+mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }    
}