package semester.lab.date25jan24;

import java.util.Scanner;
class rec {
    private double length;
    private double width;
    private double height;
    public rec(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double volume() {
        return length * width * height;
    }
}
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the box: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the box: ");
        double height = sc.nextDouble();
        rec myrec = new rec(length, width, height);
        double boxVolume = myrec.volume();
        System.out.println("The volume of the box is: " + boxVolume + " Unit cube");
        sc.close();
    }
}