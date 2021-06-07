import java.util.ArrayList;
import java.util.List;

/**
 * Bound Buffer class. adds items to one end, removed from the opposite end. FIFO.
 */
public class BoundBuffer {
    /**
     * Constructor, instantiates new list
     */
    BoundBuffer(){
        ints = new ArrayList<>();
    }

    /**
     * adds to buffer.
     * @param i int to be added
     */
    public void add(int i){
        ints.add(0, i);
    }

    /**
     * fetches item from back of buffer and removes it
     * @return int from buffer
     */
    public int remove(){
        int i;
        if(!this.isEmpty()) {
            i = ints.get(ints.size() - 1);
            ints.remove(ints.size() - 1);
        }
        else {
            System.out.println("Error: buffer empty");
            i = -1;
        }
        return i;
    }

    /**
     * checks if buffer is empty
     * @return bool
     */
    public boolean isEmpty(){
        if(ints.size() == 0)
            return true;
        else
            return false;
    }

    private List<Integer> ints;
}
