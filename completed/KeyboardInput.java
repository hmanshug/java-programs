package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class KeyboardInput extends Applet implements KeyListener, MouseListener {

    int width, height;
    int x, y;
    String s = "";

    @Override
    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground(Color.black);

        x = width / 2;
        y = height / 2;

        addKeyListener(this);
        addMouseListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (c != KeyEvent.CHAR_UNDEFINED) {
            s = s + c;
            repaint();
            e.consume();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        s = "";
        repaint();
        e.consume();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.drawLine(x, y, x, y - 10);
        g.drawLine(x, y, x + 10, y);
        g.setColor(Color.green);
        g.drawString(s, x, y);
    }
}
