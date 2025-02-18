public class Pyramid2 {
    public static void main(String[] args) {
        int rows = 10; // Directly setting the number of rows

        for (int i = 1; i <= rows; i++) {
            // Print Various rows "the outer loop"
            for (int j = i; j < rows; j++) {
System.out.println("");
            } // print the spaces between stars properly inner loop
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
