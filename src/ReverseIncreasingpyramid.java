import java.util.*;
class Reverseincreasingpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number ;
        System.out.print("Enter a number of rows : ");
        Number = sc.nextInt();
        for (int row = Number; row >=1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
