package d7_FunctionsMethods;

import java.util.Scanner;

public class MultiplicationOf2Num {
    public static int multiply(int a, int b){
        return a*b;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num a: ");
        int x = sc.nextInt();
        System.out.print("Enter num b: ");
        int y = sc.nextInt();

        int multiplication = multiply(x, y);
        System.out.println("Multiplication: "+multiplication);
    }
}
