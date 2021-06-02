import java.util.Random;

public class App {
    /**
     * main class.
     */
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        Integer[][] array1 = new Integer[rand.nextInt(10)][rand.nextInt(10)];
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[0].length; j++){
                array1[i][j] = rand.nextInt(100);
            }
        }
        ArrayParser ap = new ArrayParser(array1);
        String out = ap.findMaxNum();
        System.out.println(out);
    }
}
