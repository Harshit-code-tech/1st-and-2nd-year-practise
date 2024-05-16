package semester.lab.date21march24_googleclassroom;

class GFG extends Thread {
    @Override
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println("Thread name: " + t.getName());

        System.out.print("Check if thread is alive: ");
        System.out.println(t.isAlive());
    }

    // Main Method
    public static void main(String[] args) {
        GFG g = new GFG();

        Thread t1 = new Thread(g);

        t1.start();

        System.out.print("Check if thread is alive: ");
        System.out.println(t1.isAlive());

        t1.setName("GFG");

        System.out.println("Thread name changed: "+ t1.getName());

        try {
            t1.join();

            System.out.println("Join call executed");
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(t1.isAlive());
    }
}