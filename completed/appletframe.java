
package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class appletframe extends Applet implements ActionListener{
    private TextField number;
    private int count=0;

    @Override
    public void init() {
        
        add(new Label("Enter number"));
        setBackground(Color.black);
        number=new TextField(10);
        add(number);
        number.addActionListener(this);
        
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        int number1=Integer.parseInt(number.getText());
        count=count+number1;
        number.setText("");
        showStatus("Accumlator Sum = "+count);
       }
}
