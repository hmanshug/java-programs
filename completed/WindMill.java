package completed;

import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WindMill extends Applet implements Runnable, MouseListener {

    int x = 400, y = 400;
    Image img;
    private Image dbi;
    Graphics dbg;
    int an = 0;
    int r = 200;
    int m, n;
    int mx, my;
    int dir;
    int count = 0;
    int sp = 50;
    boolean p = false;
    Font myFont = new Font("TimesRoman", Font.PLAIN, 30);
    Font myFont1 = new Font("TimesRoman", Font.PLAIN, 12);

    @Override
    public void init() {
        resize(800, 600);
        setBackground(Color.black);
        addMouseListener(this);
        

    }

    @Override
    public void start() {
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        
        g.setFont(myFont1);

        g.setColor(Color.white);
        g.setColor(Color.red);
        g.fillRect(600, 100, 100, 50);
        g.fillRect(600, 200, 100, 50);
        g.fillRect(600, 300, 100, 50);
        g.fillRect(600, 400, 100, 50);
        g.fillRect(600, 500, 100, 50);
        g.setColor(Color.white);
        g.drawString("START", 630, 130);
        g.drawString("ROTATE", 630, 230);
        g.drawString("STOP", 630, 330);
        g.drawString("SPEED UP", 630, 430);
        g.drawString("SPEED DOWN", 610, 530);
        
        g.setFont(myFont);
        g.drawString("AAP DUDE HAIN..!!", 100, 500);
        



        if (count % 2 == 0) {
            dir = 1;

        } else {
            dir = -1;

        }


        if (p == true) {
            an = an - dir * 2;
        }






        for (int i = 0; i < 6; i++) {
            m = x;
            n = y;
            double angle = an + 2 * Math.PI * i / (double) 6;
            x = (int) (r * Math.cos(angle));
            y = (int) (r * Math.sin(angle));
            g.drawLine(200, 200, 200 + x, 200 + y);

            if (i == 1 || i == 3 || i == 5) {
                g.drawLine(200 + x, 200 + y, 200 + m, 200 + n);
            }



        }


    }

    @Override
    public void run() {


        while (true) {
            repaint();
            try {
                Thread.sleep(sp);
            } catch (InterruptedException g) {
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
    public void mouseClicked(MouseEvent e) {
        mx = e.getX();
        my = e.getY();

        if (mx >= 600 && mx <= 700 && my >= 200 && my <= 250 && p == true) {

            count++;
        }
        if (mx >= 600 && mx <= 700 && my >= 100 && my <= 150) {
            p = true;

        }
        if (mx >= 600 && mx <= 700 && my >= 300 && my <= 350) {
            p = false;

        }
        if (mx >= 600 && mx <= 700 && my >= 400 && my <= 450 && p == true) {
            sp = sp - 5;
            if (sp == 0) {
                sp=5;
            }


        }
        if (mx >= 600 && mx <= 700 && my >= 500 && my <= 550 && p == true) {
            sp = sp + 5;
            if (sp == 100) {
                p = false;
            }


        }

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