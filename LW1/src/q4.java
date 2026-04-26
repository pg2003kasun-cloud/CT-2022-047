package q4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class q4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(today.format(formatter));
    }
}