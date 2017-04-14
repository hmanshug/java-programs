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
public class to_char_array1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i;
        char a[] = str.toCharArray();
        for (i = 0; i < str.length(); i++) {

            if (a[i] == '.') {
                a[i + 1] = (char) (a[i + 1] - 32);
            }
            
            System.out.print("" + a[i]);
        }



    }
}

