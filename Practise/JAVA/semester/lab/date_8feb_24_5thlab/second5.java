package semester.lab.date_8feb_24_5thlab;

// Program 2
interface Motor {
    int capacity = 3;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Motor is running.");
    }

    public void consume() {
        System.out.println("Motor is consuming.");
    }
}

public class second5 {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine();
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}
