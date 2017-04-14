/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.awt.Color;
import java.lang.reflect.Field;

/**
 *
 * @author himanshugarg
 */
public class ToDetermineFields {
    
    public static void printFields(Object o) {
        Class c= o.getClass();
        Field f[]= c.getFields();
        
        for(int i=0; i<f.length; i++) {
            System.out.println(f[i]);
            Class type= f[i].getType();
            System.out.print(type.getName());
            System.out.println(" "+ f[i].getName());
        }
        
    }
    
    public static void main(String[] args) {
        Color c= new Color(1,1,1);
        printFields(c);
    }
}
