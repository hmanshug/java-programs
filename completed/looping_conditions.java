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
public class looping_conditions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int f = sc.nextInt();
        if (f >= 40) {
            System.out.println("Pass");
            if (f >= 90) {
                System.out.println("Grade is A");
            } else if (f >= 75 && f < 90) {
                System.out.println("Grade is B");


            } else {
                System.out.println("Grade is c");

            }

        } else {
            System.out.println("Fail");
        }

    }
}
