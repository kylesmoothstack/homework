import java.util.Random;

/**
 * singleton class
 */
public class Singleton {
    /**
     * obtains singleton object if exists, if not then constructs one first
     * @return singleton class
     */
    public static Singleton obtainSingleton(){
        // first lock
        if (singleton == null) {
            synchronized (Singleton.class) {
                // synchronize, then second lock
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * private constructor
     */
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
