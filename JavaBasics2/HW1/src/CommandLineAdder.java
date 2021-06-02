import java.util.Vector;

public class CommandLineAdder {
    CommandLineAdder(Vector<String> args){
        clArgs = args;
        garbage = "";
    }

    public Double addArgs(){
        Double out = 0.0;
        
        for(int i=0; i< clArgs.size(); i++){
            try{
                Double.parseDouble(clArgs.elementAt(i));
                out += Double.parseDouble(clArgs.elementAt(i));;
            }
            catch (NumberFormatException exc){
                garbage += clArgs.elementAt(i) + " "; 
            }
        }
        return out;
    }

    public String displayGarbage(){
        if(garbage.equals(""))
            return "no garbage found.";
        else    
            return "Garbage identified: " + garbage;
    }

    private Vector<String> clArgs;
    private String garbage;
}
