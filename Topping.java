/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Topping {
    private String rasa;
    private int hargaT;
    
public Topping(){}

public void getRasaT(int pilihan){
    switch(pilihan){
        case 1: rasa = "Coklat";
                hargaT = 2000;
            break;
            
       case 2 : rasa = "Vanila";
                hargaT = 1000;
           break;
           
       case 3 : rasa = "Strawberi";
                hargaT = 1500;
           break;
           
       case 4 : rasa = "Durian";
                hargaT = 2000;
           break;
           
       case 5 : rasa = "Buble Gum";
                hargaT = 2000;
       break;
    }

}

public int getHargaT(){
return hargaT;
}

public String getJenisT(){
    return rasa;
}
    
}
