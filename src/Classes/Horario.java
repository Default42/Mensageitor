/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Thiago
 */
public class Horario {
    String momento(){
        //variavel que recebe a hora
        int hora = Integer.parseInt(getDateTime());
        
        //Condicional para definir periodo do dia
        if (hora >= 7 && hora < 12){
            return "bom dia";
        } else if (hora >= 12 && hora < 18){
            return "boa tarde";
        }else {
            return "boa noite";
        }
        
        
    }
   
    String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("HH"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
}
    
    
}
 
    
