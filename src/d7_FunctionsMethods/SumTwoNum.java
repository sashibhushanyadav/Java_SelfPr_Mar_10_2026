package d7_FunctionsMethods;

import java.util.Scanner;

public class SumTwoNum {
    public static int sum(int a, int b){
        return a+b;

    }

    public static void sum1(int m, int n){
        System.out.println("Non-return method: "+ (m+n));
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.println("Return method: "+sum(num1,num2));
        sum1(num1, num2);
    }
}
