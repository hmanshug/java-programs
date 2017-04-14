/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blodu
 */
public class spiralApplet extends Applet implements Runnable{

    int i = 0;
    private Image dbi;
    Image img;
    Graphics dbg;

    @Override
    public void init() {

        resize(800, 480);
        setBackground(Color.black);

    }

    @Override
    public void start() {
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void stop() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void paint(Graphics j) {

        j.setColor(Color.yellow);

        for (i = 0; i < 20; i++) {
            j.drawArc(200 + 10 * i, 0 + 10 * i, 400 - 20 * i, 400 - 20 * i, 180, 180);
            j.drawArc(210 + 10 * i, 10 + 10 * i, 390 - 20 * i, 390 - 20 * i, 0, 180);  
        
         try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
               
            }
    }
    } 
    

    @Override
    public void run() {
        while (true) {
            repaint();
            

            try {
                Thread.sleep(45);
            } catch (Exception e) {
            }

        }

    }
    
// Another Logic
    
    
    
//int width, height;
//   int N = 100; // number of points per full rotation
//   int W = 5;  // winding number, or number of full rotations
// 
//    @Override
//   public void init() {
//
//      width = getSize().width;
//      height = getSize().height;
//      setBackground( Color.black );
//      setForeground( Color.green );
//   }
// 
//    @Override
//   public void paint( Graphics g ) {
//
//      int x1 = 0, y1 = 0, x2, y2;
//      for ( int i = 1; i <= W*N; ++i ) {
//         double angle = 2*Math.PI*i/(double)N;
//         double radius = i/(double)N * width/2 / (W+1);
//         x2 = (int)( radius*Math.cos(angle) );
//         y2 = -(int)( radius*Math.sin(angle) );
//         g.drawLine( width/2+x1, height/2+y1, width/2+x2, height/2+y2 );
//         x1 = x2;
//         y1 = y2;
//      }
//   }
    
}
