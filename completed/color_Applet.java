package completed;

import java.applet.*;
import java.awt.*;
import java.awt.Graphics;

public class color_Applet extends Applet implements Runnable{

    int height, width;
    Color[] co=new Color[30]; 

    @Override
    public void init() {
        resize(800, 500);
        setBackground(Color.black);
        height = getHeight();
        width = getWidth();
       
       for (int m = 1; m <= 30; m++) {
            co[m - 1] = new Color(Color.HSBtoRGB(30-m/(float)30,1,1));
            
        }

    }
    @Override
    public void start() {
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics a) {
        int radius =  200;


        for (int i = 0; i < 30; i++) {
            a.setColor(co[i]);
            
            double an = (2) * Math.PI * i / (double) 30;
            int x = (int) ((int) radius * Math.cos(an));
            int y = (int) ((int) radius * Math.sin(an));
            
             
      //        a.drawString("Color", x+300 , y + 300);
      //     a.drawOval(200 + x, 200 + y, 100, 200);
       //   a.drawArc(900 + x, 300 + y, 100, 100, 0, 360);
            a.draw3DRect(300 + x, 300 + y, 100, 100, true);
//            a.drawRect(900 + x, 300 + y, 100, 100);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
            
        }

    }

    @Override
    public void run() {
        while(true) {
        repaint();
       try {
                Thread.sleep(2);
            } catch (Exception e) {
            }       }
    }
}
