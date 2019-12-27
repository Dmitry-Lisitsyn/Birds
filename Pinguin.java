import java.awt.*;


public class Pinguin extends Bird {
    public Pinguin(){
        System.out.println("Я пингвин!");

        color= Color.GREEN;
        if(x<penguin_minX){penguin_minX=x;}
        if(x>penguin_maxX){penguin_maxX=x;}
        if(y>penguin_maxY){penguin_maxY=y;}
        if(y<penguin_minY){penguin_minY=y;}

    }
    @Override
    public void fly(){
        System.out.println("Я не хочу летать!");
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(color);
        g.fillOval(x,y,size,size);
        g.setColor(Color.green);

        g.drawRect(penguin_minX,penguin_minY,penguin_maxX-penguin_minX+size,penguin_maxY-penguin_minY+size);
    }

}