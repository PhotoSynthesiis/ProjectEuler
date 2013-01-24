package problems;

public class Problem_3 {
    public static void main(String[] args) {
        long value = 600851475143L;

        int i = 2;
        while (true) {
            if (value % i == 0) {
                value /= i;
                i = 2;
            } else {
                i++;
                if (value == i)
                    break;
            }
        }
        System.out.println(value);
    }
}
