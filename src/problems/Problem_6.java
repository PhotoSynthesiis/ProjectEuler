package problems;

public class Problem_6 {
    public static void main(String[] args) {
        long sumOfSquareOfFirst100Numbers = sumOfSquareOfFirst100Numbers();
        System.out.println(sumOfSquareOfFirst100Numbers);

        long squareOfSumOfFirst100Numbers = squareOfSumOfFirst100Numbers();
        System.out.println(squareOfSumOfFirst100Numbers);

        System.out.println(squareOfSumOfFirst100Numbers - sumOfSquareOfFirst100Numbers);
    }

    private static long squareOfSumOfFirst100Numbers() {
        int total = 0;
        for (int i = 1; i < 101; i++) {
            total += i;
        }
        return (long) Math.pow(total, 2);
    }

    private static long sumOfSquareOfFirst100Numbers() {
        int total = 0;
        for (int i = 1; i < 101; i++) {
            total += (int) Math.pow(i, 2);
        }
        return total;
    }
}
