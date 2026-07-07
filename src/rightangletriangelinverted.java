public class rightangletriangelinverted {
    public static void main(String[] args) {
        int value  = 5;
        for (int row  = value; row>=1; row--){
            for (int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
