/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentatie;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import logica.Cataloog;
import logica.Luchthaven;
import logica.Vlucht;

/**
 *
 * @author JoachimVAST
 */
public class Console {
    public static void main(String[] args){
        
        Cataloog cataloog = new Cataloog(3);
        cataloog.voegToe("Ryanair");
        cataloog.voegToe("Brussels Airlines");
        cataloog.voegToe("Tap Portugal");
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 8);
        
        Date datum = cal.getTime();
        Vlucht vlucht1 = new Vlucht(Luchthaven.BRUSSEL, Luchthaven.PORTO, datum, "RN2123", 200, 189);
        vlucht1.toString();
        
        
        
        
    }
}
