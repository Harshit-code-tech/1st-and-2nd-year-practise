package semester.lab.date25jan24;

class SubtractOperation {
    public int subtract(int a, int b) {
        return a - b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
    public int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}

public class fourth3 {
    public static void main(String[] args) {
        SubtractOperation subtractor = new SubtractOperation();
        System.out.println("Subtracting two integers: " + subtractor.subtract(10, 5));
        System.out.println("Subtracting two double numbers: " + subtractor.subtract(15.5, 7.2));
        System.out.println("Subtracting three integers: " + subtractor.subtract(20, 5, 3));
        int[] numbers = {30, 10, 5};
        System.out.println("Subtracting an array of integers: " + subtractor.subtract(numbers));
    }
}