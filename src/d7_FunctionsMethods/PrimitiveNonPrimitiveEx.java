package d7_FunctionsMethods;

import java.util.Scanner;

public class PrimitiveNonPrimitiveEx {
    public static void markWithName(String name, int mark){
        System.out.println("Name: "+name+"," + " Marks: "+mark);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the name of a student: ");
        String nameOfStudent = sc.nextLine();

        System.out.print("Write the mark of a student: ");
        int markOfStudent = sc.nextInt();

        markWithName(nameOfStudent, markOfStudent);
    }
}
