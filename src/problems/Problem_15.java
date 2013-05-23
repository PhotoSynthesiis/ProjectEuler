package problems;

public class Problem_15 {
    public static void main(String[] args) {
        long[][] paths = new long[21][21];

        // initialize the boundries
        for (int i = 0; i < 20; i++) {
            paths[i][20] = 1;
            paths[20][i] = 1;
        }

        for (int i = 19; i >= 0; i--) {
            for (int j = 19; j >= 0; j--) {
                paths[i][j] = paths[i + 1][j] + paths[i][j + 1];
            }
        }

        System.out.println(paths[0][0]);
    }
}
