package saturday._14_01_2023.syncCollection;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        Thread producer = new Thread(()-> {
            String[] words
                    = {"Svitlana", "Dmitry", "Olga", "Alexandr", "Natalia", "Denys", "Mikhail"};

            for (int i = 0; i < words.length && !Thread.interrupted(); i++) {
                try {
                    Thread.sleep(1000);
                    queue.put(words[i]);
                    System.out.println("Producer put into the queue: [" + words[i]
                    + "] elements number is: //" + queue.size() + "//");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(()-> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(5000);
                    sb.append(queue.take());
                    System.out.println("Consumer has got the word: ((" + sb.reverse()
                            + ")) elements number is: //" + queue.size() + "//");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        consumer.start();
    }
}