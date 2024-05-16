package semester.lab.date_8feb_24_5thlab;// Program 1
import java.util.Scanner;

abstract class Student {
    protected int rollNo;
    protected long regNo;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No:");
        rollNo = scanner.nextInt();
        System.out.println("Enter Registration No:");
        regNo = scanner.nextLong();
    }

    public abstract void course();
}

class Kiitian extends Student {
    public void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class first5 {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();
        kiitian.getInput();
        kiitian.course();
    }
}
