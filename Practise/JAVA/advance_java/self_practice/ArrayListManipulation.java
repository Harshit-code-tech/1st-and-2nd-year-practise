package advance_java.self_practice;
//make the addition so that it can also add from anywhere in the code
//use .set
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
interface DataType{
    void addElement(Scanner sc);
    void removeElement(Scanner sc);
    boolean isEmpty();
}


class IntegerDataType implements DataType {
    private ArrayList<Integer> arrayList = new ArrayList<>();


    @Override
    public void addElement(Scanner sc) {
        System.out.print("Enter the integer to add: ");
        int intToAdd = sc.nextInt();
        arrayList.add(intToAdd);
        System.out.println("Integer added to the ArrayList.");
    }

    @Override
    public void removeElement(Scanner sc) {
        System.out.print("Enter the integer to remove: ");
        int intToRemove = sc.nextInt();
        if (arrayList.contains(intToRemove)) {
            arrayList.remove(Integer.valueOf(intToRemove));
            System.out.println("Integer removed from the ArrayList.");
        } else {
            System.out.println("Integer not found in the ArrayList.");
        }
    }
    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public String toString() {
        return arrayList.isEmpty() ? "Integers: ArrayList is empty." : "Integers: " + arrayList;
    }
}
class DoubleDataType implements DataType {
    private ArrayList<Double> arrayList = new ArrayList<>();


    @Override
    public void addElement(Scanner sc) {
        System.out.print("Enter the Double to add: ");
        double doubleToAdd = sc.nextDouble();
        arrayList.add(doubleToAdd);
        System.out.println("Double added to the ArrayList.");
    }

    @Override
    public void removeElement(Scanner sc) {
        System.out.print("Enter the integer to remove: ");
        double doubleToRemove = sc.nextDouble();
        if (arrayList.contains(doubleToRemove)) {
            arrayList.remove(Double.valueOf(doubleToRemove));
            System.out.println("Double removed from the ArrayList.");
        } else {
            System.out.println("Double not found in the ArrayList.");
        }
    }
    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public String toString() {
        return arrayList.isEmpty() ? "Double: ArrayList is empty." : "Double: " + arrayList;
    }
}class FloatDataType implements DataType {
    private ArrayList<Float> arrayList = new ArrayList<>();


    @Override
    public void addElement(Scanner sc) {
        System.out.print("Enter the Float to add: ");
        Float FloatToAdd = sc.nextFloat();
        arrayList.add((float) FloatToAdd);
        System.out.println("Float added to the ArrayList.");
    }

    @Override
    public void removeElement(Scanner sc) {
        System.out.print("Enter the Float to remove: ");
        Float FloatToRemove = sc.nextFloat();
        if (arrayList.contains(FloatToRemove)) {
            arrayList.remove(FloatToRemove);
            System.out.println("Float removed from the ArrayList.");
        } else {
            System.out.println("Float not found in the ArrayList.");
        }
    }
    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public String toString() {
        return arrayList.isEmpty() ? "Float: ArrayList is empty." : "Float: " + arrayList;
    }
}class HexDataType implements DataType {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public void addElement(Scanner sc) {
        System.out.print("Enter the Hex to add: ");
        String hexToAdd = sc.next();
        arrayList.add(hexToAdd);
        System.out.println("Hex added to the ArrayList.");
    }

    @Override
    public void removeElement(Scanner sc) {
        System.out.print("Enter the Hex to remove: ");
        String hexToRemove = sc.next();
        if (arrayList.contains(hexToRemove)) {
            arrayList.remove(hexToRemove);
            System.out.println("Hex removed from the ArrayList.");
        } else {
            System.out.println("Hex not found in the ArrayList.");
        }
    }
    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public String toString() {
        return arrayList.isEmpty() ? "Hex: ArrayList is empty." : "Hex: " + arrayList;
    }
}
class StringDataType implements DataType {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public void addElement(Scanner sc) {
        System.out.print("Enter the String to add: ");
        String stringToAdd = sc.nextLine(); // Changed nextLine() to next()
        arrayList.add(stringToAdd);
        System.out.println("String added to the ArrayList.");
    }

    @Override
    public void removeElement(Scanner sc) {
        System.out.print("Enter the String to remove: ");
        String stringToRemove = sc.nextLine(); // Changed nextLine() to next()
        if (arrayList.contains(stringToRemove)) {
            arrayList.remove(stringToRemove);
            System.out.println("String removed from the ArrayList.");
        } else {
            System.out.println("String not found in the ArrayList.");
        }
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
    @Override
    public String toString() {
        return arrayList.isEmpty() ? "String: ArrayList is empty." : "String: " + arrayList;
    }
}


public  class ArrayListManipulation {
    private static final String CORRECT_PASSWORD = "GROUPISOWN";
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int attempts = 5;
        int pass_attempts=5;
        System.out.print("Enter the password: ");
        String passwordInput = sc.nextLine();
        while (!passwordInput.equals(CORRECT_PASSWORD)) {
            pass_attempts--;
            if (pass_attempts == 0) {
                System.out.println("Incorrect password. You have been banned from using the program. Goodbye.");
                sc.close();
                return;
            }
            System.out.println("Incorrect password. Attempts left: " + pass_attempts);
            System.out.print("Enter the password: ");
            passwordInput = sc.nextLine();
        }

