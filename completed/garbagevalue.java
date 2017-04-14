/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author G1
 */
public class garbagevalue {

    public static void main(String[] args) throws Exception {
        
        //  FOR GARBAGE VALUE


        Runtime n = Runtime.getRuntime();

        System.out.println("" + n.freeMemory());
        n.gc();
        System.out.println(+n.freeMemory());

        
        //   FOR IP ADDRESS

        System.out.println(InetAddress.getLocalHost());

        
        // Control Statement

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a > b ? 10 : 100);
        System.out.println("" + c);

    }
}
