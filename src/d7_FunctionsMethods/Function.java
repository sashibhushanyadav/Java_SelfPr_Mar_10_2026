package d7_FunctionsMethods;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class Function {
    public static void printMyName(String name){
        System.out.println(name);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();

        printMyName(name1);
    }
}
