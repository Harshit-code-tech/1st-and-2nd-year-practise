package semester.lab.date25jan24;

import java.util.Scanner;
class Student {
    private int roll;
    private String name;
    private double cgpa;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }
    public void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("--------------------------");
    }

    public double getCGPA() {
        return cgpa;
    }
    public String getName() {
        return name;
    }
}

public class third3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i].input();
        }
        System.out.println("Details of students:");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }
        double lowestCGPA = students[0].getCGPA();
        String lowestCGPAStudentName = students[0].getName();

        for (int i = 1; i < n; i++) {
            if (students[i].getCGPA() < lowestCGPA) {
                lowestCGPA = students[i].getCGPA();
                lowestCGPAStudentName = students[i].getName();
            }
        }
        System.out.println("Student with the lowest CGPA: " + lowestCGPAStudentName);
    }
}