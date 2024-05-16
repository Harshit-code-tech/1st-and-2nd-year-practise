package advance_java.javadocs;

/**
 * This is a simple Java program to demonstrate JavaDocs.
 *
 * @author Harry
 * @version 0.1
 * @since 1.0
 * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/index.html">Java docs</a>
 */
public class NewTry {

    /**
     * This method adds two integers and prints the result.
     *
     * @param a The first integer.
     * @param b The second integer.
     */
    public void add(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }

    public static void main(String[] args) {
        NewTry newTry = new NewTry();
        newTry.add(5, 7);
        System.out.println("This is my main method");
    }
}
