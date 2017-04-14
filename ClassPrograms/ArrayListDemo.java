/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author himanshugarg
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<ArrayList> al=new ArrayList<ArrayList>();
        ArrayList<String> al1= new ArrayList<String>(5);
        System.out.println(al.size()+" "+al1.size());
        
        al1.add("a");
        al1.add("bb");
        al1.add("ccc");
        al1.add("dddd");
        
        al.add(al1);
        al.add(al);
        
        System.out.println(al.size()+" "+al1.size());
        System.out.println(al);
        
        Iterator i= al.iterator();
        
        while(i.hasNext()) {
            System.out.println("Al= "+i.next());
        }
        
        Iterator<String> i1= al1.iterator();
        
        while(i1.hasNext()) {
            String s=i1.next();
            System.out.println("Al1= "+s);
        }
        
    }
   
}
