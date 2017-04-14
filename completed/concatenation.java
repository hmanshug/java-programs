/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

/**
 *
 * @author G1
 */
public class concatenation {

    public static void main(String[] args) {


        String a = "nagesh";
        String b = a.substring(2);
        System.out.println("my substring is=" + b);
        String c = "nagesh";
        String d = "himanshu";
        String e = "himanshun";
        String f = "himanshum";
        String g = c.concat(d).concat(e).concat(" ").concat(f);
        System.out.println("my substring is=" + c.substring(0, 5));
        String h = "Hello";
        String i = "HELLO";
        String j = "Hello";
        String k = "RAM";
        System.out.println("result is=" + h.equalsIgnoreCase(k));
        System.out.println("character is" + k.charAt(1) + " character2 is" + k.substring(0, 1) + "upper case is" + h.replace('H', 'g') + i.replaceAll(i, e));

        char r[] = k.toCharArray();
        for (int z = 0; z < h.length(); z++) {
            System.out.println("in array is=" + r[z]);
        }


        String str = "Nagesh";
        System.out.println(str.length());

        char tvite[] = str.toCharArray();
        for (int y = 0; y < str.length(); y++) {

            System.out.println(" in array is= " + tvite[y]);

        }


    }
}
