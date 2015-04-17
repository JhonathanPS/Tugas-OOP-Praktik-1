/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Date; 
import java.text.DateFormat; 
import java.text.SimpleDateFormat; 
public class Pembeli {
    private String id;
       
public Pembeli(){}

    /**
     *
     * @return
     */
    public String getTanggal() { 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        Date date = new Date(); 
        return dateFormat.format(date); 
    } 
    
    public String getID(){
        id = "konsumen";
        return id;
    }
       
}


 

    