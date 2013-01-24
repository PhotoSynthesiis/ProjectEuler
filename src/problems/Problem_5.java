package problems;

public class Problem_5 {
    public static void main(String[] args) {
        long numberGroup[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        long maxCommonFactor;
        long test = numberGroup[0];
        for (int i = 1; i < numberGroup.length; i++) {
            System.out.println("------------------------------");
            maxCommonFactor = calculateMaxCommonFactor(test, numberGroup[i]);
            test = (test * numberGroup[i]) / maxCommonFactor;
            System.out.println("result : " + test);
        }
    }

    private static long calculateMaxCommonFactor(long number1, long number2) {
        System.out.println("number1 : " + number1);
        System.out.println("number2 : " + number2);
        long reminder;
        if (number1 > number2)
            reminder = calculateMaxFactorOfTwoNumbers(number1, number2);
        else
            reminder = calculateMaxFactorOfTwoNumbers(number2, number1);
        return reminder;
    }

    private static long calculateMaxFactorOfTwoNumbers(long number1, long number2) {
        long reminder;
        boolean stopFlag = false;

        while (!stopFlag) {
            reminder = number1 % number2;
            if (reminder == 0) {
                stopFlag = true;
            } else {
                number1 = number2;
                number2 = reminder;
            }
        }
        return number2;
    }
}
