import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dd = LocalDate.parse("05/05/2025", formatter);
        Ticket testTicket = new Ticket("Show", dd,4, 4, "test", 100, true, 9);
        System.out.println(testTicket);
    }
}
