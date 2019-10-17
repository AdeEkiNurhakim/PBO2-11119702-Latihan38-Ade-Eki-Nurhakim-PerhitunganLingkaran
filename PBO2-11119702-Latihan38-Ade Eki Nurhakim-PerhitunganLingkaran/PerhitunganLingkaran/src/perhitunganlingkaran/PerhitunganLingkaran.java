/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitunganlingkaran;

/**
 *
 * @author Ekiw
 */
import java.util.Scanner;
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float diameter, jari, kel, luas;
        System.out.println("============ Perhitungan Lingkaran ========= ");
        System.out.print("Masukan Nilai Variable Jari = ");
        diameter = masukan.nextFloat();
        jari = (float) (diameter/2);
        kel = (float) (2*3.14*diameter/2);
        luas = (float) (3.14*diameter/2*diameter/2);
        System.out.println();
        System.out.println("============ Hasil Perhitungan ========= ");
        System.out.println("Jari - jari \t = "+ jari);
        System.out.println("Keliling \t = " + kel);
        System.out.println("luas \t\t = " + luas);
        
          
    }
    
}
