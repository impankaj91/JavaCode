//TODO: Explain An Array 1) take input user and Printing array.2)Find Largest Number.3) sum all element
//Import an Api.
import java.sql.SQLOutput;
import  java.util.Scanner;
public class ArrayTopic {
    public static void main(String args[]) {
        // Create An Object.
        Scanner obj = new Scanner(System.in);
        // Array Syntax: datatype[] variable=new datatype[size];
        int[] score=new int[10];
        for(int i=0;i<score.length;i++)
        {
            score[i]=obj.nextInt(); // take an input from user.
        }
        for(int i=0;i<score.length;i++)
        {
            System.out.print(" "+score[i]+" ");// print result
        }
        System.out.println(" ");
        // Print Largset number In array.
        int largest=score[0];
        for(int i=1;i<score.length;i++)
        {
            largest=score[i];
        }
        System.out.println("Largest No is:"+largest);
        // sum up all element.
        int sum=0;
        for(int i=0;i<score.length;i++)
        {
           sum=sum+score[i];
        }
        System.out.println("Total is="+sum);
    }
}