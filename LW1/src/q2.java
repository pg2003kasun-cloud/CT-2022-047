package q1;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class q2{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Frist Name:");
        String first=scanner.next();
        System.out.println("Enter last Name:");
        String last = scanner.next();


        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setTitle(first+""+last);
        frame.setVisible(true);

    }
}