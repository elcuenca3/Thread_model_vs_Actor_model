package threads;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadedPrimes {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        Result primes = new Result();

        Runnable generatorTask = new PrimeGenerator(primes);
        List<Thread> threads = new ArrayList<>();

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 20; i++) {
            Thread t = new Thread(generatorTask);
            threads.add(t);
            t.start();

        }

        for (Thread thread : threads) {
            thread.join();
        }

        Long endTime = System.currentTimeMillis();

        System.out.println("Time Taken: " + (endTime - startTime) + " ms.");

    }

}