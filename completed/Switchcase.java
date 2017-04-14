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
public class Switchcase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // SWITCH CASE 


        int month;
        String monthstring;
        System.out.println("Enter the Month");
        month = sc.nextInt();


        for (month = month; month <= 12; month++) {


            switch (month) {
                case 1:
                    monthstring = "January";
                    break;
                case 2:
                    monthstring = "February";
                    break;
                case 3:
                    monthstring = "March";
                    break;
                case 4:
                    monthstring = "April";
                    break;
                case 5:
                    monthstring = "May";
                    break;
                case 6:
                    monthstring = "Jun";
                    break;
                case 7:
                    monthstring = "July";
                    break;
                case 8:
                    monthstring = "August";
                    break;
                case 9:
                    monthstring = "September";
                    break;
                case 10:
                    monthstring = "October";
                    break;
                case 11:
                    monthstring = "November";
                    break;
                case 12:
                    monthstring = "December";
                    break;
                default:
                    monthstring = "Not Accepted";
                    break;


            }
            System.out.println("Month is " + monthstring);

        }

    }
}
