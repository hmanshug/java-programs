/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author himanshugarg
 */
public class PublicChatServer {
    ArrayList al=new ArrayList();
    ServerSocket ss;
    Socket s;
    
    public PublicChatServer() {
        try {
            ss=new ServerSocket(10);
            while(true) {
                s=ss.accept();
                al.add(s);
                Runnable r = new MyThread(s,al); //Doubt
                Thread t= new Thread(r);
                t.start();
                
            }
        } catch(Exception e) {
            System.out.println(e+"hello");
        }
        
        
    }
    public static void main(String[] args) {
            new PublicChatServer();
        }
    
    
}

