public class App {
    /**
     * main function
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        DirectoryParser dp = new DirectoryParser(".");
        dp.getContents();
        dp.displayAllContents();
    }
}
