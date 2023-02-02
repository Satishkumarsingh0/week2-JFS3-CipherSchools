/*Assuming You are Riding a Bike and Police Officer Stops You
 * Police Officer Asking You to provide 2 details
 * Your Current speed
 * if it is your birthday today?
 * 
 * The police officer will calculate based on following parameters
 * 
 * if it is your birthday you will be waived off (exempted) with 
 * 5 miles/hour
 * 
 * if it is not your birthday no excemption will be given
 * 
 * if your speed is greater than 80 Ticket raised will be 'High Ticket'
 * if your speed is betwee 60 and 80 Ticket raised will be 'Mid Ticket'
 * if your speed is below 60 Ticket raised will be no ticket.
 * 
 * Find Ticket
 */

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your speed: ");
        int speed = sc.nextInt();
        
        System.out.print("Is your Birth Day Today: ");
        boolean isBirthday = sc.nextBoolean();

        if(isBirthday==true) speed -=5;

        if(speed>80) System.out.println("High Ticket");
        else if(speed>=60) System.out.println("Mid Ticket");
        if(speed<60) System.out.println("No Ticket");
        sc.close();
    }
}
