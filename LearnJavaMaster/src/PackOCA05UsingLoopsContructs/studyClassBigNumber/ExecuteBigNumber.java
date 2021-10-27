package PackOCA05UsingLoopsContructs.studyClassBigNumber;

import java.math.BigInteger;

public class ExecuteBigNumber {
    public static void main(String[] args) {
        BigInteger a1 = BigInteger.valueOf(100);
        BigInteger veryBig  = new BigInteger("43524321436521629420445529776472346236482345235476325432746237462346867234");
        System.out.println(a1);
        System.out.println(veryBig);

        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = BigInteger.valueOf(10);
        BigInteger c = a.add(b); // c = a + b
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); // d = c * (b + 2)
        System.out.println(d);
    }
}
