/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author User
 */
public class albhabets extends Applet{
    int height, width, centrex, centrey;

    @Override
    public void init() {
        resize(800, 480);
        height = getHeight();
        width = getWidth();
        centrex = width / 2;
        centrey = height / 2;


    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(50, 50, 700, 380);
        
       // for a
        g.drawRect(55, 55, 50, 50);
        g.drawLine(55, 105, 55, 150);
        g.drawLine(105, 105, 105, 150);
        
        //for b
       g.drawLine(135, 55, 135, 155);
        g.drawArc(110, 55, 50, 50, 270, 180);
       g.drawArc(110, 105, 50, 50, 270, 180);

       
       // for c
        g.drawArc(180, 55, 75, 100, 90, 180);
        
        // for d
         g.drawArc(225, 100, 50, 50, 90, 180);
         g.drawLine(250, 55, 250, 155);
         g.drawLine(250, 155, 300, 155);
    }
    
    
}


