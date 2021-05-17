package threads;

import java.math.BigInteger;
import java.util.Random;

public class PrimeGenerator implements Runnable {

    private Result primes;

    public PrimeGenerator(Result primes) {
        this.primes = primes;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In PrimeGenerator Task");
        BigInteger bigInt = new BigInteger(2000, new Random());
        System.out.println(bigInt);
        BigInteger nextProbablePrime = bigInt.nextProbablePrime();
        System.out.println(nextProbablePrime);
        primes.getPrimes().add(nextProbablePrime);
    }

}