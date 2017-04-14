/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

//Doubt public class GenDemo???
/**
 *
 * @author himanshugarg
 */
public class Generics<T extends Number> {
    
    T ob;
    T vals[];
    
    Generics(T o, T[] nums) {
        ob= o;
        vals= nums;
    }

//    Generics() {
//        
//    }
//    void show() {
//        System.out.println("Hello");
//    }
}

class GenDemo {
    public static void main(String[] args) {
        Integer n[]={1,2,3,4,5};
        
        Generics<Integer> iob= new Generics<Integer>(50,n);
        Generics<?> gens[]= new Generics<?>[1];
        gens[0]= new Generics<Integer>(10,n);
        
        for(int i=0; i<gens[0].vals.length; i++)
            System.out.println(gens[0].vals[i]);
        
    }
}