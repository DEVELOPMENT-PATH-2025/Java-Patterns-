public class patternsquare {
    public static void main(String[] args) {
        int number = 14;
        for (int row = 1; row<=number;row++){
            for (int column = 1;column<=number;column++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
