public class PrintLines {
    public void printOne(){
        System.out.println("1)");
        String out = "*";
        for(int i=0; i<4; i++){
            System.out.println(out);
            out += "*";
        }
        System.out.println(".........");
    }

    public void printTwo(){
        System.out.println("2)");
        System.out.println("..........");
        String out = "****";
        for(int i=0; i<4; i++){
            System.out.println(out);
            out = out.substring(0,out.length()-1);
        }
    }

    public void printThree(){
        System.out.println("3)");
        String out = "     *";
        for(int i=0; i<4; i++){
            System.out.println(out);
            out = out.substring(1,out.length());
            out += "**";
        }
        System.out.println("...........");
    }

    public void printFour(){
        System.out.println("4)");
        System.out.println("............");
        String out = "  *******";
        for(int i=0; i<4; i++){
            System.out.println(out);
            out = out.substring(0,out.length()-2);
            out = " " + out; 
        }
    }
}
