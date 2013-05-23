package problems;

public class Problem_14 {
    public static void main(String[] args) {
        int chainLength;
        int maxChain = 0;
        int MaxNum = 0;
        for (int i = 2; i < 1000000; i++) {
            long a = i;
            int count = 0;
            while (a != 1) {
                if (a % 2 == 0) {
                    a = a / 2;
                } else {
                    a = 3 * a + 1;
                }
                count++;
            }
            chainLength = count;
            if (chainLength > maxChain) {
                maxChain = chainLength;
                MaxNum = i;
            }
        }
        System.out.println(MaxNum + " " + maxChain);
    }
}
