package q10;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.next();

        int middleIndex = word.length() / 2;
        System.out.println(word.charAt(middleIndex));
    }
}