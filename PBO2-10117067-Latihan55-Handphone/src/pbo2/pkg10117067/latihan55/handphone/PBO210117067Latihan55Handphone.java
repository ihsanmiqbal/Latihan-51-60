/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       data Handphone.
 */
package pbo2.pkg10117067.latihan55.handphone;

/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android andro = new Android("Xiomai","Android","Redmi Note 5",3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android KeyStore : "+andro.getKeyStore());
        System.out.println("");
        
        Blackberry bb = new Blackberry("Blackberry","BB Z10","ZET TEN",2000000);
        bb.setPinBB("17714B");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Windows Phone","Lumia","809",3500000);
        wp.setWpKeyStore("WS10Pro");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
    }
    
}