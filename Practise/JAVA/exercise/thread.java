package exercise;

//question1
class good extends Thread{
    public void run(){
//        try{
//            Thread.sleep(200);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        System.out.println("Good morning");
    }
}
class wel extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}

public class thread {
    public static void main(String[] args) {
        //question1
       good et = new good();
         wel w = new wel();
        et.setPriority(6);
        w.setPriority(9);
        System.out.println(et.getPriority());
        System.out.println(w.getPriority());
        System.out.println(w.getState());
        System.out.println(Thread.currentThread().getState());
         et.start();
         w.start();



    }


}
