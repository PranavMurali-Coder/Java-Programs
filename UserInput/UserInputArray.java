import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        // Loop to input elements into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Print the array
        System.out.println("Array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
