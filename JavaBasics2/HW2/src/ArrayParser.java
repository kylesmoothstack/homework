public class ArrayParser {
    /**
     * array parser constructor
     */
    public ArrayParser(Integer[][] arrArg){
        arr = arrArg;
    }

    /**
     * finds and returns largest number
     */
    public String findMaxNum(){
        Integer max = 0;
        int x=0; 
        int y=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if (arr[i][j] > max){
                    x = i;
                    y = j;
                    max = arr[i][j];
                }
            }
        }
        return "Max number " + max + " found at row " + x + " and column " + y +".";
    }

    public Integer[][] arr;
}
