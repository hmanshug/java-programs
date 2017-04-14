/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.lang.reflect.Field;

/**
 *
 * @author himanshugarg
 */
public class ToAccessPrivateField {
    
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Class cls= Temp1.class;
        Temp1 t= new Temp1();
        Field field= cls.getDeclaredField("x");
        field.setAccessible(true);
        System.out.println(field);
        System.out.println(field.get(t));
        field.set(t,30);
        //System.out.println(t.x); //Produces Error
        System.out.println(field.get(t));
        
        Temp1 t1= t;
        System.out.println(t.equals(t1));
        System.out.println(t==(t1));
    }
}

class Temp1 {
    private final int x=10;
}