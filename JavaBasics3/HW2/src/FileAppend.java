import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
/**
 * Class to append text to a file.
 */
public class FileAppend {

    /**
     * Parameterized constructor
     * @param filename path/name of file to be appended to. 
     */
    FileAppend(String filename){
        file = new File(filename);
    }

    /**
     * appends text to file 
     * @param text text to be appended
     */
    public void appendText(String text){
        FileWriter fw = null;

        // file must exist. if not, return.
        if(!file.exists()){
            System.out.println("File does not exist.");
            return;
        }

        // attempt to write text to file. Print result. 
        try{
            fw = new FileWriter(file, true);
            fw.write(text);
            fw.close();
            System.out.println("Sucessfully wrote text to file!");
        }
        catch (IOException e){
            System.out.println("Error - unable to write to file.");
        }
    }

    private File file;
}
