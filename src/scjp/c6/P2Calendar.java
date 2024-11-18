package scjp.c6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate; // without hour, minute, second, millisecond
import java.time.LocalDateTime; // with    hour, minute, second, millisecond
import java.time.LocalTime; // without date
import java.time.Period; // period of time: years, months and days
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// inmutable
public class P2Calendar {

  public static void main(String[] args) {
    Calendar c = new GregorianCalendar();

    System.out.println(c.get(Calendar.DAY_OF_WEEK));
    // DAY_OF_WEEK is 1-based, SUNDAY is 1 AND SATURDAY is 7 default
    // DAY_OF_WEEK is 0-based, SUNDAY is 0 AND SATURDAY is 6

    // we never used the keyword new in the code
    LocalDate ld1 = LocalDate.of(2_015, 1, 15);
    LocalDate ld2 = LocalDate.parse("2015-01-15");

    LocalDate ld = LocalDate.now(); // 2024-11-15
    LocalDateTime ldt = LocalDateTime.now(); // 2024-11-15T21:31:46.853
    LocalTime lt = LocalTime.now(); // 21:31:46.853

    Period p = Period.of(1, 2, 3); // 1 year, 2 months, 3 days P1Y2M3D
    // p = Period.of(0, 0, 0);  // P0D
    System.out.println(ld.getDayOfWeek()); // name of the day
    System.out.println(ld.getDayOfWeek().getValue()); // [1..7] Monday to Sunday
    Period p2 = Period.ofMonths(1); // P1M

    System.out.println(ld.plus(p)); // 2026-01-18 inmutable
    System.out.println(ld); // 2024-11-15


    // LocalDateTime d1 = new LocalDateTime(); // won’t compile
    LocalDateTime d1 = LocalDateTime.now(); // will compile

    Period p1 = Period.between(ld2, LocalDate.now());           // (menor, mayor)
    System.out.println(p1); // P9Y11M0D
    System.out.println(p1.getYears()); // 9

    //DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
    DateTimeFormatter DTF = DateTimeFormatter.ofPattern("E MMM dd, yyyy");

    System.out.println(ld.format(DTF)); // 16/nov/2024
    System.out.println(ld.until(LocalDate.of(2025, 1, 1),ChronoUnit.DAYS)); // 47
    
    

  }

}
