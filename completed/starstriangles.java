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
public class starstriangles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  rows of triangle 1 =");
        int n = sc.nextInt();
        int p = n, q = n;
        System.out.println("Your trianle 1 is");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * n - 1; j++) {

                if (j >= p && j <= q) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
            p = p - 1;
            q = q + 1;
        }



        System.out.println("Enter  rows of triangle 2 =");
        int m = sc.nextInt(), r = m;
        System.out.println("Your trianle 2 is");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (j >= r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            r = r - 1;
        }


        System.out.println("Enter  rows of triangle 3 =");
        int o = sc.nextInt();
        int s = 1, t = 2 * n - 1;
        System.out.println("Your trianle 3 is");
        for (int i = 1; i <= o; i++) {

            for (int j = 1; j <= 2 * o - 1; j++) {

                if (j >= s && j <= t) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
            s = s + 1;
            t = t - 1;
        }





    }
}
