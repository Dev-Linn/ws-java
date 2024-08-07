import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-20T01:30:26");

        Instant d06 = Instant.parse("2022-08-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-08-20T01:30:26-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022" , fmt1);

        System.out.println("d01" +d01.toString());
        System.out.println("d02" +d02.toString());
        System.out.println("d03" +d03.toString());
        System.out.println("d04" +d04.toString());
        System.out.println("d05" +d05.toString());
        System.out.println("d06" +d06.toString());
        System.out.println("d07" +d07.toString());
        System.out.println("d08" +d08.toString());
        System.out.println("a");
        }
    }
