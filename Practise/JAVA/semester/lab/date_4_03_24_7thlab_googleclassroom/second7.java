package semester.lab.date_4_03_24_7thlab_googleclassroom;

class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public String toString() {
        return "Side of the square: " + this.side;
    }
}

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class second7 {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println(square);
        System.out.println("Rectangle Length: " + rectangle.length + ", Breadth: " + rectangle.breadth);
    }
}