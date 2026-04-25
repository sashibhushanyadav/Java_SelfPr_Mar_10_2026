package d11_2D_Arrays;

import java.util.Scanner;

public class TwoD_ArrayEx {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter no. of cols: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // for user input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the value of row " + i + " & column " + j + ": ");
                numbers[i][j] = sc.nextInt();
            }
        }

        //for output of user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
