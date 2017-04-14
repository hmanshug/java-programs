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
public class matrix_addition {

    public static void main(String[] args) {

        // FOR SUM OF MATRIX


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Row and Column");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int i, j;

        System.out.println("Your Rows are " + p + "\nyour Columns are " + q);
        int a[][] = new int[p][q];


        System.out.println("Enter Your Values for 1st matrix");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Your Values for 2nd matrix");
        int b[][] = new int[p][q];
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("SUM OF MATRIX IS");
        int c[][] = new int[p][q];
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(" " + c[i][j]);
            }
            System.out.print("\n");
        }








    }
}
