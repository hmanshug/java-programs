/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author himanshugarg
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Properties systemprops= System.getProperties();
        SortedMap sortedsysprops= new TreeMap(systemprops);
        
        Set keyset= sortedsysprops.keySet();
        Iterator i= keyset.iterator();
        
        while(i.hasNext()) {
            String propertyname= (String) i.next();
            String propertyvalue= systemprops.getProperty(propertyname);
            
            System.out.println(propertyname+ " : "+ propertyvalue);
        }
}
}