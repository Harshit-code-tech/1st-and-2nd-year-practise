package semester.lab.date1feb24;
import java.util.Scanner;

class twod {
    double length;
    double width;

    twod(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class threed extends twod {
    double height;

    threed(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double vol(){
        return area() * height;
    }
}

public class first4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions for plastic (2D): ");
        System.out.print("Length: ");
        double l = sc.nextDouble();
        System.out.print("Width: ");
        double w = sc.nextDouble();
        twod t = new twod(l, w);
        double areaCost = t.area() * 40;

        System.out.print("Enter dimensions for plastic (3D): ");
        System.out.print("Length: ");
        double l3d = sc.nextDouble();
        System.out.print("Width: ");
        double w3d = sc.nextDouble();
        System.out.print("Height: ");
        double h3d = sc.nextDouble();

        threed t3 = new threed(l3d, w3d, h3d);
        double volumeCost = t3.vol() * 60;
        double total = areaCost + volumeCost;

        System.out.println("Cost of 2D plastic sheet: Rs " + areaCost);
        System.out.println("Cost of 3D plastic box: Rs " + volumeCost);
        System.out.println("Total cost of plastic: Rs " + total);

        sc.close();
    }
}
