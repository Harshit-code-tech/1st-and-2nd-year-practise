package recursion;

import java.util.Scanner;

public class subsequesce {
    static int count = 0;
    public static void sub(String str, int in, String newstr){
        if(in==str.length()){
            count++;
            System.err.println(count + ") " + newstr);
            return;
        }
        char curchar= str.charAt(in);
        //to be
        sub(str,in+1,newstr+curchar);
        //not to be
        sub(str,in+1,newstr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        long startTime = System.currentTimeMillis();
        sub(str, 0, "");
        long endTime = System.currentTimeMillis();

        System.err.println("Time taken: " + (endTime - startTime) + " ms");


    }
}
