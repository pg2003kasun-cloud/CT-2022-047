package q7;
import javax.swing.JFrame;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class q7 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setTitle(now.format(formatter));
        frame.setVisible(true);
    }
}