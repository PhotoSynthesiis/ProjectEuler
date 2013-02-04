package problems;

public class Problem_10 {
    public static void main(String[] args) {
        boolean isPrime = true;
        long total = 2;

        int thePrime = 3;
        double upperLimit;

        while (thePrime < 2000000) {
            upperLimit = Math.sqrt(thePrime);

            for (int i = 3; i <= upperLimit; i++) {
                if (thePrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                total += thePrime;
            }

            isPrime = true;
            thePrime += 2;
        }
        System.out.println(total);
    }
}
