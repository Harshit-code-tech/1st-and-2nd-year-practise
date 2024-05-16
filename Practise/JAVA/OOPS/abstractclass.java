package OOPS;
import java.lang.reflect.Modifier;
abstract class Parent2{
    //constructor
    public Parent2(){
        System.out.println("constructor of this one");
    }
    //method
    public void hello(){
        System.out.println("hello");
    }
    abstract public void greet();




}
class Child2 extends Parent2
{
    public void greet(){
        System.out.println("Sub good ");
    }
}


abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("Sub 2good ");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Child2 c = new Child2();
        Child3 c3 = new Child3() {
            public void greet() {
                System.out.println("Anonymous Sub good");
            }
        };

// Check if classes are abstract and print their names
        if (c.getClass().isAnonymousClass()) {
            System.out.println("Child2 is an anonymous class");
        } else if (c.getClass().isArray()) {
            System.out.println("Child2 is an abstract class");
        } else {
            System.out.println("Child2 is a concrete class");
        }

        if (c3.getClass().isAnonymousClass()) {
            System.out.println("Child3 is an anonymous class");
        } else if (c3.getClass().isArray()) {
            System.out.println("Child3 is an abstract class");
        } else {
            System.out.println("Child3 is a concrete class");
        }


    }
}
