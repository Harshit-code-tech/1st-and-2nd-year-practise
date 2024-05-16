package threading;
class MythreadRunnable implements Runnable{
    public void run(){
        int i = 0;
        do{System.out.println(i+ "I am a thread");
        i++;}while(i<10);
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){int i = 0;
        while(i<10) {
            System.out.println(i+ "I am not a thread");
        i++;
        }
    }
}

public class implementingthread {
    public static void main(String[] args) {
        MythreadRunnable bullet1 = new MythreadRunnable();
        Thread gun1= new Thread(bullet1);
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
