package problems;

import java.math.BigInteger;

public class Problem_16 {
    public static void main(String[] args) {
        BigInteger integer = BigInteger.valueOf(2);
        String s = integer.pow(1000).toString();

        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            result += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        System.out.println(result);
    }
}
