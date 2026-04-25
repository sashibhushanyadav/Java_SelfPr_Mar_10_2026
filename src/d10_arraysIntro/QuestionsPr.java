package d10_arraysIntro;

import java.util.Scanner;

public class QuestionsPr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index number: ");
        int indexSize = sc.nextInt(); //user input indexing

        int[] numbers = new int[indexSize];// creating array

        //user input for values of array
        for (int i = 0; i < indexSize; i++) {
            System.out.print("Enter value of index: ");
            numbers[i] = sc.nextInt();
        }

        //user input for matching value
        System.out.print("Enter number x: ");
        int x = sc.nextInt();

        //Condition through all the values of array
        for (int i = 0; i < indexSize; i++) {
            if (numbers[i] == x) {
                System.out.println("Matched the number: " + numbers[i] + " " + "at index: " + i);
            }
        }
    }
}
