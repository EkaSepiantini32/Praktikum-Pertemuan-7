package praktikumpert7_02;

/**
 *
 * @author Ni Putu Eka Sepiantini 20103295
 * extendes/turunan
 * override
 */
public class Anggur extends buah{

    @Override
    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah Anggur");
        System.out.println("Nama Buah : "+this.getNAMA());
        System.out.println("Warna Buah : "+this.getWARNA());
        System.out.println("Harga Buah : "+this.getHARGA());
    }
}
