package d11_2D_Arrays;

import java.util.Scanner;

public class QuestionPr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter no. of cols: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //input from the user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the value of row " + i + " & column " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a value of x: ");
        int x = sc.nextInt();

        //finding the outputs
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("The value " + matrix[i][j] + " is found at indices: " + i + "," + j);
                }
            }
        }
    }
}
