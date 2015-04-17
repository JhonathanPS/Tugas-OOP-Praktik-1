/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Bon {

    Pembeli pembeli;
    Kasir kasir;
    Eskrim eskrim;
    Topping topping;

    public Bon() {
        this.eskrim = new Eskrim();
        this.kasir = new Kasir();
        this.pembeli = new Pembeli();
        this.topping = new Topping();
    }
    
    public static void main(String[] args) {
        Pembeli pembeli = new Pembeli();
        Kasir kasir = new Kasir();
        Eskrim eskrim = new Eskrim();
        Topping topping = new Topping();
        Scanner input = new Scanner (System.in);
        System.out.println  ("Tanggal dan waktu sekarang : "+ pembeli.getTanggal());
        System.out.print    ("Kasir                      : " + kasir.getNama());
        System.out.println(" ");
        
        System.out.print    ("Pilihan rasa eskrim anda   : ");
            int pilihan1 = input.nextInt();
            eskrim.getRasa(pilihan1);
        System.out.println(" ");
        
        System.out.print    ("Pilihan rasa topping anda   : ");
            int pilihan2 = input.nextInt();
            topping.getRasaT(pilihan2);
        System.out.println(" ");
        
        System.out.print    ("Rasa eskrim anda           : " + eskrim.getJenis());
        System.out.println(" ");
        
        System.out.print    ("Rasa topping anda          : " + topping.getJenisT());
        System.out.println(" ");
            int hargatotal = eskrim.getHarga() + topping.getHargaT();
        
        System.out.println    ("Harga eskrim anda          : Rp " + hargatotal);
        System.out.print    ("Jumlah uang anda           : Rp ");
        int bayar = input.nextInt();
        System.out.println(" ");
        int d = bayar - hargatotal;
            if (d < 0) {
            System.out.println     ("Uang anda kurang             : Rp " + d);
            }
            else
            {System.out.println    ("Kembalian anda             : Rp " + d);}
        
        System.out.println    ("TERIMA KASIH ATAS KUNJUNGAN ANDA");
             
    }
    
}
