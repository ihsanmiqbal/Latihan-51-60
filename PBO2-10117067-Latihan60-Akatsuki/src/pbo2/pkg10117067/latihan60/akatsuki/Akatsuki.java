/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Akatsuki.
 */
package pbo2.pkg10117067.latihan60.akatsuki;

/**
 *
 * @author Ihsanmi
 */
public class Akatsuki {
    protected String nama;
    protected String asalDesa;
    protected String pasangan;
    protected String jurus;
    
    
    public Akatsuki(String nam, String asalDesa, String pasangan, String jurus){
        this.nama=nama;
        this.asalDesa=asalDesa;
        this.pasangan=pasangan;
        this.jurus=jurus;
        
}

    public String getNama() {
        return nama;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public String getPasangan() {
        return pasangan;
    }

    public String getJurus() {
        return jurus;
    }
    
    
    public void tampil(){
        System.out.println("Nama : "+nama);
        System.out.println("Asal Desa : "+asalDesa);
        System.out.println("pasangan : "+pasangan);
        System.out.println("Jurus : "+jurus);
        
    }
    
    public void jurus(){
        System.out.println(nama+" Memiliki Jurus : ");
}
}