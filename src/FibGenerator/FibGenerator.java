package FibGenerator;

import java.math.BigInteger;
import java.util.Iterator;

public class FibGenerator {
    static void main() {
        Iterator<BigInteger> iterator = getIterator(1, 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(iterator.next());
        }
    }
    public static Iterator<BigInteger> getIterator(int n1, int n2) {

        return new Iterator<BigInteger>() {
            boolean firstCall = true;
            final BigInteger[] numbers = new BigInteger[]{BigInteger.valueOf(n1), BigInteger.valueOf(n2)};

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public BigInteger next() {
                BigInteger nextValue = numbers[0].add(numbers[1]);
                if (firstCall) {
                    firstCall = false;
                    return numbers[0];
                }

                numbers[0] = numbers[1];
                numbers[1] = nextValue;
                return numbers[0];
            }
        };
    }
}
