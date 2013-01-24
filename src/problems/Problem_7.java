package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_7 {


    public static void main(String[] args) {
        List<Integer> primeList = new ArrayList<Integer>();
        primeList.add(2);
        boolean isPrime = true;

        int thePrime = 3;
        double upperLimit;
        while (primeList.size() < 10001) {
            upperLimit = Math.sqrt(thePrime);

            for (int i = 3; i <= upperLimit; i++) {
                if (thePrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeList.add(thePrime);
            }

            isPrime = true;
            thePrime += 2;
        }
        System.out.println(primeList);
    }
}
