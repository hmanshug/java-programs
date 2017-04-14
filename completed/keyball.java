
package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyball extends Applet implements Runnable, KeyListener {
    int x=0, y=80;
    private Image dbi;
    Graphics dbg;
    boolean check1=false,check2=false;
    boolean check3=false,check4=false;
    boolean check5=false,check6=false;
    boolean check7=false,check8=false;
    
    @Override
    public void init() {
        resize(800, 480);
        setBackground(Color.black);
        addKeyListener(this);
        
//        x=getWidth()/2;
//        y=getHeight()/2;
//   
    }   
    
    @Override
    public void start() {
        Thread th=new Thread(this); 
        th.start();
    }

    @Override
    public void run() {
        while(true) {
            repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        e.consume();
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int b=e.getKeyCode();
        if(b==KeyEvent.VK_RIGHT) {
            x+=5;
            check1=true;
            check3=true;
             if(check5==true) {
                y=y-5;
                
            }
              if(check6==true) {
                y=y+5;
                
            }
            repaint();
            e.consume();
        }
        if(b==KeyEvent.VK_LEFT) {
            x-=5;
            check2=true;
            check4=true;
             if(check7==true) {
                y=y-5;
                
            }
             if(check8==true) {
                y=y+5;
                
            }
            repaint();
            e.consume();
        }
        if(b==KeyEvent.VK_UP) {
            y=y-5;
            check5=true;
            check7=true;
            if(check1==true) {
                x=x+5;
                
            }
            if(check2==true) {
                x=x-5;
                
            }
            repaint();
            e.consume();
        }
      
        if(b==KeyEvent.VK_DOWN) {
            y=y+5;
            check6=true;
            check8=true;
            if(check3==true) {
                x=x+5;
                
            }
            if(check4==true) {
                x=x-5;
                
            }
            repaint();
            e.consume();
        }
        
        int c=e.getKeyCode();
        if(c==KeyEvent.VK_A) {
            for(int i=0;i<20;i++) {
                y=y-5;
                repaint();
                e.consume();
            }

            
        }
   
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int b=e.getKeyCode();
        if(b==KeyEvent.VK_RIGHT) {
            check1=false;
            check3=false;
        }
         if(b==KeyEvent.VK_LEFT) {
            check2=false;
            check4=false;
        }
         if(b==KeyEvent.VK_UP) {
            check5=false;
            check7=false;
        }
         if(b==KeyEvent.VK_DOWN) {
            check6=false;
            check8=false;
        }
        if(b==KeyEvent.VK_A) {
            for(int i=0;i<20;i++) {
                y=y+5;
                repaint();
                e.consume();
            }
            
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

    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, 50, 50);
        try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                
            }
        
     
    }
}