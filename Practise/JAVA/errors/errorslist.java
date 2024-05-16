package errors;

import java.util.Scanner;

class syntax_logical_error {
    int a = 5; // ; missing = syntax error

    void printValue() { // Method to print the value of 'a'
        a = a + 10; // Introducing a logical error by changing the value of 'a'
        System.out.println(a); // if a+b then also syntax error
    }
}
class runtimeerror {


    void  printValue() {
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");

        b=sc.nextInt();
        System.out.println("Enter the number and here it is divided by 1000\n"+ 1000/b);//after getting a number which it can't handle
        //it will give runtime error


    }
}


public class errorslist {
    public static void main(String[] args) {
        syntax_logical_error s = new syntax_logical_error();
        s.printValue(); // Call the printValue method to print the value of 'a'
        runtimeerror r = new runtimeerror();
        r.printValue();
    }
}
