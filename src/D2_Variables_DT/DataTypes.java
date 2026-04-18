package D2_Variables_DT;

import java.util.Arrays;

public class DataTypes {
    static void main(String[] args) {
        //Primitive
        byte countStd = 23; // range : -128 to 127, 8 bits
        System.out.println(countStd);
        short age = 130; // +-32K
        System.out.println(age);
        int number = 2300; // 2 trillion
        System.out.println(number);
        long largeNumber = 23000000000000L; // 90k trillion
        System.out.println(largeNumber);
        float deciNum = 41.234f;
        System.out.println(deciNum);
        double deciNumDub = 23.97982374982374;
        System.out.println(deciNumDub);
        char characterDef = 'A'; // single character
        System.out.println(characterDef);
        boolean isValid = true;
        System.out.println(isValid);

        // Non-Primitive
        // String
        String name = "Dhwanith";
        System.out.println(name);

        //Array
        String[] names = {"Sashi", "Bhushan", "yadav"};
        System.out.println(names[2]);
        System.out.println(Arrays.toString(names)); // In case of printing the entire values of Array

        int[] wholeNum = {0, 1, 2, 3, 4};
        System.out.println(wholeNum[3]);
        System.out.println(Arrays.toString(wholeNum));

        //Class
        class Std_details{
            String name;
            int age;
        }

        Std_details s1 = new Std_details();
        s1.name = "ram";
        s1.age = 19;
        System.out.println(s1.age);

        //Object
        class car {
            String brand = "hennessye";
        }

        car c1 = new car();
        System.out.println(c1.brand);

        //Interface
    }
}
