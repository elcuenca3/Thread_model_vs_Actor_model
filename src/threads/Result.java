package threads;

import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;

public class Result {

    private SortedSet<BigInteger> primes;

    public Result() {
        this.primes = new TreeSet<BigInteger>();

    }

    public SortedSet<BigInteger> getPrimes() {
        return primes;
    }

}
