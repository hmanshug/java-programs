
package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class mouse3 extends Applet implements MouseMotionListener{
    
    
   int width, height;

   // We need a place to store a list of mouse positions.
   // Rather than use an array, we'll use a Vector, because
   // it allows elements to be easily appended and deleted.
   // (Technically, it would probably be more appropriate to
   // use a LinkedList, but they're only supported by Java 1.2)
   Vector listOfPositions;

    @Override
   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );

      listOfPositions = new Vector();

      
      addMouseMotionListener( this );
   }

   
   public void mouseMoved( MouseEvent e ) {

      if ( listOfPositions.size() >= 50 ) {
         // delete the first element in the list
         listOfPositions.removeElementAt( 0 );
      }

      // add the new position to the end of the list
      listOfPositions.addElement( new Point( e.getX(), e.getY() ) );

      repaint();
      e.consume();
   }
    @Override
   public void mouseDragged( MouseEvent e ) { }

    @Override
   public void paint( Graphics g ) {
      g.setColor( Color.white );
      for ( int j = 1; j < listOfPositions.size(); j++ ) {
         Point A = (Point)(listOfPositions.elementAt(j-1));
         Point B = (Point)(listOfPositions.elementAt(j));
         g.drawLine( A.x, A.y, B.x, B.y );
        
      }
   }
}

