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
public class PeerToPeerClient {
    
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    public PeerToPeerClient() {
        try {
            s=new Socket("localhost",10);
            System.out.println(s);
            din= new DataInputStream(s.getInputStream());
            dout= new DataOutputStream(s.getOutputStream());
            clientChat();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public void clientChat() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1;
        do {
            s1=br.readLine();
            dout.writeUTF(s1);
            dout.flush();
            System.out.println("Server Message:"+ din.readUTF());
            
        }
                while(!s1.equals("stop"));
    }
    
    public static void main(String[] args) {
        new PeerToPeerClient();
    }
  
}
