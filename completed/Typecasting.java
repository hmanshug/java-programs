/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

/**
 *
 * @author G1
 */
public class Typecasting {

    public static void main(String[] args) {

        //  integer to string typecasting
        int a = 1225252525;
        String z = Integer.toString(a);
        System.out.println("result is" + z);

        // string to integer typecasting
        String c = "techno";
        int y = Integer.parseInt(c);
        System.out.println("result is" + y);

        //string to double
        String d = "12345";
        double x = Double.valueOf(d);
        System.out.println("result is" + x);

        //double to string
        double e = 1222.55555d;
        String v = Double.toString(e);
        System.out.println("result is" + v);


    }
}