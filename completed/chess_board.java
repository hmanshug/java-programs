package completed;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class chess_board extends Applet {

    @Override
    public void init() {
        resize(800, 800);
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
    public void paint(Graphics a) {
        a.drawRect(70, 70, 560, 560);
        int i, j;
        int x, y = 70;
        for (i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                x = 70;
            } else {
                x = 140;
            }
            for (j = 0; j < 4; j++) {
                a.fillRect(x, y, 70, 70);
                x = x + 140;
            }

            y = y + 70;
        }


        showStatus("Chess-Board");



// Another Method

//for(int i=0;i<8;i++)
//        {
//            for(int j=0;j<8;j++)
//            {
//                if((i+j)%2==0)
//                    g.setColor(Color.black);
//                else
//                    g.setColor(Color.white);
//                    
//                g.fillRect(50*j, 50*i,50,50);
//            }
//        }
    }
}
