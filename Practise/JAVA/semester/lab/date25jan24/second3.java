package semester.lab.date25jan24;

import java.util.Scanner;
class Rectangle {
    private double length;
    private double breadth;
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }
    public void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        display(area, perimeter);
    }
    private void display(double area, double perimeter) {
        System.out.println("Area of the rectangle: " + area + " Unit Square");
        System.out.println("Perimeter of the rectangle: " + perimeter + " Units");
    }
}
public class second3 {
    public static void main(String[] args) {
        Rectangle reca = new Rectangle();
        reca.read();
        reca.calculate();
    }
}