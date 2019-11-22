/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5_kambing_global;

/**
 *
 * @author 
 * Nama : Reki Ramdani
 * KELAS : TI-1C
 * NIM : A2.1900146
 */
public class kambingGlobal {
    //variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        
        kambingGlobal kambingSusu = new kambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menmapilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
}
