package OOPS;

abstract class Shape{
    abstract double calculatearea();
    void display(){
        System.out.println("This is abstract msg");
    }


}

class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }


    @Override
    double calculatearea() {
        return Math.PI * radius * radius;
    }
}
public class abstractexercise {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
        double area = c.calculatearea();
        System.out.println("Area: " + area);


    }
}
