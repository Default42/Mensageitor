/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
            return "Bom dia ";
        } else if (hora >= 12 && hora < 18){
            return "Boa tarde ";
        }else {
            return "Boa noite ";
        }
        
        
    }
    int hora = Integer.parseInt(getDateTime());
    
    
    
   //Metodo que pega o horario do sistema 
    String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("HH"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
}
    
    
}
 
    
