/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author ilham
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        nilai Biodata = new nilai();
        Biodata.Nama = "Faishal";
        Biodata.NIS = "2020111001";
        Biodata.Kelas = "X RPL 1";
        Biodata.setNilai(95);
        System.out.println("Nama = "+Biodata.Nama);
        System.out.println("NIS = "+Biodata.NIS);
        System.out.println("Kelas = "+Biodata.Kelas);
        System.out.println("Nilai = "+Biodata.getNilai());
    }
    
    
}
