/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

/**
 *
 * @author himanshugarg
 */
public class WrapperClasses {
    
    public static void main(String[] args) {
    //Number i1= new Integer(10);
    Integer i1= new Integer(10);
    Integer i2= new Integer("10");
    
    System.out.println(i1+" "+i2);
    
    Integer i=Integer.valueOf("100");
    System.out.println(i);
    
    
    String s= i.toString(10); //Use this, then overloaded is preferred to overrided
    String s1= Integer.toString(i);
    System.out.println(s+" "+s1);
    
    int x=11;
    Integer i3= new Integer(x);
    System.out.println(i3);
    
    boolean b=i1.equals(i3);
    System.out.println(b);
    
    int i4= Integer.parseInt(s);
    
    
}
}

