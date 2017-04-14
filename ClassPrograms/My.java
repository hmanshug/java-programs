/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.DataInputStream;

/**
 *
 * @author himanshugarg
 */
public class My implements Runnable {

    DataInputStream din;

    My(DataInputStream din) {
        this.din = din;
    }

    @Override
    public void run() {
        String s2 = "";
        do {
            try {
                s2 = din.readUTF();
                System.out.println(s2);
            } catch (Exception e) {
            }
        } while (!s2.equals("stop"));
    }
}
