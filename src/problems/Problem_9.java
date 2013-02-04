package problems;

public class Problem_9 {
    public static void main(String[] args) {

        int a1 = 0, b1 = 0, c1 = 0;
        breakFor:
        for (int i = 1; i < 998; i++) {
            for (int j = 1; j < 998; j++) {
                for (int k = 1; k < 998; k++) {
                    if (i + j + k == 1000 && Math.pow(k, 2) == Math.pow(i, 2) + Math.pow(j, 2)) {
                        a1 = i;
                        b1 = j;
                        c1 = k;
                        break breakFor;
                    }
                }
            }
        }
        System.out.println("a = " + a1 + "; " + "b = " + b1 + "; c = " + c1);

        System.out.println(a1 * b1 * c1);
    }
}
