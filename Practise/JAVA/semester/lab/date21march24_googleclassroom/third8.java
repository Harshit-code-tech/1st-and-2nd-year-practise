package semester.lab.date21march24_googleclassroom;
import java.util.Scanner;
class cthread extends Thread {
    private final int lowerRange;
    private final int upperRange;

    public cthread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print("counter- " + i + "   ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class third8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the thread name ");
        String threadname = sc.nextLine();
        System.out.print("Enter the lower range of the counter: ");
        int lowerRange = sc.nextInt();
        System.out.print("Enter the upper range of the counter: ");
        int upperRange = sc.nextInt();
        System.out.print("Enter the space between counter values in milliseconds: ");
        int space = sc.nextInt();

        cthread cthread = new cthread(threadname, lowerRange, upperRange);
        cthread.start();
    }
}