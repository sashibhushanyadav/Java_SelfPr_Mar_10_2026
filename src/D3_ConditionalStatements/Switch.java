package D3_ConditionalStatements;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a button Number: ");
        int button = sc.nextInt();

        //Traditional Switch
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hola");
                break;
            default:
                System.out.println("Invalid button");
        }

        //Arrow switch (Java 14+)
        switch (button){
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Hola");
            default -> System.out.println("Invalid button");
        }

        //Switch Expression
        String greeting = switch (button){
            case 1 -> "Hello";
            case 2 -> "Namaste";
            case 3 -> "Hola";
            default -> "Invalid button";
        };
        System.out.println(greeting);
    }
}
