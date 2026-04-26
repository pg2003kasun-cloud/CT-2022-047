package q11;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name (Firs, Middle ,Last): ");
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");
    }
}