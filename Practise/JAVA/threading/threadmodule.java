package threading;
class mt1 extends Thread{

    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("\n"+i+"Thank you\n");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;


        }
    }
}
class mt2 extends Thread{


    public void run(){
        int i = 0;
        while(i<10){
            System.out.println( "\n"+i+"This is what it is\n");
            i++;
        }
    }
}


public class threadmodule {
    public static void main(String[] args) {
        mt1 t1 = new mt1();
        mt2 t2 = new mt2();
        t1.start();
        //try{
//        t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();

    }
}
