/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.lang.reflect.Constructor;

/**
 *
 * @author himanshugarg
 */
public class ToAccessPrivateConstructors {
   
    public static void main(String[] args) {
        try {
            Class c1= Temp.class;
            Constructor c= c1.getDeclaredConstructor();
            c.setAccessible(true);
            Temp t1= (Temp) c.newInstance();
            t1.show();
            
            Constructor c2= Temp.class.getDeclaredConstructor(int.class);
            c2.setAccessible(true);
            Temp t2= (Temp) c2.newInstance(10);
            t2.show();
            
        } catch(Exception e) {
            
        }
    }
}

class Temp {
    private Temp() {
        System.out.println("Default Constructor");
    }
    void show() {
        System.out.println("Show");
    }
    private Temp(int x) {
        System.out.println(x);
    }
}

