package problems;

public class Problem_4 {
    public static void main(String[] args) {
        int innerResult = 0;
        int shiwan, wan, qian, bai, shi, ge;
        int finalResult = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                innerResult = i * j;

                if ((innerResult / 100000) >= 1) {

                    shiwan = innerResult / 100000;
                    ge = innerResult % 10;

                    wan = (innerResult % 100000) / 10000;
                    shi = (innerResult % 100) / 10;

                    qian = (innerResult % 10000) / 1000;
                    bai = (innerResult % 1000) / 100;

                    if ((shiwan == ge) && (wan == shi) && (qian == bai) && (innerResult > finalResult)) {
                        finalResult = innerResult;
                    }
                } else {
                    ge = innerResult % 10;
                    wan = innerResult / 10000;

                    shi = (innerResult % 100) / 10;
                    qian = (innerResult % 10000) / 1000;
                    if ((wan == ge) && (qian == shi) && (innerResult > finalResult)) {
                        finalResult = innerResult;
                    }
                }
            }
        }
        System.out.println(finalResult);
    }
}
