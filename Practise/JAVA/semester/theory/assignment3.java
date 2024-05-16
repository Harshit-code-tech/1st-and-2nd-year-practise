package semester.theory;

public class assignment3 {
    public static void main(String[] args) {
        // Test the newdeclaration class
        newdeclaration buffer1 = new newdeclaration();
        System.out.println("Initial capacity: " + buffer1.capacity()); // Output: 16
        buffer1.append("Hello");
        System.out.println("After appending 'Hello': " + buffer1); // Output: Hello
        System.out.println("Length: " + buffer1.length()); // Output: 5
        System.out.println("Capacity: " + buffer1.capacity()); // Output: 16

        buffer1.append(" World!");
        System.out.println("After appending ' World!': " + buffer1); // Output: Hello World!
        System.out.println("Length: " + buffer1.length()); // Output: 12
        System.out.println("Capacity: " + buffer1.capacity()); // Output: 16

        buffer1.reverse();
        System.out.println("After reversing: " + buffer1); // Output: !dlroW olleH

        buffer1.insert(6, "Beautiful ");
        System.out.println("After inserting 'Beautiful' at index 6: " + buffer1); // Output: !dlroW Beautiful olleH

        buffer1.replace(7, 16, "Wonderful");
        System.out.println("After replacing from index 7 to 16: " + buffer1); // Output: !dlroW Wonderful olleH

        buffer1.delete(7, 17);
        System.out.println("After deleting from index 7 to 16: " + buffer1); // Output: !dlroW olleH

        buffer1.setCharAt(1, 'a');
        System.out.println("After setting character at index 1 to 'a': " + buffer1); // Output: !alroW olleH

        System.out.println("Character at index 3: " + buffer1.charAt(3)); // Output: r
    }
}
