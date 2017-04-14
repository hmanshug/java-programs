/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author G1
 */
public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> ram = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                ram.add("January");

            case 2:
                ram.add("February");

            case 3:
                ram.add("March");

            case 4:
                ram.add("April");

            case 5:
                ram.add("May");

            case 6:
                ram.add("Jun");

            case 7:
                ram.add("July");

            case 8:
                ram.add("August");

            case 9:
                ram.add("September");

            case 10:
                ram.add("October");

            case 11:
                ram.add("November");

            case 12:
                ram.add("December");

                break;

        }
        for (String s : ram) {
            System.out.println("Month is " + s);
        }

    }
}
