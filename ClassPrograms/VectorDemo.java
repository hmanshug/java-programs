/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author himanshugarg
 */
public class VectorDemo implements Runnable {
    
    @Override
    public void run() {
        Vector<String> v = new Vector<String>(3, 2);
        System.out.println(v.size() + " " + v.capacity());
        
        v.addElement("aaaa");
        v.addElement("bbb");
        v.addElement("cc");
        v.addElement("d");
        
        v.remove(2);
        System.out.println(v.size() + " " + v.capacity());
        
        
        Enumeration e= v.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        
    }
}

class b {
    
    public static void main(String[] args) {
        Runnable ob = new VectorDemo();
        Thread t = new Thread(ob);
        Thread t1 = new Thread(ob);
        t.start();
        t1.start();
    }
}

