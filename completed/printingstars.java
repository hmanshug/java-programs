/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

/**
 *
 * @author G1
 */
public class printingstars {
    //FOR * PRINTING 

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }


        for (int l = 1; l <= 3; l++) {
            for (int m = 3; m >= l; m--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
