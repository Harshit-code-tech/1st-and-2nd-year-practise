package recursion;

import java.util.HashSet;
import java.util.Scanner;

public class unique_subsequesce {
    static int count = 1;

    public static void sub(String str, int in, String newstr,HashSet<String> set){
        if(in==str.length()){


            if(set.contains(newstr)){

                return;
            }else{
                set.add(newstr);
                System.err.println(count + ") " + newstr);
                 count++;
                return;
            }
        }
        char curchar= str.charAt(in);
        //to be
        sub(str,in+1,newstr+str.charAt(in),set);
        //not to be
        sub(str,in+1,newstr,set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the str1 value: ");
        String str1 = sc.next();
        System.out.println("Enter the str2 value: ");
        String str2 = sc.next();
        HashSet<String> set = new HashSet<>();
        System.out.println("\nNormal");
        sub(str1, 0, "", set);


        count = 1;
        System.err.println("\nUnique");

        sub(str2, 0, "", set);


    }
}
