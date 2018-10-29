/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Animal.
 */
package pbo2.pkg10117067.latihan53.rabbit;

/**
 *
 * @author Ihsanmi
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian=vegetarian;
        this.eats=food;
        this.noOfLegs=legs;
    }
    
    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    
    
}