        // Create an array of DataType objects representing each data type
        DataType[] dataTypes = {
                new IntegerDataType(),
                new DoubleDataType(),
                new FloatDataType(),
                new HexDataType(),
                new StringDataType()
        };
        // User-friendly names for each data type
        String[] dataTypeNames = {
                "Integer",
                "Double",
                "Float",
                "Hexadecimal",
                "String"};
        try {
            // Main program loop
            do {
                System.out.println("Attempts left : "+ attempts);
                System.out.println("Select an action:");
                System.out.println("1. Add an element to a data type");
                System.out.println("2. Show ArrayLists");
                System.out.println("3. Remove from array");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");


                try {
                    int choice = sc.nextInt();
                    sc.nextLine(); // Consume the newline character after reading the choice

                    switch (choice) {
                        case 1 -> {
                            // Add an element to a selected data type ArrayList
                            System.out.println("Select a data type to add an element to:");
                            for (int i = 0; i < dataTypes.length; i++) {
                                System.out.println((i + 1) + ". " + dataTypeNames[i]);
                            }
                            System.out.println("\nEnter the number of the data type to add an element: ");
                            int dataTypeChoice = sc.nextInt();
                            sc.nextLine(); // Consume the newline character after reading the choice

                            if (dataTypeChoice >= 1 && dataTypeChoice <= dataTypes.length) {
                                DataType selectedDataType = dataTypes[dataTypeChoice - 1];
                                System.out.print("Enter the number of elements to add: ");
                                int numOfElementsToAdd = sc.nextInt();
                                sc.nextLine(); // Consume the newline character after reading the choice
                                for (int i = 0; i < numOfElementsToAdd; i++) {
                                    selectedDataType.addElement(sc);
                                }
                            } else {
                                System.out.println("Invalid data type choice. Please try again.");
                                attempts--;
                                break;
                            }
                        }
                        case 2 -> {
                            // Show the contents of each data type ArrayList
                            for (int i = 0; i < dataTypes.length; i++) {
                                DataType dataType = dataTypes[i];
                                if (dataType.toString().isEmpty()) {
                                    System.out.println(dataTypeNames[i] + " ArrayList is empty.");
                                } else {
                                    System.out.println(dataType.toString());
                                }
                            }
                        }
                        case 3 -> {
                            // Remove element from selected data type ArrayList
                            System.out.println("Select a data type to remove from:");
                            for (int i = 0; i < dataTypes.length; i++) {
                                System.out.println((i + 1) + ". " + dataTypeNames[i]);
                            }
                            System.out.println("\nPlease enter the number of the data type to remove: ");
                            int dataTypeChoice = sc.nextInt();
                            sc.nextLine(); // Consume the newline character after reading the choice

                            if (dataTypeChoice >= 1 && dataTypeChoice <= dataTypes.length) {
                                DataType selectedDataType = dataTypes[dataTypeChoice - 1];
                                System.out.print("Enter the number of elements to remove: ");
                                int numOfElementsToRemove = sc.nextInt();
                                sc.nextLine(); // Consume the newline character after reading the choice
                                for (int i = 0; i < numOfElementsToRemove; i++) {
                                    selectedDataType.removeElement(sc);
                                }
                            } else {
                                System.out.println("Invalid data type choice. Please try again.");
                                attempts--;
                                break;
                            }
                        }
                        case 4 -> {
                            // Exit the program
                            System.out.println("Exiting...");
                            return;
                        }
                        default -> {
                            // Invalid choice
                            System.out.println("Invalid choice. Please try again.");
                            attempts--;
                        }
                    }
                } catch (InputMismatchException e) {
                    // Invalid input
                    System.out.println("Invalid input. Please enter a valid number.");
                    attempts--;
                    sc.nextLine(); // Clear the invalid input
                }

                System.out.println();
            } while (attempts > 0);

            // The user has exceeded the number of attempts
            System.out.println("You have been banned from using the program. Goodbye.");
            Thread.sleep(5000); // Wait for 5 seconds before exiting the program
        } finally {
            // Close the Scanner
            sc.close();
            // Display a final message when the program exits
            System.out.println("\n\n Thank you for running the program.\n\n");
        }
    }
}

