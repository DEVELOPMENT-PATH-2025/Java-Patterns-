import java.util.*;
public class incrementalpatternnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter limit (e.g. 21): ");
        int max = scanner.nextInt();

        int rowLength = 1;
        int countInRow = 0;

        // One loop to print all numbers
        for (int i = 1; i <= max; i++) {
            System.out.print(i + " ");
            countInRow++;

            // If the row is full, jump to the next line
            if (countInRow == rowLength) {
                System.out.println();
                rowLength++;      // Next row gets one more number
                countInRow = 0;   // Reset counter for the new row
            }
        }

        scanner.close();
    }
}
