import java.io.*;

/**
 * reads an existing file. can count how many of a specified character are in the file. 
 */
public class CharCounter {
    /**
     * Stores file 
     * @param filename name of file to be opened
     */
    CharCounter(String filename, char ch){
        this.filename = filename;
        // not case sensitive
        c = Character.toLowerCase(ch);
        
    }

    /**
     * setter
     */
    public void setFile(String filename){
        File file = new File(filename);
        if(!file.exists()){
            System.out.println("File does not exist. Provide existing filename please. ");
            file = null;
        }
    }

    /**
     * determines amount of characters in file.
     * @throws FileNotFoundException
     */
    public String countChars() {
        
        File file = new File(filename);
        // if file does not exist, send error message
        String out = "";
        
        
            // attempt to read file
            try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            // read lines one at a time. adds to count. 
            int count=0;
            String line;
            while ((line=br.readLine()) != null){
                
                
                
                for (char ch : line.toLowerCase().toCharArray()){
                    if(ch == c)
                        count+=1; 
                }
                
            }
            

            out = "The character "+c+" occurs "+ count +" times.";
            // if fails, send error message
        }
        catch(IOException e){
            out = "error reading";
        }
        
        return out;

    }

    private String filename;
    private char c;
}
