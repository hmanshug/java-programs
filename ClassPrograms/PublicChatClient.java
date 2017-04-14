/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author himanshugarg
 */
public class PublicChatClient {
    
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    public PublicChatClient() {
        try {
            s=new Socket("14.139.236.34",10);
            din= new DataInputStream(s.getInputStream());
            dout= new DataOutputStream(s.getOutputStream());
            clientChat();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public void clientChat() throws IOException {
        My m= new My(din);
        Thread t1= new Thread(m);
        t1.start();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1;
        do {
            s1=br.readLine();
            dout.writeUTF(s1);
            dout.flush();
        }
                while(!s1.equals("stop"));
    }
    
    public static void main(String[] args) {
        new PublicChatClient();
        
    }
    
}
