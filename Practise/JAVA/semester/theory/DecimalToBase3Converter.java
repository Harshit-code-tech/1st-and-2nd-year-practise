package semester.theory;
import java.util.Scanner;
class d2c {

    static void convertToTernary(int N) {

        if (N == 0)
            return;


        int x = N % 3;
        N /= 3;
        if (x < 0)
            N += 1;


        convertToTernary(N);
        if (x < 0)
            System.out.print(x + (3 * -1));
        else
            System.out.print(x);
    }


    static void convert(int Decimal) {
        System.out.print("Ternary number of " + Decimal + " is: ");


        if (Decimal != 0) {
            convertToTernary(Decimal);
        } else
            System.out.println("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float Decimal = sc.nextFloat();

        convert((int) Decimal);

    }
}

