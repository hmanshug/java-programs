/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author himanshugarg
 */
public class DemoDsnMsAccess {

    public static void main(String[] args) {

        try {
            System.out.println("hello0");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("hello1");
            Connection con= DriverManager.getConnection("jdbc:odbc:mydsn", "Admin", "");
            System.out.println("hello3    "+con);
            Statement s= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("adfjsjdfdsflksd    "+s);
            s.executeUpdate("update student set name='nonu5' where id=2");
            //int x=s.executeUpdate("UPDATE Student SET Name = 'ram' WHERE ID=2;");
            
            //System.out.println("HJiiii     "+x);
           
            //ResultSet rs= s.executeQuery("SELECT * FROM Student");
//            ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE
//            System.out.println(rs.getString("ID"));
//            System.out.println(rs.getString("Name"));
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
