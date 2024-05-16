package semester.lab.date1feb24;

class Apple {
    void show() {
        System.out.println("Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry");
    }
}

public class third4 {
    public static void main(String[] args) {
        Apple a = new Apple();
        Banana b = new Banana();
        Cherry c = new Cherry();

        a.show();
        b.show();
        c.show();
    }
}
