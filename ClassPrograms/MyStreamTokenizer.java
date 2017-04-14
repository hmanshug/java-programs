/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 *
 * @author himanshugarg
 */
public class MyStreamTokenizer {

    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("a.txt");
        InputStreamReader ir = new InputStreamReader(fin);
        StreamTokenizer st = new StreamTokenizer(ir);
        st.eolIsSignificant(true);
        st.wordChars(33, 255);
        st.whitespaceChars(0, 32);
        int token = 0;
        int count = 0;
        while (true) {
            token = st.nextToken();
            if (token == StreamTokenizer.TT_EOF) {
                break;
            }
            if (token == StreamTokenizer.TT_NUMBER) {
                System.out.println(st.nval + " number");
            }
            if (token == StreamTokenizer.TT_WORD) {
                System.out.println(st.sval + " word");
            }
            if (token != StreamTokenizer.TT_EOL) {
                count++;
            }

        }
        //count--;  Wrong applied by sir
        
        System.out.println(count + " number of words in file");


    }
}
