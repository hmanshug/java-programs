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
public class to_char_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a[] = str.toCharArray();
        int i;
        for (i = 0; i < str.length(); i++) {
            if (64 < a[i] && a[i] < 97) {
                a[i] = (char) (a[i] + 32);
                System.out.print(" " + a[i]);
            } else if (96 < a[i] && a[i] < 130) {
                a[i] = (char) (a[i] - 32);
                System.out.print(" " + a[i]);
            }

        }

    }
}
