import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        // Part 1: lambdas streams functional interfaces
        // a
        String[] words = {"One", "Two", "Three", "Four", "Seven"};
        Arrays.sort(words,
                (String s1, String s2) -> { return s1.length() - s2.length(); });

        for ( String s: words) {
            System.out.println(s);
        }
        System.out.println();

        // b
        Arrays.sort(words,
                (String s1, String s2) -> { return s2.length() - s1.length(); });
        for ( String s: words) {
            System.out.println(s);
        }
        System.out.println();

        // c
        Arrays.sort(words,
                (String s1, String s2) -> { return s1.charAt(0) - s2.charAt(0); });
        for ( String s: words) {
            System.out.println(s);
        }
        System.out.println();

        // d
        Arrays.sort(words);
        Arrays.sort(words,
                (String s1, String s2) -> {
            if(s1.contains("e"))
                return 1;
            else
                return -1;});
        for ( String s: words) {
            System.out.println(s);
        }
        System.out.println();

        // 2
        List<Integer> ints = Arrays.asList(12,43,56,1,88);
        String out = "";
        for (int i: ints) {
            if(i%2==0)
                out+="o";
            else
                out+="e";
            out+=String.valueOf(i);
            out +=",";
        }
        out = out.substring(0,out.length()-1);

        System.out.println(out);
        System.out.println();


        // 3
        List<String> wordlist = Arrays.asList("kyle", "smoothstack", "learning", "lambdas");
        List<String> awords = wordlist.stream().map((s1)-> "a" + s1.charAt(0) +s1.charAt(1)).collect(Collectors.toList());
        awords.forEach((word)->System.out.println(word));
        System.out.println();

        // part 2: datetime
        /*
         * 1. You would store this type of date in a LocalDateTime
         *
         * 2. using class DayOfWeek, store the current date and time. using DayOfWeek method .getValue(),
         * identify number representation of current day.
         * use this formula: if current_day_of_week >=5, number_of_days_prior = current_day_of_week - 4
         *              else if current_day_of_week <5, number_of_days_prior = current_day_of_week + 3
         * last_thursdays_date = Current date - number_of_days_prior
         */
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        int days_ago;
        if(dayOfWeek.getValue()>=5){
            days_ago = dayOfWeek.getValue() - 4;
        }
        else{
            days_ago = dayOfWeek.getValue() + 3;
        }
        LocalDate lastThursday = localDate.minusDays(days_ago);

        System.out.println(lastThursday);
        System.out.println();
        /*
         *
         * 3. Both are specific to an individual time zone, but ZoneID returns a string of the location of that time
         * zone, whereas zoneOffset returns a number of hours difference of that time zone from UTC
         *
         * 4. Use the Instant method atZone(ZoneId Zone). this returns a ZonedDateTime, given the zoneId as an
         * arg. to do the reverse, use the toInstant() method from ZonedDateTime.
         *
         * 5. convert given year into YearMonth object. use method lengthOfMonth().
         */
        localDate = LocalDate.now();
        Year year = Year.from(localDate);
        for(int i=1;i<13;i++){
            System.out.println(year.atMonth(i).lengthOfMonth());
        }
        System.out.println();

        /*
         * 6. Store date as localDate object. use method getDayOfWeek()
         */
        YearMonth yearMonth = YearMonth.from(localDate);
        for(int i=1; i<localDate.lengthOfMonth();i++){
            if(yearMonth.atDay(i).getDayOfWeek() == DayOfWeek.MONDAY)
                System.out.println(yearMonth.atDay(i).getDayOfMonth());
        }
        System.out.println();


        /* 7. Store as LocalDate object.
         * if ( LocalDate.getDayOfWeek().getValue() == 4 && getDayOfMonth().getValue()==13)
         * then it is friday the 13
         */
        System.out.println("Today is friday the 13: " + (localDate.getDayOfWeek().getValue() == 4 && localDate.getDayOfMonth()==13));


    }
}
