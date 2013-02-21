package problems;

public class test {
    public static void main(String[] args) {
        String a = "371072875312346376937673418348422520464";
        Integer convertedInteger[][] = new Integer[3][13];
        convertStringToInteger(a, convertedInteger);
        int sumOfOneColumn, carryBitOfOneColumn = 0, remainOfOneColumn = 0;
//        3710728753123
//        4637693767341
//        8348422520464
//        16696845040928
        int[] temp = new int[52];
        for (int i = convertedInteger[1].length; i > 0; i--) {
            temp[i + 1] = convertedInteger[0][i - 1];
        }

        int sumOfFirstTwo;

        for (int i = 0; i < convertedInteger.length - 1; i++) {
            for (int j = convertedInteger[1].length - 1; j >= 0; j--) {
                sumOfOneColumn = temp[j + 2] + convertedInteger[i + 1][j];
                remainOfOneColumn = sumOfOneColumn;
                carryBitOfOneColumn = 0;
                System.out.println(temp[j + 2] + " : " + convertedInteger[i + 1][j]);

                if (sumOfOneColumn > 9) {
                    carryBitOfOneColumn = 1;
                    remainOfOneColumn = sumOfOneColumn - 10;
                }
                temp[j + 2] = remainOfOneColumn;

                sumOfFirstTwo = temp[j + 1] + carryBitOfOneColumn;
                temp[j + 1] += carryBitOfOneColumn;
                if (sumOfFirstTwo > 9) {
                    temp[j + 1] = sumOfFirstTwo - 10;
                    temp[j]++;
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
        }

    }

    private static void convertStringToInteger(String a, Integer[][] convertedInteger) {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 13; j++) {
                convertedInteger[i][j] = Integer.parseInt(String.valueOf(a.charAt(index)));
                index++;
            }
        }
    }
}
