package problems;

public class Problem_2 {
    public static void main(String args[]) {
        int i1 = 1, i2 = 2;

        int temp1 = i1 + i2, temp2 = i2, temp3;
        int total = 2;
           //1 2 3 5 8 13 21
        while (temp1 < 4000000) {
            temp3 = temp1;
            temp1 = temp1 + temp2;
            temp2 = temp3;

            if(temp1 % 2 == 0) {
                total += temp1;
            }
        }

        System.out.println(total);
    }
}
