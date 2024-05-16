package threading;

class Mythr implements Runnable{
    private String name;
    public Mythr(String name){
        this.name=name;//if super(name)....in thread class there is already a constructor which takes the name
    }
    public void run(){
        int i = 0;
        while (i<10) {

            System.out.println(i + "I am a thread"+ name);
            i++;
        }
    }
}

public class threadconstructor {
    public static void main(String[] args) {
        Mythr t = new Mythr("Harry");
        Thread t1 = new Thread(t,"t1");
        Mythr t2 = new Mythr("Chandan");
        Thread t3 = new Thread(t2,"t3");
        t1.start();
        t3.start();
        System.out.println("The id of the thread is " + t1.getId());
        System.out.println("The id of the thread is " + t3.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The name of the thread t2 is " + t3.getName());

    }
}
