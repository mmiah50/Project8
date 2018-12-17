package singleton;
import java.util.ArrayList;
public class Singleton {

   private static Singleton singleton = new Singleton();

    private Singleton(){ }

    public static Singleton getInstance(){
        System.out.println("Singleton is being called");
        return singleton;
    }
    public void display(){
        System.out.println("I am on singleton class");
    }
}
