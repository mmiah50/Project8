package singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.display();
    }
}
