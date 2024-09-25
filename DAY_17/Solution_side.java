package DAY_17;

import java.math.BigInteger;

class Solution {
    public String addBinary(String a1, String a2) {
        BigInteger a = new BigInteger(a1, 2);
        BigInteger b = new BigInteger(a2, 2);
        // Add the two BigInteger values
        BigInteger sum = a.add(b);
        // Convert the sum back to a binary string
        return sum.toString(2);
    }
}
