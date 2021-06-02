import java.util.Vector;

public class CommandLineAdder {
    CommandLineAdder(Vector<String> args){
        clArgs = args;
    }

    public String addArgs(){
        String out = "";
        
        for(int i=0; i< clArgs.size(); i++){
            out += clArgs.elementAt(i);
        }
        return out;
    }

    private Vector<String> clArgs;
}
