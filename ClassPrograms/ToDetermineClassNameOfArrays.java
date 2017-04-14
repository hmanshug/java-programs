/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

/**
 *
 * @author himanshugarg
 */
public class ToDetermineClassNameOfArrays {
    public static void main(String[] args) {
        
        String name;
        
        name= boolean[].class.getName(); 
        System.out.println(name);
        name= int[].class.getName();
        System.out.println(name);
        name= float[].class.getName();
        System.out.println(name);
        name= byte[].class.getName();
        System.out.println(name);
        name= char[].class.getName();
        System.out.println(name);
        name= short.class.getName();
        System.out.println(name);
    }
    
}
