import java.util.Random;

public class Singleton {
    public static Singleton obtainSingleton(){
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private Singleton(){
        Random rand = new Random();
        id = rand.nextInt(100);
    }

    public int getId() {
        return id;
    }

    private int id = -1;
    private static Singleton singleton = null;
}
