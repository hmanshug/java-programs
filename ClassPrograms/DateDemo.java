/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author himanshugarg
 */
public class DateDemo {
    public static void main(String[] args) {
    Date today= new Date();
    GregorianCalendar cal=  new GregorianCalendar();
    cal.setTime(today);
    System.out.println("Today: "+ today.toString());
    displayDateInfo(cal);
    cal.clear();
}
    
    static void displayDateInfo(GregorianCalendar cal) {
        String days[]={"SUN", "MON", "TUE", "WED", "THU", "WED", "FRI"};
        String months[]= {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JULY", "AUG", "SEP"};
        String am_pm[]={"AM","PM"};
        System.out.println("Year: "+ cal.get(Calendar.YEAR));
        System.out.println("Month: "+ months[cal.get(Calendar.MONTH)]);
        System.out.println("Day: "+ days[cal.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("Hour: "+ cal.get(Calendar.HOUR));
        System.out.println("Minute: "+ cal.get(Calendar.MINUTE));
        System.out.println("Second: "+ cal.get(Calendar.SECOND));
        System.out.println(am_pm[cal.get(Calendar.AM_PM)]);
        
        TimeZone tz= cal.getTimeZone();
        System.out.println("Timezone: "+ tz.getID());
    }
}