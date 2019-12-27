import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args){
        //Bird a=new Bird();
        // a.fly();
     /*   Parrot b=new Parrot();
       b.fly();
       b.speak();
       Parrot c=new Parrot("Петя");
       c.setName("Жора");
       c.speak();
    System.out.println(c.getName());
    Pinguin kek = new Pinguin();
    kek.fly();
    Bird e=new Parrot();
    e.fly();
    ((Parrot) e).speak();
    b.Check(kek);
    b.Check(c);
    b.speak();
*/
   /*  Parrot m1=new Parrot("Кеша");
     Parrot m2=new Parrot("Чижик");
     m1=m2;
     m2.setName("Пыжик");
     m1.speak();
*/
  /* Bird[] f=new Bird[3];
        f[0]=new Parrot("Кеша");
        f[1]=new Parrot("Чижик");
        f[2]=new Pinguin();
        for(int i=0;i<f.length;i++){
            //((Parrot)f[i]).speak();
            f[i].fly();
        }

*/
      /*  ArrayList<Bird> f=new ArrayList<>();
        f.add(new Parrot("Кеша"));
        f.add(new Parrot("Чижик"));
        f.add(new Pinguin());
        for(int i=0;i<f.size();i++){
            f.get(i).fly();
        }
        */
        Staya f1=new Staya();
        f1.fly();
        MyFrame w=new MyFrame(f1);





    }
}