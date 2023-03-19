package praktika;

import java.math.BigInteger;
import java.util.Objects;

public class Power {

    // Function to calculate a^b
    static int power(int a, int b)
    {
        if (b == 0) {
            return 1;
        }
        else if (b % 2 == 0) {
            System.out.println(a + " " + b);
            return power(a * a, b / 2);
        }
        else {
            System.out.println(a + " " + b);
            return a * power(a * a, b / 2);
        }
    }
    public static BigInteger pow(int base, int exponent) {
        BigInteger result = BigInteger.ONE;
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                result = result.multiply(BigInteger.valueOf(base));

            }
            exponent >>= 1;
            base *= base;
        }
        return result;
    }

    // Driver Program
    public static void main(String[] args)
    {
        int a = 2;
        int b = -10;

        System.out.println("Result = " + power(a, b));
//        System.out.println("Result = " + pow(a, b));
    }
}
