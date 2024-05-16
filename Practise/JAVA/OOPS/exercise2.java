package OOPS;

public class exercise2 {

   /* //Questiol 1
    static class circle{
        public int radius;
        circle(int r){
            System.out.println("Hello");
            this.radius =r;

        }

        public double area(){
            return Math.PI*this.radius*this.radius;
        }
    }
    static class cylinder extends circle{
        public int height;
        cylinder(int r, int h){
            super(r);
            this.height = h;
            System.out.println("this is cylinder");


        }

        public double volume(){
            return Math.PI*this.radius*this.radius*this.height;
        }

    }
    //Question 2
    static class Rectangle{
        public int length;
        public int breadth;
        Rectangle(int l,int b){
            System.out.println("Hello,it's l,b");
            this.length =l;
            this.breadth =b;


        }
        public double area(){
            return this.length*this.breadth;
        }
   }
   static class cuboid extends Rectangle {
       public int height;
       cuboid(int l, int b,int h) {

           super(l, b);
           this.height=h;
           System.out.println("This is cuboid");
       }
       public double volume(){
           return this.length*this.breadth*this.height;
       }
   }
    //question 3
    abstract class pen{
        abstract void write();
        abstract void refill();
   }
   class fountain_pen extends pen{
       @Override
       void write() {
           System.out.println("write");

       }

       @Override
       void refill() {
           System.out.println("refill");
       }
       void changenib(){
           System.out.println("changing nib");
       }
   }

    //question4
   static class monkey {
       void jump() {
           System.out.println("jump");
       }

       void bite() {
           System.out.println("bite");
       }
   }

    static class human extends monkey implements basicanimal {
        void speak() {
            System.out.println("speaking");
        }

        @Override
        public void eat() {
            System.out.println("eating");
        }

        @Override
        public void sleep() {
            System.out.println("sleep");
        }
    }

    public interface basicanimal {
        void eat();
        void sleep();
    }
    //question5
    static abstract class telephone{
        abstract void ring();
        abstract void lift();
        abstract void disconnect();
   }
   static class SmartTelephone extends telephone{

       @Override
       void ring() {
           System.out.println("Ringing");

       }

       @Override
       void lift() {
           System.out.println("Lifting");

       }

       @Override
       void disconnect() {
           System.out.println("Disconnected");

       }
   }*/
    //questioon6
    static interface tvremote{
       void powerOn();
       void powerOff();
       void volumeUp();
       void volumeDown();
       void channelUp();
       void channelDown();
   }
    static interface SmartTVRemote extends tvremote {

        void openApp(String appName);
        void browseInternet();
        String[] getInstalledApps();
        String[] getAvailableNetworks();
    }
    static class mysmarttv implements SmartTVRemote{
        private String[] installedApps;
        private String[] availableNetworks;
        // Constructor to initialize the arrays
        public mysmarttv(String[] apps, String[] networks) {
            installedApps = apps;
            availableNetworks = networks;
        }

        @Override
        public void powerOn() {
            System.out.println("Powering on");
        }

        @Override
        public void powerOff() {
            System.out.println("powring off");

        }

        @Override
        public void volumeUp() {
            System.out.println("volume up");

        }

        @Override
        public void volumeDown() {
            System.out.println("volume down");

        }

        @Override
        public void channelUp() {
            System.out.println("channell up");

        }

        @Override
        public void channelDown() {
            System.out.println("channel down");

        }

        @Override
        public void openApp(String appName) {
            System.out.println("opening"+ appName);

        }

        @Override
        public void browseInternet() {
            System.out.println("browsing the network");

        }

        @Override
        public String[] getInstalledApps() {
            return installedApps;
        }

        @Override
        public String[] getAvailableNetworks() {
            return availableNetworks;
        }
    }
    static class TV implements tvremote{
        private int volume;
        private int channel;

        @Override
        public void powerOn() {
            System.out.println("TV Powering on");

        }

        @Override
        public void powerOff() {
            System.out.println("Tv powering off");

        }

        @Override
        public void volumeUp() {
            volume++;
            System.out.println("volume increasing by "+ volume);

        }

        @Override
        public void volumeDown() {
            volume--;
            System.out.println("volume decreasig by "+ volume);

        }

        @Override
        public void channelUp() {
            channel++;
            System.out.println("channel incrased by "+ channel);

        }

        @Override
        public void channelDown() {
            channel--;
            System.out.println("channel decrease by"+ channel);

        }
    }



    public static void main(String[] args) {
       //Question 1
        // circle ob = new circle(12);
       //cylinder obj= new cylinder(12,4);


        /*Rectangle obj = new Rectangle(2,3);
        System.out.println("Area of the rectangle: " + obj.area());
        cuboid ob = new cuboid(2,3,4);
        System.out.println("Area of the cuboid: " + ob.area());
        System.out.println("Volume of the cuboid: " + ob.volume());

        //question 3
        //fountain_pen fp = new fountain_pen();
        //fp.changenib();
        //question4
        //human h = new human();
        //h.sleep();
        //question5
//        telephone tl = new SmartTelephone();
//        tl.disconnect();
//        tl.ring();
//        tl.lift();
        //question6*/
        String[] installedApps = { "Netflix", "YouTube", "Anime" };
        String[] availableNetworks = { "network 1", "network2", "network3" };
        mysmarttv mv = new mysmarttv(installedApps, availableNetworks);
        mv.powerOn();
        mv.openApp("Youtube");
        mv.volumeUp();
        mv.volumeDown();
        mv.browseInternet();
        mv.powerOff();
        System.out.println("\n_______________________\n");
        System.out.println("Installed apps");
        for(String app: mv.getInstalledApps()){
            System.out.println(app);
        }
        for(String network: mv.getAvailableNetworks()){
            System.out.println(network);
        }
        System.out.println("\n_______________________\n");
        TV tv= new TV();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeDown();
        tv.channelUp();
        tv.channelUp();
        tv.channelDown();
        tv.powerOff();





    }
}
