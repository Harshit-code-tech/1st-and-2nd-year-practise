package semester.theory;

public class newdeclaration {
    private char[] buffer;
    private int length;
    private int capacity;

    // Constructor to create an empty String Buffer with initial capacity of 16
    public newdeclaration() {
        this.buffer = new char[16];
        this.length = 0;
        this.capacity = 16;
    }

    // Constructor to create a String Buffer with specified string and reserve space for 16 additional characters
    public newdeclaration(String str) {
        int strLength = str.length();
        this.capacity = strLength + 16;
        this.buffer = new char[this.capacity];
        this.length = strLength;
        str.getChars(0, strLength, this.buffer, 0);
    }

    // Method to append string s at the end of the string in newdeclaration object
    public newdeclaration append(String s) {
        int newLength = this.length + s.length();
        if (newLength > this.capacity) {
            ensureCapacity(newLength);
        }
        s.getChars(0, s.length(), this.buffer, this.length);
        this.length = newLength;
        return this;
    }

    // Method to reverse the string in the newdeclaration object
    public newdeclaration reverse() {
        for (int i = 0; i < this.length / 2; i++) {
            char temp = this.buffer[i];
            this.buffer[i] = this.buffer[this.length - i - 1];
            this.buffer[this.length - i - 1] = temp;
        }
        return this;
    }

    // Method to insert string s at position "offset" in the newdeclaration object
    public newdeclaration insert(int offset, String s) {
        if (offset < 0 || offset > this.length) {
            throw new IndexOutOfBoundsException("Index: " + offset + ", Length: " + this.length);
        }

        int newLength = this.length + s.length();
        if (newLength > this.capacity) {
            ensureCapacity(newLength);
        }

        // Shift existing characters to make space for new characters
        System.arraycopy(this.buffer, offset, this.buffer, offset + s.length(), this.length - offset);

        // Insert new characters
        s.getChars(0, s.length(), this.buffer, offset);
        this.length = newLength;
        return this;
    }

    // Method to replace the string from specified startIndex and endIndex
    public newdeclaration replace(int startIndex, int endIndex, String str) {
        if (startIndex < 0 || endIndex > this.length || startIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }

        int replacementLength = str.length();
        int replaceCount = endIndex - startIndex;
        int newLength = this.length - replaceCount + replacementLength;

        if (newLength > this.capacity) {
            ensureCapacity(newLength);
        }

        // Shift existing characters after the replacement
        System.arraycopy(this.buffer, endIndex, this.buffer, startIndex + replacementLength, this.length - endIndex);

        // Replace characters
        str.getChars(0, replacementLength, this.buffer, startIndex);
        this.length = newLength;
        return this;
    }

    // Method to delete the string from specified startIndex and endIndex
    public newdeclaration delete(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > this.length || startIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }

        int deleteCount = endIndex - startIndex;
        System.arraycopy(this.buffer, endIndex, this.buffer, startIndex, this.length - endIndex);
        this.length -= deleteCount;
        return this;
    }

    // Method to ensure the capacity is at least equal to the given minimum
    public void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity > this.capacity) {
            int newCapacity = Math.max(this.capacity * 2, minimumCapacity);
            char[] newBuffer = new char[newCapacity];
            System.arraycopy(this.buffer, 0, newBuffer, 0, this.length);
            this.buffer = newBuffer;
            this.capacity = newCapacity;
        }
    }

    // Method to return char at i-th index of the string in newdeclaration object
    public char charAt(int i) {
        if (i < 0 || i >= this.length) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: " + this.length);
        }
        return this.buffer[i];
    }

    // Method to replace the character at i-th position with c
    public void setCharAt(int i, char c) {
        if (i < 0 || i >= this.length) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Length: " + this.length);
        }
        this.buffer[i] = c;
    }

    // Method to return the length of the string in newdeclaration object
    public int length() {
        return this.length;
    }

    // Method to return the capacity of the buffer
    public int capacity() {
        return this.capacity;
    }

    // Method to return the content of the buffer as a String
    public String toString() {
        return new String(this.buffer, 0, this.length);
    }
}
