import java.util.Scanner;
public class MatrixOperation {
    public static void main(String args[]) {
        // TODO: Part 1 take input and set size...
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size Of Row:");
        int row = in.nextInt();
        System.out.println("Enter Size Of Column:");
        int col = in.nextInt();
        System.out.println("Row Size is " + row);
        System.out.println("Column Size is " + col);
        // TODO:---------------------------------------------------------
        // TODO: Part 2 Declare an array and print Matrix...
        int[][] mat = new int[row][col];
        System.out.println("Enter The Number In Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("  "+mat[i][j]+" ");
            }
            System.out.println(" ");
        }
        // TODO:Part2 End....

    }
}

