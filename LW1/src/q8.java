package q8;
import java.util.Scanner;

public class q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string that contains a single exclamation mark: ");
        String input = scanner.nextLine();

        // Find the index of the exclamation mark
        int index = input.indexOf("!");

        if (index != -1) {
            String before = input.substring(0, index);
            // Substring after '!'
            String after = input.substring(index + 1);

            System.out.println(before.trim());
            System.out.println(after.trim());
        } else {
            System.out.println("No exclamation mark founded.");
        }
    }
}