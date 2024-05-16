package recursion;

public class ntimes {
    public static int printPower(int x, int n) {
        //n times
//        if(n == 0) {
//            return 1;
//        }
//        if(x == 0) {
//            return 0;
//        }
//        int x_ = printPower(x, n-1);
//        int xn = x * x_;
//        return xn;
//    }
        //logs

        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {//n is even
            return printPower(x, n/2) * printPower(x, n/2);
        }
        else {
            return x * printPower(x, n/2) * printPower(x, n/2);
        }
        }
    public static void main(String args[]) {
        int x = 2, n = 5;
//        int output = printPower(x, n);
//        System.out.println(output);

        //log times

        int output = printPower(x, n);
        System.out.println(output);
            }
        }

    

