import java.util.Scanner;
public class Avrage {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("How Many Number Want To Add:");
        int n=obj.nextInt();
        int[] avg=new int[n];
        int sum=0;
        System.out.println("Enter The Number");
        for(int i=0;i<avg.length;i++)
        {
            avg[i]=obj.nextInt();
        }
       for(int i=0;i<avg.length;i++)
       {
           sum=sum+avg[i];

       }
       int avrage=sum/n;
        System.out.println("Avrage="+avrage);
    }
}
