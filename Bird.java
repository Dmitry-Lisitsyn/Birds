import java.awt.*;
import java.util.Random;



public abstract class Bird {
    private static int num=0;

    protected  int x,y;
    protected static int penguin_minX,penguin_maxX, penguin_maxY, penguin_minY, parrot_minX,parrot_maxX,parrot_minY,parrot_maxY=200;


    protected static    int size=10;


    protected Color color=Color.magenta;

    public Bird() {
        Random a=new Random();
        num++;
        y=-MyFrame.width/2+a.nextInt(MyFrame.width);
        x=-MyFrame.width/2+a.nextInt(MyFrame.width);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Я птица № "+num);


    }

    public void fly() {
        System.out.println("Я лечу");
    }



    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,size,size);
    }
}
