import java.util.*;
public class increasingnumberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number ;
        System.out.print("Enter a number of rows : ");
        Number = sc.nextInt();
        for (int row = 1; row <= Number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static class floydtriangle {
    }

    public static class inversenum {
        public static void main(String[] args) {
            int x = 5;
            for(int i=1;i<=x;i++){
                for(int j=1;j<=x-i+1;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }

    public static class invertedhalfpy {
        public static void main(String[] args) {
             int n = 6;
             for(int i=1;i<=n;i++){
                 for(int j = 1; j<=n-i;j++){
                     System.out.print(" ");
                 }
                 //inner loop
                 for(int j=1;j<=i;j++){
                     System.out.print("* ");
                 }
                 System.out.println();
             }
        }
    }
}
