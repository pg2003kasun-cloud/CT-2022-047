package q9;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Output the number of characters
        System.out.println(input.length());

        // Output the first character
        System.out.println(input.charAt(0));

        // Output the last character
        System.out.println(input.charAt(input.length() - 1));
    }
}