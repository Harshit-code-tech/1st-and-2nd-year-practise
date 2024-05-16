package semester.sessional;
// use multithreading in java to optimize the sum operation over an array. The first thread will calculate the sum of the first half of the array and the second thread will calculate the sum of the second half of the array.
import java.util.Arrays;

public class firstsessional4thsem {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SumThread sumfirst = new SumThread("sumfirst", Arrays.copyOfRange(array, 0, array.length / 2));
        SumThread sumsecond = new SumThread("sumsecond", Arrays.copyOfRange(array, array.length / 2, array.length));

        sumfirst.start();
        sumsecond.start();
        try {
            sumfirst.join();
            sumsecond.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int totalSum = sumfirst.getSum() + sumsecond.getSum();
        System.out.println("Total Sum: " + totalSum);
    }

    static class SumThread extends Thread {
        private int[] arr;
        private int sum;

        public SumThread(String name, int[] arr) {
            super(name);
            this.arr = arr;
            this.sum = 0;
        }

        public void run() {
            for (int num : arr) {
                sum += num;
            }
            System.out.println(Thread.currentThread().getName() + " Sum: " + sum);
        }

        public int getSum() {
            return sum;
        }
    }
}