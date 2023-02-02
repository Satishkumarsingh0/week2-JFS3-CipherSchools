/*       Title: How long is Your BURRRP
        Ask the user to enter an INteger (burp length)
        Depending on the user input provided "Burp" will be produced
        For Example:
        5 : "Burrrrrp"
        25: Burrrrrrrrrrrrrrrrrrrrrrrrrp"
        INput can be any random number
*/
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is your Burp");
        int burpLength = sc.nextInt();

        String msg="";
        for(int i = 1; i<= burpLength; i++){
            msg+= "r";
        }
        System.out.println("Bu"+msg+"p");
        sc.close();
    }
}
