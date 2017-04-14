/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author User
 */
public class mouseapplet extends Applet implements MouseListener, MouseMotionListener {

    int mx, my;

    @Override
    public void init() {
        resize(800, 480);
        addMouseListener(this);
        addMouseMotionListener(this);



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

        g.drawOval(mx, my, 100, 20);
//      g.drawOval(mx-50, my-10, 200, 40);
//      g.setColor(Color.red);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
      mx = e.getX();
        my = e.getY();
        repaint();

    
    
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

    @Override
    public void mouseMoved(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
        repaint();
        

    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }
}
