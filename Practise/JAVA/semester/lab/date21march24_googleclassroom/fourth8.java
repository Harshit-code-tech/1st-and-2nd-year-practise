package semester.lab.date21march24_googleclassroom;

import java.util.Scanner;

class SumThread extends Thread {
    private int[] array;
    private int sum;
    private int lowerRange;
    private int upperRange;

    public SumThread(int[] array, int lowerRange, int upperRange) {
        this.array = array;
        this.sum = 0;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        for (int i = lowerRange; i <= upperRange && i < array.length; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}

public class fourth8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the elements of the array (space-separated): ");
        String[] inputArray = sc.nextLine().split(" ");
        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.print("Enter the thread name for thread 1: ");
        String threadName1 = sc.nextLine();
        System.out.print("Enter the thread name for thread 2: ");
        String threadName2 = sc.nextLine();

        System.out.print("Enter the lower range for thread 1: ");
        int lowerRange1 = sc.nextInt();
        System.out.print("Enter the upper range for thread 1: ");
        int upperRange1 = sc.nextInt();

        SumThread thread1 = new SumThread(array, lowerRange1, upperRange1);

        System.out.print("Enter the lower range for thread 2: ");
        int lowerRange2 = sc.nextInt();
        System.out.print("Enter the upper range for thread 2: ");
        int upperRange2 = sc.nextInt();

        SumThread thread2 = new SumThread(array, lowerRange2, upperRange2);

        thread1.setName(threadName1);
        thread2.setName(threadName2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = thread1.getSum() + thread2.getSum();
        System.out.println("Total sum: " + totalSum);
    }
}