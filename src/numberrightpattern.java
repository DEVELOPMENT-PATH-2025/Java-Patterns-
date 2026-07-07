import java.util.*;
public class numberrightpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number;
        System.out.println("Enter the number of rows : ");
        Number = sc.nextInt();
        for(int row = 1; row <= Number; row++){
            for (int col = 1; col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
        sc.close();
    }
}
