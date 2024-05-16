package threading;

class Mythread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(i + "My thread is rulling");
            System.out.println(i + "i am happy");
            i++;
        }

    }

}

class Mythread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        do {
            System.out.println(i + "My thread2 is rulling");
            System.out.println(i + "i am sad");
            i++;
        } while (i < 10);

    }

}

public class extendingthreadclass {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        Mythread2 m2 = new Mythread2();
        mt.start();
        m2.start();
    }
}
