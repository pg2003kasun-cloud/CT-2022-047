package q6;
import javax.swing.JFrame;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input width (W) and height (H)
        System.out.print("Enter frame width (W): ");
        int w = scanner.nextInt();

        System.out.print("Enter frame height (H): ");
        int h = scanner.nextInt();

        // Consume the leftover newline character
        scanner.nextLine();

        // Input frame title
        System.out.print("Enter the frame title: ");
        String title = scanner.nextLine();

        // Create and display the frame
        JFrame frame = new JFrame();
        frame.setSize(w, h);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}