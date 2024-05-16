package threading;
import java.util.Scanner;
class abs implements Runnable{
    private String name;
    private int number;

    public abs(String name, int number){
        this.name=name;
        this.number=number;
    }


    @Override
    public void run() {
        System.out.println("\nHello boys " + name + "\nYour number is " + number + "\nThread name: " + Thread.currentThread().getName());
    }
}

public class groupthreading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String username = sc.nextLine();
        System.out.println("Enter your number");
        int num = sc.nextInt();
        abs ru = new abs(username,num);
        ThreadGroup tg = new ThreadGroup("Codesh");
        Thread t1=new Thread(tg,ru,"anda");
        Thread t2=new Thread(tg,ru,"ka");  
        Thread t3= new Thread(tg,ru,"phanda");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("_____________________________");
        ThreadGroup tg1 = new ThreadGroup("New1");
        Thread t11=new Thread(tg1,ru,"Thread1");
        Thread t22=new Thread(tg1,ru,"Thread12");  
        Thread t33= new Thread(tg1,ru,"Thread13");
        t11.start();
        t22.start();
        t33.start();
        System.out.println("Thread group name: "+ tg.getName());
        tg.list();//listed the threads contained in the "Codesh" thread group using




    }
}
