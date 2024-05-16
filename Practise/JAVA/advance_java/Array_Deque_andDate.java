package advance_java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Array_Deque_andDate {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.offerFirst(42);
        ad1.addLast(55);

//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.getLast());
//        HashSet<Integer> myhas = new HashSet<>(6,0.5f);
//        myhas.add(3);
//        myhas.add(4);
//        myhas.add(5);
//        myhas.add(6);
//        myhas.add(7);
//        System.out.println(myhas);
        //Date and time
      //  System.out.println(System.currentTimeMillis()/1000/3600/24/365);//1900 is start time
       // System.out.println(Long.MAX_VALUE);
//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());//return the numbers of milliseconds since 1970
//        System.out.println(d.getDate());//return the numbers of milliseconds since 1970
//        System.out.println(d.getSeconds());
//        System.out.println(d.getYear());//it starts since 1900
       // Calendar c =Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));//it is abstract class
//       Calendar c =Calendar.getInstance();//it is abstract class
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone().getID());
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
// can get changed using set
//        GregorianCalendar cal = new GregorianCalendar();
//        System.out.println(cal.isLeapYear(5600));
//        System.out.println(TimeZone.getAvailableIDs()[0]);
//        System.out.println(TimeZone.getAvailableIDs()[1]);
//        System.out.println(TimeZone.getAvailableIDs()[2]);
//        System.out.println(TimeZone.getAvailableIDs()[3]);
//        System.out.println(TimeZone.getAvailableIDs()[4]);
//        System.out.println(TimeZone.getAvailableIDs()[5]);
//        System.out.println(TimeZone.getAvailableIDs()[7]);
//        System.out.println(TimeZone.getDefault());
       // System.out.println(TimeZone.getID());
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime LDT = LocalDateTime.now();//This is the date
        System.out.println(LDT);



                // Create a LocalDateTime object representing a specific date and time
               // LocalDateTime localDateTime = LocalDateTime.of(2023, 7, 29, 15, 30, 45);

                // Define a custom date and time pattern
                String pattern = "yyyy-MM-dd HH:mm:ss  --E a";//patterns for formatting and passing is important

                // Create a DateTimeFormatter using the custom pattern
                DateTimeFormatter fr = DateTimeFormatter.ofPattern(pattern);

                // Format the LocalDateTime object to a string using the formatter
                String fddt = LDT.format(fr);//go to jdk predefined formator of time online for more types
//for eg.
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_DATE;
                //System.out.println("Formatted DateTime: " + formattedDateTime);
        String dt2 = LDT.format(d2);
                System.out.println("Formatted DateTime: " + fddt);

}
        }








