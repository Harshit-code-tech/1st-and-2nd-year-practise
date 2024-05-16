package OOPS;
import java.util.Scanner;

public class question1 {
   /* public static class cylinder{
        private int radius;
        private int height;

        public cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }



        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
        public double SurfaceArea(){
            return 2*Math.PI
*radius*radius + 2*Math.PI
*radius*height;
        }
        public double Volume(){
            return Math.PI *radius*radius*height;
        }
    }
    */
   static class Rectangle{
        private int length;
       private int breadth;

       public Rectangle() {
           this.length = 4;
           this.breadth = 5;
       }

       public Rectangle(int length, int breadth) {
           this.length = length;
           this.breadth = breadth;
       }

       public int getLength() {
           return length;
       }

       public int getBreadth() {
           return breadth;
       }
   }
    public static void main(String[] args) {
       /* //QUESTUION 1
        cylinder my = new cylinder(9,12);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int h,ra;
        h = (int) sc.nextDouble();


        my.setHeight(h);

        System.out.println(my.getHeight());
        System.out.println(" ");
        System.out.println("Enter the radius: ");
        ra = (int) sc.nextDouble();

        my.setRadius(ra);

        System.out.println(my.getRadius());
        System.out.println(" ");
        System.out.println(my.SurfaceArea());
        System.out.println(my.Volume());*/
        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());













    }
}
