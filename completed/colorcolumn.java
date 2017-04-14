/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author SachinChauhan
 */
public class colorcolumn extends Applet implements MouseListener {

   

    int mx, my;

    @Override
    public void init() {
        resize(800, 480);
        addMouseListener(this);
        
        
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
        
       g.drawRect(50, 50, 100, 200);
     
       g.setColor(Color.red);
       g.fillRect(50, 225, 100, 25);
   
       g.setColor(Color.yellow);
       g.fillRect(50, 200, 100, 25);
    
       g.setColor(Color.blue);
       g.fillRect(50, 175, 100, 25);

           if(my>=225 && my<=250)
           {
               g.setColor(Color.red);
               g.fillRect(50, 50, 100, 200);
           }
           else if(my>=200 && my<=225)
           {
               g.setColor(Color.yellow);
               g.fillRect(50, 50, 100, 175);
           }
           else if(my>=175 && my<=200)
                   {
                     g.setColor(Color.blue);
               g.fillRect(50, 50, 100, 150);  
                   }

       
    }
    @Override
    public void mouseClicked(MouseEvent e) {
      mx=e.getX();
      my=e.getY();
      repaint();
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
          }

    @Override
    public void mouseReleased(MouseEvent e) {
        }

    @Override
    public void mouseEntered(MouseEvent e) {
       
       }

    @Override
    public void mouseExited(MouseEvent e) {
       }
}

  
