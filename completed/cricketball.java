/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package completed;

import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class cricketball extends Applet implements Runnable, AudioClip, MouseMotionListener {

    int x = 400, y = 240;
    boolean a = true, b = true;
    int mx;
    Image img;
    AudioClip au;
    private Image dbi;
    Graphics dbg;

    @Override
    public void init() {
        resize(800, 480);
        img = getImage(getClass().getResource("images.png"));
        au = getAudioClip(getClass().getResource("that.hurts.au"));
        addMouseMotionListener(this);

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
    public void paint(Graphics g) {


        g.setColor(Color.black);
        g.fillRect(20, 20, 760, 440);

        g.setColor(Color.blue);
        g.fillRect(400, 100, 20, 20);

        g.setColor(Color.yellow);
        if (mx >= 80 && mx <= 720) {
            g.fillRect(mx, 440, 60, 20);
        } else if (mx < 80) {
            g.fillRect(20, 440, 60, 20);
        } else if (mx > 720) {
            g.fillRect(720, 440, 60, 20);
        }

        g.fillOval(x, y, 30, 30);



        if (a == true) {
            x++;
            if (x == 760) {
                a = false;
            }
        }
        if (a == false) {
            x--;
            if (x == 20) {
                a = true;
            }
        }
        if (b == true) {
            y++;
            if (y == 420) {
                if (x <= mx + 75 && x >= mx - 30) {
                    b = false;
                } else {
                    //System.exit(0);
                }
            }
        }
        if (b == false) {
            y--;
            if (y == 20) {
                b = true;
            }
        }

        showStatus("Applet Made By Himanshu Garg");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mx = e.getX();
    }
    @Override
    public void run() {
        while (true) {
            repaint();
            try {

                Thread.sleep(0);
            } catch (InterruptedException f) {
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
    public void play() {
    }

    @Override
    public void loop() {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }
}
