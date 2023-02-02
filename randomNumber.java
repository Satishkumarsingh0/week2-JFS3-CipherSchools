// package CipherSchoolWeeklyAssignment.Week1;
/*
Objective: Generate Random Number
Package:  - java.util
Class:    - Random
Method:   - nextInt(limit) 
 */
import java.util.Random;
public class randomNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        int computerChoice = rnd.nextInt(20);
        System.out.println("Computer Choice :"+computerChoice);
    }
}
