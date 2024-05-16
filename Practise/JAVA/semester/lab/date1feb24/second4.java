package semester.lab.date1feb24;

import java.util.Scanner;


class Plate {
    double length;
    double width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void Dimdis() {
        System.out.println("Plate Dimensions - Length: " + length + ", Width: " + width);
    }
}


class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    void Dimdis() {
        super.Dimdis();
        System.out.println("Box Dimensions - Height: " + height);
    }
}


class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
    }

    void Dimdis() {
        super.Dimdis();
        System.out.println("Wood Box Dimensions - Thickness: " + thickness);
    }
}

public class second4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for Plate:");
        System.out.print("Length: ");
        double lplat = sc.nextDouble();
        System.out.print("Width: ");
        double wplate = sc.nextDouble();

        Plate p = new Plate(lplat, wplate);
        p.Dimdis();

        System.out.println("\nEnter dimensions for Box:");
        System.out.print("Length: ");
        double lbox = sc.nextDouble();
        System.out.print("Width: ");
        double wbox = sc.nextDouble();
        System.out.print("Height: ");
        double hbox = sc.nextDouble();

        Box box = new Box(lbox, wbox, hbox);
        box.Dimdis();

        System.out.println("\nEnter dimensions for Wood Box:");
        System.out.print("Length: ");
        double lwoodbox = sc.nextDouble();
        System.out.print("Width: ");
        double wwoodbox = sc.nextDouble();
        System.out.print("Height: ");
        double heightWoodBox = sc.nextDouble();
        System.out.print("Thickness: ");
        double twoodbox = sc.nextDouble();

        WoodBox woodBox = new WoodBox(lwoodbox, wwoodbox, heightWoodBox, twoodbox);
        woodBox.Dimdis();

       sc.close();
    }
}
