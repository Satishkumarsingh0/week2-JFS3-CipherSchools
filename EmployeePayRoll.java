/* # Employee PayRoll
 Ask the User to Enter his BasicPay (Salary)
 If the BasicPay is greater or equal to 5000 then
     his
          HRA will be 10% of BasicPay
          Da will be 20 % of BasicPay
 If the BasicPay is lesser than 5000
 Then his
          HRA will be 20% of sicPay
          DA will be 30% of B
                              ayF
 Find the Gross Pay.
*/
import java.util.Scanner;
public class EmployeePayRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your BasicPay: ");
        int BasicPay = sc.nextInt();
        int HRA = 0;
        int DA = 0;
        if(BasicPay >= 5000){ 
            HRA = (BasicPay * 10) / 100;
            DA = (BasicPay * 20 ) / 100;
        } else if(BasicPay < 5000){
            HRA = (BasicPay * 20) / 100;
            DA = (BasicPay * 30 ) / 100;
        }
        int GrossPay = BasicPay + HRA + DA;
        System.out.println("The HRA is: " + HRA);
        System.out.println("The DA is: " + DA);
        System.out.println("The Gross Pay is: " + GrossPay);
        sc.close();
    }
}
