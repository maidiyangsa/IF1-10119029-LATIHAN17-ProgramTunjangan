/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program perhitungan tunjangan, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gaji;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan ? : ");
        gaji = scanner.nextInt();
        
        System.out.print("Status Anda ? (Menikah/Belum) : ");
        status = scanner.next();
        
        System.out.println();
        System.out.println("=======Hasil Perhitungan Gaji Anda=======");
        
        double tunjangan = ("Menikah".equals(status))?0.35*gaji:0;
        System.out.println("Gaji Pokok : "+gaji);
        System.out.println("Tunjangan : "+tunjangan);
        System.out.println("Total Gaji : "+(tunjangan+gaji));
        System.out.println("(Developed by : Adrian Maidiyangsa)");
    }
    
}
