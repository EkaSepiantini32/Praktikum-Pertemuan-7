package praktikumpert7_02;

/**
 *
 * @author Ni Putu Eka Sepiantini 20103295
 * Method Overloading
 */
public class buah {
    private String NAMA, WARNA;
    private double HARGA;
    
    public void setNAMA(String N){
        this.NAMA = N;
    }
    public String getNAMA(){
        return this.NAMA;
        
    }
    public void setWARNA(String color){
        this.WARNA = color;
    }
    public String getWARNA(){
        return this.WARNA;
    }
     public void setHARGA(double H){
        this.HARGA = H;
    }
    public double getHARGA(){
        return this.HARGA;
    }
    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah");
        System.out.println("Nama Buah : "+this.NAMA);
        System.out.println("Warna Buah : "+this.WARNA);
        System.out.println("Harga Buah : "+this.HARGA);
    }
}
