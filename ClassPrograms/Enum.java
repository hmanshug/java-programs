/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

/**
 *
 * @author himanshugarg
 */
public class Enum {
    public static void main(String args[]) {
//        Week day1[]= Week.values();
//        for(Week aday:day1) {
//            System.out.print(aday + " = ");
//            System.out.println(aday.ordinal());
//        }
        
        Week day1, day2, day3;
        day1= Week.valueOf("Monday");
        day2= Week.Tuesday;
        day3= Week.Monday;
        
        if(day1.equals(day2))
            System.out.println("Result1");
        
        if(day1.equals(day3))
            System.out.println("Result2");
        
        if(day1 ==(day3))
            System.out.println("Result3");
        //REASON: Enum Are Classes as we know but we are not initialising with new operator so all same constant value is referenced by objects
        
        // Constructor starts
        
        System.out.println(day1.Friday.getCost());
        
    }
    
    
}

enum Week {

    Monday(10), Tuesday(20), Wednesday(30), Thrusday(40), Friday(50), Saturday(60), Sunday(70);
    
    private int cost;
    
    Week(int p) {
    cost= p;
    }
    
    int getCost() {
        return cost;
    }
    
}