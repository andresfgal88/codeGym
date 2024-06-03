package Lesson26DateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class claseDate {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println(date);
        Date date1 = new Date(124,10,31);
        System.out.println(date1);
        Date date2 = new Date(124,10,31,16,30,00);
        System.out.println(date2);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getDate());
        System.out.println(date1.getDay());
        System.out.println(date2.getHours());

       date1.setYear(123);
        System.out.println(date1);
        //comparar fecha
        if (date1.before(date2)){
            System.out.println(date1);
        } else {
            System.out.println(date2);
        }

        SimpleDateFormat formatter = new SimpleDateFormat("MMM-dd-YYYY");
        String message = formatter.format(date1);
        System.out.println(message);

        LocalDate today = LocalDate.now();
        System.out.println("Today = " + today);

        //fecha en zona especifica
        ZoneId  timezone = ZoneId.of("Asia/Shanghai");
        LocalDate today1 = LocalDate.now(timezone);
        System.out.println("In Shanghai, now = " + today);

        // fecha y hora en zona especifica
        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime time = ZonedDateTime.now(zone);
        System.out.println(time);
        // fecha y hora de donde me encuentro
        ZonedDateTime time1 = ZonedDateTime.now();
        System.out.println(time1);
        //cambiar el formato de la fecha
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yy");
        String text = dtf.format( LocalDateTime.now() );
        System.out.println(text);

    }
}
