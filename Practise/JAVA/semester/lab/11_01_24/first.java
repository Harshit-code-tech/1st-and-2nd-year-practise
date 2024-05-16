package semester.lab;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Section: ");
        char section = sc.next().charAt(0);
        
        sc.close();
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
    }
}
