/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.util.Scanner;

/**
 *
 * @author G1
 */
public class class_problems {
    
    
    // For Finding the squares of numbers till entered number 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.print("Result is =");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + (i * i));
        }


        // for finding the sum of all number, their squares and their cubes till entered number
        
        int i = 1, a = 0, b = 0, c = 0;
        while (i <= n) {
            a = a + i;
            b = b + i * i;
            c = c + i * i * i;
            i = i + 1;
        }

        System.out.print("\nResult is =");
        System.out.println(" " + a + " " + b + " " + c);

        
        
        // for creating tables until number entered
        
        System.out.print("Result is =\n");
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                int k = i * j;
                System.out.print(" " + k);

            }
            System.out.print("\n");
        }


    }
}
