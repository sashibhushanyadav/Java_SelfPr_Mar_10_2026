package d12_Strings;

public class StringsEx {
    static void main(String[] args) {
        //concatenation
        String fName = "Saw";
        String lName = "C";
        String sameName = "Saw";

        String fullName = fName + " " + lName;
        System.out.println(fullName);

        //length
        System.out.println(fullName.length());

        //charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //compare
        if (fName.compareTo(sameName)==0){
            System.out.println("equal");
        }else {
            System.out.println("Not equal");
        }
        //equals
        if (fName.equals(sameName)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

        //substring
        System.out.println(fName.substring(1,fName.length()));
    }
}
