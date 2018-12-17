package DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("NY");
        queue.add("NJ");
        queue.add("VA");

        System.out.println("Peek as of now: " + queue.peek());
        if(queue.peek().equalsIgnoreCase("NY")) {
            System.out.println("First Remove: " + queue.remove());
        }

        System.out.println("Peek as of now: " + queue.peek());

    }
}
