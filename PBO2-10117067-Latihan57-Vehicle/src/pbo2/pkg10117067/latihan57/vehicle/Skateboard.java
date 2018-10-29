/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Skateboard.
 */
package pbo2.pkg10117067.latihan57.vehicle;

/**
 *
 * @author Ihsanmi
 */
public class Skateboard extends Vehicle{
    private double myBoardLeght;
    public Skateboard(){
        System.out.println("Skateboard");
    }

    public double getMyBoardLeght() {
        return myBoardLeght;
    }

    public void setMyBoardLeght(double myBoardLeght) {
        this.myBoardLeght = myBoardLeght;
    }
    
    
}