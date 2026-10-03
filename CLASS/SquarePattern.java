public class SquarePattern {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {          // outer loop → rows
            for (int j = 1; j <= rows; j++) {      // inner loop → columns
                System.out.print("* ");
            }
            System.out.println();                  // move to next line
        }
    }
}