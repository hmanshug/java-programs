/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

/**
 *
 * @author himanshugarg
 */
import java.io.*;
import java.util.zip.*;

public class ZipFiles {

    //Below constructor is used in ParentChildConstructor to verify parent constructor is called when child class object is made.
    String name = "hey";

    public ZipFiles() {
        name = "Papa";
    }

    public static void main(String args[]) {
        try {

            FileOutputStream fos = new FileOutputStream("new.zip");
            ZipOutputStream zos = new ZipOutputStream(fos);

            String filename1 = "a.txt";
            String filename2 = "b.txt";
            String filename3 = "c.txt";
            String filename4 = "d.txt";

            addToZipFile("a.txt", zos);
            addToZipFile(filename2, zos);
            addToZipFile(filename3, zos);
            addToZipFile(filename4, zos);

            zos.close();
            fos.close();
        } catch (Exception e) {
            //System.out.println(e);
            e.printStackTrace();

        }
    }

    public static void addToZipFile(String filename, ZipOutputStream zos) throws FileNotFoundException, IOException {
        System.out.println("writing " + filename + " to zipfile");
        //File file = new File(filename);
        FileInputStream fis = new FileInputStream(filename);
        ZipEntry zipentry = new ZipEntry(filename);
        zos.putNextEntry(zipentry);
        byte[] bytes = new byte[fis.available()];
        System.out.println(fis.available());
        int c = fis.read(bytes); 
        System.out.println(bytes[0]);
        // bytes[0]= 82 = R's ascii value
        // here,bytes works as buffer which stores data from input steram in its byte array.
        // all characters(1 byte each) are stored in byte type array then written to the zos.
        System.out.println(c+"  "+fis.available());
        zos.write(bytes);
        fis.close();


    }
}
