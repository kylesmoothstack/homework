import java.io.File;
import java.util.Vector;

public class DirectoryParser {
    DirectoryParser(String rootPath){
        root = new File(rootPath);
        allContents = new Vector<String>();
    }

    /**
     * gets contents of all directories and subdirectories
     */
    public void getContents(){
        // clears allContents before adding
        allContents.clear();
        getContentsRecursive(root);
    }

    /**
     * recursive helper function
     * @param directory gathers contents of this directory and recursively calls function on all directory items
     */
    private void getContentsRecursive(File directory){
        String[] contents = directory.list();
        for(int i=0; i<contents.length; i++){
            // if directory, get contents
            File file = new File(directory+"/"+contents[i]);
            if(file.isDirectory()){
                getContentsRecursive(file);
            }

            // put file/directory in allContents
            allContents.add(contents[i]);
        }
    }

    /**
     * displays contents after list has been retrieved
     */
    public void displayAllContents(){
        if(allContents.size() == 0)
            System.out.println("Theres nothing here! Try retrieving contents. If that doesnt work, this directory is empty.");
        else{
            for(String content : allContents){
                System.out.println(content);
            }
        }
    }

    private File root;
    private Vector<String> allContents;
}
