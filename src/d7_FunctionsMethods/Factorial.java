package d7_FunctionsMethods;

import java.util.Scanner;

public class Factorial {
    public static void factorialNum(int a){
        int factorial = 1;
        for (int i = a; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of n: ");
        int n = sc.nextInt();
        factorialNum(n);
    }
}
