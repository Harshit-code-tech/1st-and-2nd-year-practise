package OOPS;

interface Camera {
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

interface WiFi {
    String[] getNetwork();
    void connect_to_network(String network);
}

class Mycellphone {
    void callNumber(int PhoneNumber) {
        System.out.println("Calling " + PhoneNumber);
    }

    void Pickcall() {
        System.out.println("Connecting...");
    }
}

class Smartphone extends Mycellphone implements WiFi, Camera {
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

public class default_methods {
    public static void main(String[] args) {
        Smartphone sm = new Smartphone();
        sm.record4k();
        String[] ar = sm.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
