import java.util.Scanner;

public class sample2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array with user-specified dimensions
        int[][] twoDArray = new int[rows][columns];

        System.out.println("Enter the elements for the 2D array:");

        // Input elements into the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        // Print the 2D array
        System.out.println("2D Array Elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}

