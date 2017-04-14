package completed;

import java.awt.*;
import javax.swing.JFrame;


public class NewClass extends JFrame {
    private TextField result;
    
    public  NewClass() {
        
        Container cp=getContentPane();
        cp.setLayout(new GridLayout(4,4,10,3));
        //Panel p=new Panel();
        
        //p.setLayout(new BorderLayout());
        
        result=new TextField();
//        p.add(result,BorderLayout.NORTH);
        
        
        cp.add(result);
        
        setVisible(true);
        setSize(250,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    
     public static void main(String [] args) {
         
           new NewClass();
    }
}
