/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author himanshugarg
 */
public class HashMapDemo {
    public static void main(String[] args) {
    
    HashMap<String, String> hm= new HashMap<String, String>();
    System.out.println(hm.size());
    hm.put("1001", "aaaa");
    hm.put("1002", "bbbb");
    hm.put("1003", "cccc");
    hm.put("1004", "dddd");
    hm.put("1005", "dddd");
    
    Set s= hm.entrySet();
    Iterator i= s.iterator();
    
    while(i.hasNext()) {
        Map.Entry e= (Map.Entry) i.next();
        String s1= (String) e.getKey();
        String s2= (String) e.getValue();
        System.out.println(s1+" : "+s2);
    } 
    
}
}