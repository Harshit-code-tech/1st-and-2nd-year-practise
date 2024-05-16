package errors;

import java.util.Scanner;

public class try_catch_ {
    public static void main(String[] args) {
       //type 1
//        int a = 772;
//        int b =0;
//        without try
//        int c = a / b;
//        System.out.println("result: "+c);

//        //with try
//        try {
//            int c = a / b;
//            System.out.println("result: "+c);
//        }
//        catch(Exception e){
//            System.out.println("We failed to devide. reason");
//            System.out.println(e);
//        }
//        System.out.println("End of the program");

        //type2
        int [] marks= new int[3];
        marks[0]=7;
        marks[1]=96;
        marks[2]=8;
        Scanner sc = new Scanner(System.in);
        boolean flag  = true; // Boolean flag to control the loop for repeated input attempts
        while(flag) { // Repeat until the user provides correct input
            System.out.println("Enter the array index");
            int nd = sc.nextInt();
//
//        System.out.println("Enter the number youw want to divide with");
//        int num =  sc.nextInt();
            try {
                System.out.println("Welcome");
                //System.out.println("The valu of arry-value index is :"+ marks[nd]/num);
                try { // Nested try-catch block to handle potential ArrayIndexOutOfBoundsException
                    System.out.println(marks[nd]);
                    flag=false; // If we reach this point, the index is valid, exit the loop
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Tier 2 occered\n");
                    System.out.println(e);
                }

            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException occured\n");
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("Some other problem occured\n");
                System.out.println(e);
            }


            System.out.println("End of the program");
        }

    }
}
