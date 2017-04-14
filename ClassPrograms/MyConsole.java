/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author himanshugarg
 */
public class MyConsole {

    public static void main(String[] args) throws IOException {
        
        Console cs = System.console();
        if (cs != null) {
            System.out.println("Console is available");
        }
        else {
            System.out.println("Console is not available");
            System.exit(1);
        }
        System.out.println("Enter the line");
        String s1 = cs.readLine();
        System.out.println(s1);

        String s2 = cs.readLine("Enter the name(%d chars):", 5);
        System.out.println("s2");
        
        System.out.println("Enter the password");
        char ch[] = cs.readPassword();
        char ch1[] = cs.readPassword("(%d chars):", 5);
        
        System.out.println(new String(ch));
        System.out.println(new String(ch1));


        PrintWriter pw = cs.writer();
        pw.println("Console via printwriter");

        
        Scanner sc=new Scanner(cs.reader());
        int a=sc.nextInt();
    }
}
