public class Hollow_rectangle_STAR {
    public static void main(String[] args) {

        int rows = 4;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print '*' for the first and last row, or first and last column
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }

    }
    
}
