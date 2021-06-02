public class App {
    public static void main(String[] args) throws Exception {
        Double[][] array1 = {{0.0,0.0},{1.0,0.0}};
        ArrayParser ap = new ArrayParser(array1);
        String out = ap.findMaxNum();
        System.out.println(out);
    }
}
