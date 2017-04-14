
package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

public class Keyboard_Input extends Applet implements KeyListener, MouseMotionListener,MouseListener {
    
Graphics dbg;
private Image dbi;
    int x, y;
    String s="";
    Vector v=new Vector();
    Color[] col;
    int skip=0;
    @Override
    public void init() {
        resize(400, 400);
        
        setBackground(Color.black);
        setForeground(Color.white);
        
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        
        col=new Color[50];
        
        for(int i=0;i<50;i++) {
            col[i]=new Color(Color.HSBtoRGB(50-i/(float)50, 1, 1));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        char c=e.getKeyChar();
        if(c!=KeyEvent.CHAR_UNDEFINED) {
            s=s+c;
            repaint();
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        
          // only process every 5th mouse event
        
      if ( skip > 0 ) {
         -- skip;  // this is shorthand for "skip = skip-1;"
         return;
      }
      else skip = 5;
      
        v.addElement(new Point(e.getX(), e.getY()));
        if(v.size()>50) {
            v.removeElementAt(0);
        }
        repaint();
        e.consume();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.requestFocusInWindow();
        x=e.getX();
        y=e.getY();
        s="";
        repaint();
        e.consume();
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
    
    
    @Override
    public void paint(Graphics g) {
        for(int i=0;i<v.size();i++) { 
        g.setColor(col[i]);
        Point a=(Point) v.elementAt(i);
        g.drawString(s, a.x, a.y);
        
        
        }
    }
   
    @Override
    public void update(Graphics g) {
        if (dbi == null) {
            dbi = createImage(this.getSize().width, this.getSize().height);
            dbg = dbi.getGraphics();
        }

        dbg.setColor(getBackground());
        dbg.fillRect(0, 0, this.getSize().width, this.getSize().height);
        dbg.setColor(getForeground());
        paint(dbg);
        g.drawImage(dbi, 0, 0, this);

    }

}
