/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pbo.quis1_c_3067;

/**
 *
 * @author Az Zahra Normalita Ayuningtyas
 * 21103067
 */
public class Mahasiswa extends Penduduk{
    String nim;
    float ipk;
    
    public void tampilDataMahasiswa(){
        tampilDataPenduduk();
        System.out.println("NIM             : "+nim);
        System.out.println("IPK             : "+ipk);
    }
    public void tampilDataBeasiswa(){
        if(ipk > 3.5){
            System.out.println("Mahasiswa bernama "+nama+" berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama "+nama+" tidak berhak mendapatkan beasiswa");
        }
    }
}
    
