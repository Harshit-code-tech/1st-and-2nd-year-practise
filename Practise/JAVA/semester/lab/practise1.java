package semester.lab;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class practise1 {
    private Queue<Integer> queue;
    private int size;


    public practise1(int size) {
        this.size = size;
        this.queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }


    public boolean isFull() {
        return queue.size() == size;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            queue.add(item);
            System.out.println(item + " enqueued to the queue.");
        }
    }


    public int dequeue() {
        int item = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            item = queue.poll();
            System.out.println(item + " dequeued from the queue.");
        }
        return item;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int item : queue) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();

        practise1 cq = new practise1(size);
        if(size == 0){
            practise1 cq1 = cq;
        }


        System.out.println("Enter elements to enqueue (0 to stop):");
        int item;
        while ((item = sc.nextInt()) != 0) {
            cq.enqueue(item);
        }


        cq.display();


        cq.dequeue();


        cq.display();


        sc.close();
    }
}
