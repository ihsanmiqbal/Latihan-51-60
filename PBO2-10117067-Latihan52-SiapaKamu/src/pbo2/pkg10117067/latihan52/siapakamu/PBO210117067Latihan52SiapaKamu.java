/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Nama
 */
package pbo2.pkg10117067.latihan52.siapakamu;

/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Nur Ihsan Muhammad Iqbal Santika");
        mhs.setKelas("IF 2");
        mhs.setNim("10117067");
        mhs.setUmur(19);
        System.out.println("NIM MAHASISWA "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}