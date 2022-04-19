package javaapplicatiparktikumpert7_01;

/**
 *
 * @author Ni Putu Eka Sepiantini 20103295
 */
public class JavaApplicatiParktikumPert7_01 {

    public static void main(String[] args) {
        mahasiswa MHS = new mahasiswa();
        
        //overloading
        MHS.datamhs(); //tanpa parameter
        MHS.datamhs("12345"); // dengan 1 parameter
        MHS.datamhs("12345", "Mail"); //dengan 2 parameter
                
    }
    
}
