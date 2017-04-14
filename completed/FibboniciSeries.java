/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.util.Scanner;

/**
 *
 * @author blodu
 */
public class FibboniciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        long n = sc.nextLong();
        long a = 0, b = 1, c;
        System.out.print(" " + a + " " + b);
        while (true) {
            c = a + b;
            if (c >= n) {
                System.out.println("\nFibonicci Series ended");
                break;
            }
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
