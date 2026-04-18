package D4_Loops;

import java.util.Scanner;

public class ForLoop {
    static void main(String[] args) {
        // i++ => i = i+1
        for(int i = 1; i <=5; i++){
            System.out.println(i + ". Hello");
        }

        //Write the sum of the n natural number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        //Print the table of a number input by the user
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println((num+" * "+i) +" = "+(num*i));
        }
    }
}
