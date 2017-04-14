/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author blodu
 */
public class colorApplet extends Applet {
    
    int height, width;
    int an = 90;
    int i = 10, j = 0, k = 20;
    Color[] co = new Color[30];
    Color[] mo = new Color[30];
    
    @Override
    public void init() {
        resize(400, 400);
        height = getHeight();
        width = getWidth();
        setBackground(Color.black);
        
        
        for (int m = 1; m <= 30; m++) {
            co[m - 1] = new Color(m / (float) 30, m / (float) 30, m / (float) 30);
            mo[m - 1] = new Color(m / (float) 30, (30 - m) / (float) 30, 0);
        }
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
    public void paint(Graphics a) {
        
        for (int m = 0; m < 30; m++) {
            
            a.setColor(co[m]);
            a.fillArc(0, 0, width, height, an + 3 * m, 3);
//        an=an+3;
//        i++;
//        j++;
//        k++;
            a.setColor(mo[m]);
            a.fillArc(100, 100, width - 200, height - 200, an + 3 * m, 3);
            
        }
        
        
    }
}




