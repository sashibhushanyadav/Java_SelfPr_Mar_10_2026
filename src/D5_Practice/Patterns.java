package D5_Practice;

public class Patterns {
    static void main(String[] args) {
        // just create rectangle
        // outer loop
        for (int i = 1; i<=4; i++){
            // inner loop
            for (int j=1; j<=5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // hallow rectangle
        int n = 4;
        int m = 5;

        //outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                //conditional st
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print(" * ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
