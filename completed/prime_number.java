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
public class prime_number {

    public static void main(String[] args) {

// FOR FINDING PRIME NUMBERS 1-100

        System.out.println("Problem-1");
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (j == i) {
                        System.out.println(" " + i);
                    }
                    break;

                }


            }




        }
        // for factorial


        Scanner sc = new Scanner(System.in);
        System.out.println("Problem-2\n Enter your number=");
        int a = sc.nextInt();

        for (int i = a - 1; i > 0; i--) {
            a = a * i;
        }

        System.out.println("Your factorial is=" + a);


    }
}
