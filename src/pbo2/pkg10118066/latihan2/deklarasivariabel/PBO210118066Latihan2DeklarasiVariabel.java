/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan2.deklarasivariabel;

/**
 * @author 
 * NAMA : Tegar Lucky'Q Oakley 
 * NIM : 10118066 
 * KELAS : IF2 
 * Deskripsi Program : Program ini berisi program untuk mengdeklarasikan dan pengaksesan variabel
 */
public class PBO210118066Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi Variabel Nilai\t= " + nilaiInt);
        System.out.println("Isi Variabel PHI\t= " + PHI);
        System.out.println("Isi Variabel Logika\t= " + nilaiLogika);
        System.out.println("Isi Variabel Karakter\t= " + nilaiKarakter);
    }
    
}
