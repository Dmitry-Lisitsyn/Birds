import java.awt.*;

public class Parrot extends Bird {
    private  String name="Кеша";
    private static int num=0;
    public Parrot(){
        System.out.println("Я попугай");
        num++;
        System.out.println("Я попугай № "+num);

        if(x<parrot_minX){parrot_minX=x;}
        if(x>parrot_maxX){parrot_maxX=x;}
        if(y>parrot_maxY){parrot_maxY=y;}
        if(y<parrot_minY){parrot_minY=y;}
    }

    public Parrot(String name){
        this.name=name;
        System.out.println("Я попугай "+name);
        num++;
        System.out.println("Я попугай № "+num);
    }


    public void speak(){
        System.out.println("Мое имя "+name);
    }
    public void setName(String name){
        this.name=name;
    }


    public String getName(){
        return this.name;
    }
    /*
    public void Check(Pinguin a){

        System.out.println("Я не дружу с пингвинами");
    }
    public void Check(Parrot a){

        System.out.println("Привет попугай "+a.getName());
    }

     */


    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.setColor(color);
        g.fillOval(x,y,size,size);
        g.drawRect(parrot_minX,parrot_minY,parrot_maxX-parrot_minX+size,parrot_maxY-parrot_minY+size);
    }

}