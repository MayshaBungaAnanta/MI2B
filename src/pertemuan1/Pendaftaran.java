/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author hp
 */
public class Pendaftaran {
      public static void main(String[] args){  
    
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="bunga";
        mhs.nobp ="2101092031";
        mhs.kelas ="mi2b";
        mhs.prodi ="MI";
        mhs.jurusan ="TI";
        
        System.out.println("Nama : " +mhs.nama+ "\n"
                + "No BP : "+mhs.nobp+ "\n"
                      + "Jurusan : "+mhs.jurusan+ "\n" 
                            + "Prodi : "+mhs.prodi+ "\n" 
                                + "Kelas : "+mhs.kelas+ "\n");
        
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama ="tiara";
        mhs2.nobp ="2101092039";
        mhs2.kelas ="mi2b";
        mhs2.prodi ="MI";
        mhs2.jurusan ="TI";
        
        System.out.println("Nama : " +mhs2.nama+ "\n"
                + "No BP : "+mhs2.nobp+ "\n"
                      + "Jurusan : "+mhs2.jurusan+ "\n" 
                            + "Prodi : "+mhs2.prodi+ "\n" 
                                + "Kelas : "+mhs2.kelas);
      }
}
