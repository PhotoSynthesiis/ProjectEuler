package problems;

public class Problem_12 {
    static int theNthTriangleNumber = 1;

    public static void main(String[] args) {
        boolean shouldBreak = false;
        int theFinalNumber = 0;

        while (!shouldBreak) {
            int theNumber = getTheNthTriangleNumber();
            int numberOfFactors = getNumberOfFactors(theNumber);
            if (numberOfFactors > 500) {
                shouldBreak = true;
                theFinalNumber = theNumber;
            }
        }

        System.out.println(theFinalNumber);
    }

    private static int getNumberOfFactors(int theNumber) {
        int numberOfFactors = 2;
        for (int i = 2; i <= Math.sqrt(theNumber); i++) {       // 两边对称
            if (theNumber % i == 0) {
                numberOfFactors += 2;
            }
        }
        return numberOfFactors;
    }

    private static int getTheNthTriangleNumber() {
        int number = 0;

        for (int i = 0; i <= theNthTriangleNumber; i++) {
            number += i;
        }

        theNthTriangleNumber++;

        return number;
    }
}
