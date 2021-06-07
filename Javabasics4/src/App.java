public class App {
    public static void main(String[] args){
        // test assignment 1
        System.out.println("Assignment 1: Singleton");
        // creates singleton object
        Singleton sing1 = Singleton.obtainSingleton();
        System.out.println("Singleton object 1 id: "+ sing1.getId());
        // creates second object
        Singleton sing2 = Singleton.obtainSingleton();
        System.out.println("Singleton object 1 id: "+sing2.getId());
        System.out.println("Singleton object 1 equals Singleton object 2: " + (sing1 == sing2));

        // test assignment 2: uncomment indicated lines
        System.out.println("Assignment 2: Deadlocked threads");
        final int[] up = {0};
        final int[] down = {10};
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1 start");
                try{
                    synchronized (up){
                        up[0] +=1;
                        Thread.sleep(100);
                        synchronized (down){
                            down[0] -=1;
                        }

                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r2 start");
                try{
                    synchronized (down){
                        down[0] -=1;
                        Thread.sleep(100);
                        synchronized (up){
                            up[0] +=1;
                        }

                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        // Test assignment 3
        System.out.println("Assignment 3: Producer/Consumer threads");
        // creates buffer, then producer and consumer, which are each given buffer as a parameter.
        BoundBuffer bb = new BoundBuffer();
        Producer p = new Producer(bb);
        Consumer c = new Consumer(p);
        c.start();
        p.start();

    }
}
