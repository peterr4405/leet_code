package leetcode;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class leet_1185 {

    public static String dayOfTheWeek(int day, int month, int year) {

        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        
        
        switch (dayOfWeek) {
            case SUNDAY:
                return "Sunday";
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            default:
                return "error";

        }

    }

    public static void main(String[] args) {
       int day = 31, month = 8, year = 2019;
       String s = dayOfTheWeek(day,month,year);
        System.out.println(s);
    }

}
