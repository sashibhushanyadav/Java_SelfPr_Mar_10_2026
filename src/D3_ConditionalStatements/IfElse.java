package D3_ConditionalStatements;

import java.util.Scanner;

public class IfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();

        System.out.println("Enter b value: ");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Equals");
        } else if (a>b) {
            System.out.println("a is greater");
        }else {
            System.out.println("a is lesser");
        }
    }
}
