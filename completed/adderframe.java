/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author blodu
 */
public class adderframe extends JFrame{
    private final TextField number1;
    private final TextField number2;
    private final TextField result;
    private final JButton add;
    private final JButton sub;
    private final JButton mul;
    private final JButton div;
    private final JButton mod;
    private final JButton clear;
    
    public adderframe() {
        Container cp=getContentPane();
        cp.setLayout(new GridLayout(6, 2, 10, 3));
        
        cp.add(new JLabel("First Number = "));
         number1=new TextField("", 10);

         cp.add(number1);
         
         cp.add(new JLabel("Second Number = "));
         number2=new TextField("", 10);
         cp.add(number2);
         
         cp.add(new JLabel("Result = "));
         result=new TextField("");
         result.setEditable(false);
         cp.add(result);
         
         add= new JButton("+");
         cp.add(add);
         add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(number1.getText());
                int b=Integer.parseInt(number2.getText());
                result.setText(""+(a+b));
                number1.setText("");
                number2.setText("");
            }
        });
         
         sub= new JButton("-");
         cp.add(sub);
         sub.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(number1.getText());
                int b=Integer.parseInt(number2.getText());
                result.setText(""+(a-b));
                number1.setText("");
                number2.setText("");
            }
        });
         
         mul= new JButton("*");
         cp.add(mul);
         mul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(number1.getText());
                int b=Integer.parseInt(number2.getText());
                result.setText(""+(a*b));
                number1.setText("");
                number2.setText("");
            }
        });
         
         div= new JButton("/");
         cp.add(div);
         div.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(number1.getText());
                int b=Integer.parseInt(number2.getText());
                float z=(float)a/b;
                result.setText(""+(z));
                number1.setText("");
                number2.setText("");
            }
        });
         
         mod= new JButton("%");
         cp.add(mod);
         mod.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(number1.getText());
                int b=Integer.parseInt(number2.getText());
                result.setText(""+(a%b));
                number1.setText("");
                number2.setText("");
            }
        });
         
         clear= new JButton("CLEAR");
         cp.add(clear);
         clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("");
            }
        });
         
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setTitle("Swing Adder");
         setSize(300, 170);
         setVisible(true);
    }
    
    public static void main(String [] args) {
        adderframe adderframe = new adderframe();
    }
    
}
