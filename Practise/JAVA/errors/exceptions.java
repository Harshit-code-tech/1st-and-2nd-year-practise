package errors;

//type 1
/*class myexceptiong extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class maxageexception extends Exception {
    @Override
    public String toString() {
        return "Age cannot be more then 125";
    }

    @Override
    public String getMessage() {
        return "Make sure is value is correct";
    }
}

//type 2
class CustomException1 extends Exception {
    private int errorCode;

    public CustomException1(int errorCode) {
        super("CustomException1 occurred with error code: " + errorCode);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

class CustomException2 extends Exception {
    private String errorMessage;

    public CustomException2(String errorMessage) {
        super("CustomException2 occurred with error message: " + errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
*/
//type 3
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}


public class exceptions {

      //type 1
       /* int a;
        System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a <= 125) {
            System.out.println("You can go");
        } else {
            try {
                //  throw new myexceptiong();
                // throw new ArithmeticException("This is an exception");
                throw new maxageexception();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();//shows which line caused error
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

        //type 2
        int a ,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero"); // Throwing ArithmeticException
            }

            if (a < 0) {
                throw new CustomException1(42); // Throwing CustomException1
            }

            if (a > 100) {
                throw new CustomException2("Value is not bro"); // Throwing CustomException2
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());


        } catch (CustomException1 e) {
            System.out.println("CustomException1 occurred");
            System.out.println("Error Code: " + e.getErrorCode());
        } catch (CustomException2 e) {
            System.out.println("CustomException2 occurred");
            System.out.println("Error Code: " + e.getErrorMessage());
        }catch(Exception e){
            System.out.println("nothing left to say");
            System.out.println(e);// Catch-all block for any other exceptions (will handle all remaining exceptions)
        }
        */
        //type 3



            public static double area(int r) throws NegativeRadiusException{//throws= hint for programmesrs that it acn givs exceptions
                if (r<0){
                    throw new NegativeRadiusException();
                }
                double result = Math.PI * r * r;
                return result;
            }

            public static int divide(int a, int b) throws ArithmeticException{
                // Made By Harry
                int result = a/b;
                return result;
            }
            public static void main(String[] args) {
                // Shivam - uses divide function created by Harry
                try{
//            int c = divide(6, 0);
//            System.out.println(c);
                    double ar = area(3);
                    System.out.println(ar);
                }
                catch(Exception e){
                    System.out.println("Exception");
                }
            }
        }


