/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author himanshugarg
 */
public class PropertiesDemo {
    public static void loadProperties() {
        Properties loadprops= new Properties();
        FileInputStream fi= null;
        try {
            fi= new FileInputStream("app.properties");
            loadprops.load(fi);
            Enumeration names= loadprops.propertyNames();
            while(names.hasMoreElements()) {
                String key= (String) names.nextElement();
                String v= loadprops.getProperty(key);
                System.out.println(key+" : "+v);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
      

    }
            public static void main(String[] args) {
            loadProperties();
        }
}
