public class App {
    public static void main(String[] args) throws Exception {
        if (args.length != 1){
            System.out.println("incorrect format. Provide one character to be searched.");
            System.exit(1);
        }
        if(args[0].length() != 1){
            System.out.println("Please provide single character to search.");
            System.exit(1);
        }

        CharCounter cc = new CharCounter("stuff.txt", args[0].charAt(0));
        System.out.println(cc.countChars());
    }
}
