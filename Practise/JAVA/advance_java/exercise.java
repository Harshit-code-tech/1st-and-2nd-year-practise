package advance_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;


public class exercise {
    public static void main(String[] args) {
        //problem 1
        ArrayList ar = new ArrayList<>();
        ar.add("Student1");
        ar.add("Student2");
        ar.add("Student3");
        ar.add("Student4");
        ar.add("Student5");
        ar.add("Student6");
        ar.add("Student7");
        ar.add("Student8");
        ar.add("Student9");
        ar.add("Student10");
        for(Object o:ar){
            System.out.println(o);
        }
//question3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
//        question4
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy\n HH:mm:ss");
        String st = dt.format(ldt);
        System.out.println(st);
//        question5
        HashSet<Integer> ht = new HashSet<>();
        ht.add(45);
        ht.add(35);
        ht.add(65);
        ht.add(75);
        System.out.println(ht);


    }
}
