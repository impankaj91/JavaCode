import java.util.Scanner;

public class GuessMobileNo {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First 3 Digit Of Your Phone:");
        long num=input.nextLong();
        System.out.println(operation1(num));
        long x=operation1(num);
        System.out.println("Please Enter Next 3 digit Your Phone Num");
        long y=input.nextLong();
        System.out.println(operation2(x,y));
        long z=operation2(x,y);
        System.out.println("Please Enter Last 4 Digit:");
        long digit=input.nextLong();
        System.out.println(operation3(z,digit));
    }

    private static long operation3(long y, long digit) {
        long ans=y+digit;
        long c=((ans+4)/2)-200;
        return c;
    }

    private static long operation2(long x,long y) {

        long ans=x+y;
        long a=(ans*50)+1;
        long b=a*400;
        return b;
    }

    private static long operation1(long num) {
        long num1=num*40*25;
        return num1;
    }
}
