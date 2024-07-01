import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class proj {
    public static void main(String[] args) {
        System.out.println("Local time:");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        int hour = now.getHour();
        System.out.printf("Hour is: %d\n", hour);
        int ms = now.getNano();
        System.out.println(ms);

//        Dates tryout

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate someDate = LocalDate.of(2024, 6, 18);
        System.out.println(someDate);
        LocalDate delivery = LocalDate.now().plusDays(14);
        System.out.println(delivery);
        System.out.println("10 days earlier: " + date.minusDays(10));
        System.out.printf("Year: %d\n Month: %s\n Day: %d", date.getYear(), date.getMonth(), date.getDayOfMonth());

//        Local date and time

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
        System.out.println(dateTimeNow.getDayOfWeek());
        System.out.println("\n\nDateTimeFormatter");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy@HH:mm:ss");
        System.out.printf("Unformatted date and time: %s", dateTimeNow);
        System.out.printf("\n\n***Formatted Date***\n%s", dateTimeNow.format(format));

    }
}
