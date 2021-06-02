import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Guess a number game (0-100). ");
        int rand = (int)Math.floor((Math.random() *100)+1);
        System.out.println(rand);
        System.out.println("Random number has been chosen. Please enter guess.");
        boolean correct = false;
        for(int i=0; i<5; i++){
            if( i > 0)
                System.out.println("Guess again.");
            Scanner scan = new Scanner(System.in);
            String guess = scan.nextLine();
            if(Integer.parseInt(guess) - rand < 10 && Integer.parseInt(guess) - rand > -10){
                System.out.println("Close Enough. Correct answer is " + rand + ". Goodbye.");
                correct = true;
                break;
            }
            else{
                System.out.println("Not even close.");
            }

        }
        if(!correct)
            System.out.println("Sorry. correct answer is " + rand + ".");
    }
}
