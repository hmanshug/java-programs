/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.JFrame;

/**
 *
 * @author blodu
 */
public class swingcalculator extends JFrame {
    private TextField result;
    
    public void swingcalculator() {
        
        Container cp=getContentPane();
        Panel p=new Panel();
        
        p.setLayout(new BorderLayout());
        
        result=new TextField();
        p.add(result,BorderLayout.NORTH);
        
        setVisible(true);
        setSize(250,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    
     public static void main(String args[]) {
         
         new swingcalculator();
    }
}
