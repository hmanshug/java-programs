package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

public class mouse2 extends Applet implements MouseInputListener {


   int width, height;
   int x, y;    // the coordinates of the upper-left corner of the box
   int mx, my;  // the most recently recorded mouse coordinates
   boolean isMouseDraggingBox = false;

    @Override
   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );

      x = width/2 - 20;
      y = height/2 - 20;

      addMouseListener( this );
      addMouseMotionListener( this );
   }

   public void mouseEntered( MouseEvent e ) { }
   public void mouseExited( MouseEvent e ) { }
   public void mouseClicked( MouseEvent e ) { }
   public void mousePressed( MouseEvent e ) {
      mx = e.getX();
      my = e.getY();
      if ( mx>x && mx < x+40 && y < my && my < y+40 ) {
         isMouseDraggingBox = true;
      }
      e.consume();
   }
   public void mouseReleased( MouseEvent e ) {
      isMouseDraggingBox = false;
      e.consume();
   }
   public void mouseMoved( MouseEvent e ) { }
   public void mouseDragged( MouseEvent e ) {
      if ( isMouseDraggingBox ) {
         // get the latest mouse position
         int new_mx = e.getX();
         int new_my = e.getY();

         // displace the box by the distance the mouse moved since the last event
         // Note that "x += ...;" is just shorthand for "x = x + ...;"
         x += new_mx - mx;
         y += new_my - my;

         // update our data
         mx = new_mx;
         my = new_my;

         repaint();
         e.consume();
      }
   }

   public void paint( Graphics g ) {
      g.setColor( Color.gray );
      g.fillRect( x, y, 40, 40 );
   }
}
