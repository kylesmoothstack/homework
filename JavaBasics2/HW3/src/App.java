public class App {
    /**
     * main class. creates sammple shapes and displays functionality. 
     */
    public static void main(String[] args) throws Exception {
        Rectangle rec = new Rectangle(3.0, 1.5);
        Circle circ = new Circle(2.0);
        Triangle tri = new Triangle(1.5, 4.0);
        // calculate area
        rec.calculateArea();
        tri.calculateArea();
        // display area
        System.out.println(rec.display());
        System.out.println(tri.display());
        System.out.println(circ.display());
        // oops
        circ.calculateArea();
        System.out.println(circ.display());
    }
}
