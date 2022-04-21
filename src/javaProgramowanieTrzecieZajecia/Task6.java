package javaProgramowanieTrzecieZajecia;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Task6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date  [in format [yyyy-MM-dd HH:mm:ss]: 1900-01-01 09:00:00");
        String data = scanner.nextLine();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(data, formater);
        //System.out.println(dateTime);
        LocalDate nowDate = LocalDate.now();
        Duration duration = Duration.between(dateTime,nowDate);
        long days = duration.toDaysPart();
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int sec = duration.toSecondsPart();
        System.out.println(days);
        //System.out.println("You have " + duration + " days to the next lesson.");







    }




}
