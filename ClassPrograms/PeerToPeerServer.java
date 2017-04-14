/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author himanshugarg
 */
public class PeerToPeerServer {

    ServerSocket ss;
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;

    public PeerToPeerServer() {
        try {
            System.out.println("Servver Started");
            ss = new ServerSocket(10);
            s = ss.accept();
            System.out.println(s);
            System.out.println("Client Connected");
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            serverChat();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void serverChat() throws IOException {
            String str;
            do {
                str=dis.readUTF();
                System.out.println("Client Messsage" + str);
                dos.writeUTF("hello"+str);
                dos.flush();
            }
                    while(!str.equals("stop"));
        }

    public static void main(String[] s) {
        new PeerToPeerServer();
        
    }
}
