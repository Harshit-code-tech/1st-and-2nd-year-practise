package semester.lab.date1feb24;

import java.util.Scanner;

class Account {
    int accNo;
    double balance;

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accNo = input.nextInt();
        System.out.print("Enter balance: ");
        balance = input.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: Rs." + balance);
    }
}

class Person extends Account {
    String name;
    String aadharNo;

    @Override
    void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadharNo = input.nextLine();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadharNo);
    }
}

public class fourth4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Account and Person Details Program\n");

        Person[] persons = new Person[3];

        for (int i = 0; i < persons.length; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDisplaying Details for All Persons:\n");

        for (Person person : persons) {
            person.disp();
            System.out.println("-------------------------------");
        }
    }
}
