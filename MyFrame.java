import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public static int width=400;

    public static int height=300;

    private Staya f1;

    public MyFrame(String name){
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Окно");


    }

    public MyFrame(Staya f){
        this("Окошко");
        this.f1=f;


    }
    public void paint(Graphics g){

       g.translate(getWidth()/2, getHeight()/2);

        f1.draw(g);
    }
}
//g.drawLine(0,-getHeight(),0,getHeight());
//g.drawLine(-getWidth(),0,getWidth(),0);
/*    g.setColor(new Color(255,0,0));
        g.drawLine(50,50,100,100);
        g.setColor(new Color(0,255,0));
        g.fillOval(100,50,50,50);*/