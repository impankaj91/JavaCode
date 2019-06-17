//TODO: step1=>use this api for user input.
import java.util.Scanner;
public class AddTwoNumUser {
    public static void main(String[] args)
    {
        //TODO: Step2=> Create The Object Of a Scanner Class.
        Scanner obj=new Scanner(System.in);

        // TODO: step3=> Declare a Variable
        int a;
        int b;

        // TODO: step4=> Using Object Take User.

        System.out.println("Value of A:");
        a=obj.nextInt();

        System.out.println("Value of B:");
        b=obj.nextInt();

        System.out.println("Result"+(a+b));
    }



}
