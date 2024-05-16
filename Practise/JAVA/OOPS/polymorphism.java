package OOPS;

interface Camera1 {
    void TakeSnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4k(){
        greet();
        System.out.println("recording in 4k");
    }
}

interface WiFi1 {
    String[] getNetwork();
    void connect_to_network(String network);
}

class Mycellphone1 {
    void callNumber(int PhoneNumber) {
        System.out.println("Calling " + PhoneNumber);
    }

    void Pickcall() {
        System.out.println("Connecting...");
    }
}

class Smartphone1 extends Mycellphone1 implements WiFi1, Camera1 {
    @Override
    public void TakeSnap() {
        System.out.println("Taking a snapshot");
    }
//    public void record4k(){
//        System.out.println("res=cording in 4k 2");
//    }

    @Override
    public void recordvideo() {
        System.out.println("Recording a video");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting Network list: ");
        String[] Network = {"no.1", "no.2", "no.3"};
        return Network;
    }

    @Override
    public void connect_to_network(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Smartphone1 sm = new Smartphone1();
        sm.record4k();
        String[] ar = sm.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
        Camera1 ca = new Smartphone1();//this is smartphone but kindly use it as a camera else error....polymorphism
       // cam1.getNetwork();-->not allowed
        ca.recordvideo();
        sm.callNumber(232323);
    }
}
