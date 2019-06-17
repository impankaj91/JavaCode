import java.util.Scanner;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter the First Number:");
        double a=input.nextInt();
        System.out.println("Enter the Second Number:");
        double b=input.nextInt();
        // create an object use
        arithmeticExpression user=new arithmeticExpression(a,b);
        user.addition();
        user.subtraction();
        user.multiplication();
        user.division();
    }
}
