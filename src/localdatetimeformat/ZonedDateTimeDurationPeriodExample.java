package localdatetimeformat;

import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.of(2024, 1, 1, 9, 0,0,0, ZoneId.of("America/Chicago"));
        System.out.println(zdt1);

        LocalTime lt1 = LocalTime.of(9,0);
        LocalTime lt2 = LocalTime.of(18,0);
        Duration d = Duration.between(lt1, lt2);
        System.out.println(d);

        LocalDate ld1 = LocalDate.of(2023,1,1);
        LocalDate ld2 = LocalDate.of(2023, 12, 31);
        Period d2 = Period.between(ld1, ld2);
        System.out.println(d2);
    }
}
