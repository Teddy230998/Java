/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author baciel
 */
public class kambing {
    public void tambahKambing() {
        //Deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah: " +
                jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kambing kambingJantan = new kambing();
        kambingJantan.tambahKambing();
        // TODO code application logic here
    }
}
