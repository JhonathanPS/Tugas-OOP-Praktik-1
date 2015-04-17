/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Eskrim {
    private String rasa;
    private int hargaE;
   
    
    public Eskrim(){}
   
        public void getRasa(int pilihan){
    switch(pilihan){
       case 1: rasa = "Coklat";
                hargaE = 15000;
       break;
       
       case 2 : rasa = "Vanila";
                hargaE = 10000;
       break;
       
       case 3 : rasa = "Strawberi";
                hargaE = 15000;
           break;
           
       case 4 : rasa = "Durian";
                hargaE = 13000;
           break;
       
       case 5 : rasa = "Buble Gum";
                hargaE = 15000;
         break;
    }}
    
    
    public int getHarga(){
        return hargaE;
    }
    
    public String getJenis(){
        return rasa;
    }

}
