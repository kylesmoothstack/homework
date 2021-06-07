import java.util.Random;

/**
 * Producer class. runs in its own thread
 */
public class Producer extends Thread{
    /**
     * Constructor
     * @param bb buffer which is added into
     */
    Producer(BoundBuffer bb){
        buf = bb;
    }

    /**
     * adds random item to the buffer
     */
    private void produce(int i){
        buf.add(i);
        System.out.println("New Int: " + i);
    }

    /**
     * upon start adds 5 random ints to buffer
     */
    public void run(){
        System.out.println("Producing ints.");
        synchronized (this.buf) {
            for(int i=0; i<5; i++) {
                try {
                    Random rand = new Random();
                    this.produce(rand.nextInt(99));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            buf.notify();
        }

        System.out.println("Ints have been produced.");
    }

    public BoundBuffer buf;
}
