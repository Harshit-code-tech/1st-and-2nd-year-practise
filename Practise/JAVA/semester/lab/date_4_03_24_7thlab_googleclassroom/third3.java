package semester.lab.date_4_03_24_7thlab_googleclassroom;

public class third3 {
    public static void main(String[] args) {
        long startTime, endTime;
        long time1 = 0, time2 = 0;
        int iterations = 5;

        // For loop 1: Using String concatenation
        for (int j = 0; j < iterations; j++) {
            startTime = System.currentTimeMillis();
            String s = "";
            for (int i = 0; i < 100000; ++i) {
                s = s + "c";
            }
            endTime = System.currentTimeMillis();
            time1 += endTime - startTime;
        }

        // For loop 2: Using StringBuffer
        for (int j = 0; j < iterations; j++) {
            startTime = System.currentTimeMillis();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 100000; ++i) {
                stringBuffer.append("c");
            }
            endTime = System.currentTimeMillis();
            time2 += endTime - startTime;
        }

        System.out.println("Average time taken for String concatenation (milliseconds): " + time1 / iterations);
        System.out.println("Average time taken for StringBuffer (milliseconds): " + time2 / iterations);
    }
}
