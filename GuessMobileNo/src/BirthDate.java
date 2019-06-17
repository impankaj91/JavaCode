import java.util.Scanner;

public class BirthDate {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Hey User i guess Your Birth Date And Month");
        System.out.println("Multiply date With 2 and Enter");
        int x=input.nextInt();
        System.out.println("Now Add 5 with previous");
        int y=x+5;
        System.out.println("Now Multiply With 50 with Previos");
        int z=y*50;
        System.out.println("Now Add Month In digit with Previos:");
        int month=(input.nextInt())+z+5;
        System.out.println("Now Subract with 200 and get it:");
        int ans=month-200;
        System.out.println(ans);

    }
}
