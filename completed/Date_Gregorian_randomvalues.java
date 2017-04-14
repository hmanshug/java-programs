/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author G1
 */
public class Date_Gregorian_randomvalues {

    public static void main(String[] args) {


        //  FOR DATE PRINTING

        Date d = new Date();
        System.out.println("" + d);


        // FOR DAY USING GREGORIAN CALENDAR


        int day, month, year, min, hour, sec, mil, x;

        GregorianCalendar g = new GregorianCalendar();

        day = g.get(Calendar.DAY_OF_MONTH);
        month = g.get(Calendar.MONTH);
        year = g.get(Calendar.YEAR);
        month = month + 1;
        min = g.get(Calendar.MINUTE);
        hour = g.get(Calendar.HOUR);
        sec = g.get(Calendar.SECOND);
        mil = g.get(Calendar.MILLISECOND);


        System.out.println(" " + day + " " + month + " " + year + " " + min + " " + hour + " " + sec + " " + mil);


        //  FOR RANDOM VALUES

        Random r = new Random();
        int a = r.nextInt();
        System.out.println("" + r);

    }
}
