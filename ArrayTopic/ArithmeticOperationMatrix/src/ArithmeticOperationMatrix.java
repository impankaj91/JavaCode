import java.util.Scanner;
public class ArithmeticOperationMatrix {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Row Value:");
        int row=obj.nextInt();
        System.out.println("Enter Column Value:");
        int col=obj.nextInt();
        // declare a three 3D array
        int [][] a=new int[row][col];
        int [][] b=new int[row][col];
        int [][] c=new int[row][col];
        System.out.println("Enter the first matrix values:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Enter the Second Matrix Value:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                b[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(" "+b[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Addition of Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
             c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(" "+c[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Subtraction of Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(" "+c[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Multiplication of Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                c[i][j]=a[i][j]*b[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(" "+c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
