package localdatetimeformat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter pat = DateTimeFormatter.ofPattern("MMMM d yyyy");
        String ld = ldt.format(pat);
        System.out.println(ld);
    }
}
