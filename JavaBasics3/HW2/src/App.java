public class App {
    /**
     * main function
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FileAppend fa = new FileAppend("stuff.txt");
        fa.appendText("This is my list of stuff. \n");
        fa.appendText("#1 apples \n");
        fa.appendText("#2 Sandwiches \n");
    }
}
