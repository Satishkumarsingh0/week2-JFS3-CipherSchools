import java.util.Scanner;
import java.util.Random;
public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int computerChoice = rnd.nextInt(20);
        System.out.println("Computer Choice :" +computerChoice);
        //Guess the Number
        for(int i = 1; i<=6; i++){
        System.out.println("Guess a Number between 0 and 20");
        int userChoice = sc.nextInt();
        if(userChoice>computerChoice){
            System.out.println("Your guess is TOO HIGH");
        } else if(userChoice < computerChoice){
            System.out.println("Your guess is TOO LOW");
        } else{
            System.out.println("Gotcha! You Guessed it Right!!");
            break;
        }
        }
    }
}
