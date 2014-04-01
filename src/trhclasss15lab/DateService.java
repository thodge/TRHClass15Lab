/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trhclasss15lab;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tammie
 */
public class DateService {
    
        Calendar c = Calendar.getInstance();
        c.set(2000, Calendar.APRIL, 21);
        System.out.println("3 -The date output via toString(): " + c);
        date = c.getTime();
        System.out.println("4 - The date output via toString(): " + date);
    
}
