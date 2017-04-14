/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author himanshugarg
 */
public class MyThread implements Runnable{
    Socket s;
    ArrayList al; 
    MyThread(Socket s, ArrayList al) {
        this.s=s;
        this.al=al;
    }
    
    @Override
    public void run() {
        String s1;
        try {
            DataInputStream din= new DataInputStream(s.getInputStream());
            do {
                s1= din.readUTF();
                System.out.println(s1);
                if(!s1.equals("stop"))
                    tellEveryOne(s1);
                else {
                    DataOutputStream dout= new DataOutputStream(s.getOutputStream());
                    dout.writeUTF(s1);
                    dout.flush();
                }
                
            } while(!s1.equals("stop"));
            
        } catch(Exception e) {
            System.out.println(e +"hello1");
        }
    }
    public void tellEveryOne(String s1) {
        Iterator i=al.iterator();
        while(i.hasNext()) {
            try{
                Socket sc= (Socket) i.next();
                DataOutputStream dout= new DataOutputStream(sc.getOutputStream());
                dout.writeUTF(s1);
                dout.flush();
                System.out.println("Client "+sc);
            } catch(Exception e) {
                System.out.println(e+"hello2");
            }
        }
        
    }
}
