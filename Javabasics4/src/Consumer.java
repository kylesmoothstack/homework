/**
 * Consumer class, extends thread in order to run in its own thread
 */
public class Consumer extends Thread{
    /**
     * Constructor
     * @param p corresponding producer. consumes from this producers buffer
     */
    Consumer(Producer p){
        this.p = p;
    }

    /**
     * consume method. consumes int from producers buffer
     */
    public void consume(){
        int i = p.buf.remove();
        System.out.println("consuming int: " + i);
    }

    /**
     * actions upon activation of thread. expects to consume 5 ints.
     */
    public void run(){
        System.out.println("Consuming ints.");
        synchronized (p.buf) {
            try {
                p.buf.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 5; i++) {
                    this.consume();
            }
            System.out.println("Ints have been consumed.");
        }
    }

    private Producer p;
}
