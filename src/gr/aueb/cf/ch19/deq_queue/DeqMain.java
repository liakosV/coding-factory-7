package gr.aueb.cf.ch19.deq_queue;

public class DeqMain {

    public static void main(String[] args) {
        MyQueue<String> strQueue = new MyQueue<>();

        strQueue.enQueue("ABC12343");
        strQueue.enQueue("ZIO90129");
        strQueue.enQueue("DFO02012");


        String firstOut = strQueue.deQueue();
        System.out.println(firstOut);
        System.out.println();

        strQueue.forEach(System.out::println);
    }
}
