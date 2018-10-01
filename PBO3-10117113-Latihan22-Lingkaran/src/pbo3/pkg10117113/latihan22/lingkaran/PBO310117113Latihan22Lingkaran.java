/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan22.lingkaran;

import com.sun.media.sound.SoftAbstractResampler;
import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk mengetahui Jari-jari, luas dan keliling lingkaran
 */
public class PBO310117113Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diameterRead;
        double jari,diameter,luas,keliling;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======PERHITUNGAN LINGKARAN========");
        do {
        System.out.print("Masukan Nilai Diameter Lingkaran = ");
        diameterRead = scanner.next();
            
            System.out.println((!diameterRead.matches("[0-9]*"))?"Nilai Diameter"
                                +" Tidak Sesuai\n":"");
        }while(!diameterRead.matches("[0-9]*"));
        System.out.println("=======Hasil Perhitungan========");
        diameter = Double.parseDouble(diameterRead);
        jari = diameter/2;
        luas = Math.PI*jari*jari;
        keliling = Math.PI*2*jari;
        System.out.println("Jari Jari Lingkaran = "+jari);
        System.out.println("Luas Lingkaran      = "+luas);
        System.out.println("Keliling Lingkaran  = "+keliling);
    }
    
}
