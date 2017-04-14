package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class LineApplet extends Applet implements Runnable {

    int i = 0;
    int m = 0, n = 0;
    boolean b = false;
    private Image dbi;
    Image img;
    Graphics dbg;

    @Override
    public void init() {

        resize(500, 500);
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



        if (b == false) {
            j.setColor(Color.darkGray);
            j.fillRect(50, 50, 400, 400);
            j.setColor(Color.RED);
            j.drawLine(50 + 4 * m, 50, 450, 450);
            j.drawLine(50, 50 + 4 * m, 450, 450);
            i = i + 5;
            m = m + 5;

        } else {

            j.setColor(Color.darkGray);
            j.fillRect(50, 50, 400, 400);
            j.setColor(Color.RED);
            j.drawLine(450 - 4 * n, 50, 450, 450);
            j.drawLine(50, 450 - 4 * n, 450, 450);
            n = n + 5;
            i = i - 5;
        }



        if (i == 0) {
            m = 0;
            b = false;
        } else if (i == 100) {
            b = true;
            n = 0;
        }




    }

    @Override
    public void run() {
        while (true) {
            repaint();

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                
            }

        }

    }

    @Override
    public void update(Graphics j) {
        if (dbi == null) {
            dbi = createImage(this.getSize().width, this.getSize().height);
            dbg = dbi.getGraphics();
        }

        dbg.setColor(getBackground());
        dbg.fillRect(0, 0, this.getSize().width, this.getSize().height);
        dbg.setColor(getForeground());
        paint(dbg);
        j.drawImage(dbi, 0, 0, this);

    }
}
