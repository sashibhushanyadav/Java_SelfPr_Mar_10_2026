package d10_arraysIntro;

import java.util.Scanner;

public class ArrayEx {
    static void main(String[] args) {
        //First way to defining an array
        int[] nums = {3, 4, 2, 5, 6};
        System.out.println(nums[3]);

        //In case of print all the values
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //Second way to defining an array
        String[] names = new String[3];
        names[0] = "Sashi";
        names[1] = "Bhushan";
        names[2] = "Yadav";
        System.out.println(names[0]);

        //By taking both index size and value for each indexes from the user Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of index: ");
        int size = sc.nextInt(); // user input for index

        int[] numbers = new int[size]; // array created

        //input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value based on index: ");
            numbers[i] = sc.nextInt(); // user input for values
        }

        //Output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
