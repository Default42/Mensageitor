/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Thiago
 */
public class Horario {
    Locale locale = new Locale("pt","BR");
    GregorianCalendar calendar = new GregorianCalendar(); 
    SimpleDateFormat formatador = new SimpleDateFormat("'HH'",locale);
    String hora = Integer.toString(calendar.getTime());
    
    if (2 < 12 ){
    
}
    
}
