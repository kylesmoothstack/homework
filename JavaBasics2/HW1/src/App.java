import java.util.Arrays;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        CommandLineAdder cla = new CommandLineAdder(new Vector<String>(Arrays.asList(args)));
        System.out.println(cla.addArgs());
    }
}
