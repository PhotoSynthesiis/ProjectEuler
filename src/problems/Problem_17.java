package problems;

public class Problem_17 {
    // 1...10
    private static final String one = "one";
    private static final String two = "two";
    private static final String three = "three";
    private static final String four = "four";
    private static final String five = "five";
    private static final String six = "six";
    private static final String seven = "seven";
    private static final String eight = "eight";
    private static final String nine = "nine";
    private static final String ten = "ten";

    // 11...19
    private static final String eleven = "eleven";
    private static final String twelve = "twelve";
    private static final String thirteen = "thirteen";
    private static final String fourteen = "fourteen";
    private static final String fifteen = "fifteen";
    private static final String sixteen = "sixteen";
    private static final String seventeen = "seventeen";
    private static final String eighteen = "eighteen";
    private static final String nineteen = "nineteen";

    // 20...90
    private static final String twenty = "twenty";
    private static final String thirty = "thirty";
    private static final String forty = "forty";
    private static final String fifty = "fifty";
    private static final String sixty = "sixty";
    private static final String seventy = "seventy";
    private static final String eighty = "eighty";
    private static final String ninety = "ninety";

    // hundred
    private static final String hundred = "hundred";

    public static void main(String[] args) {
        String unitInString = "";
        String tensInString = "";
        String hundredInString = "";
        String stringForAllNumbers = "";
        for (int number = 1; number < 1000; number++) {
            if (number / 100 > 0) {
                if ((number / 10) % 10 != 1) {
                    unitInString = unitInString(number % 10);
                }
                tensInString = tensInString(number);
                hundredInString = unitInString(number / 100) + hundred;
            } else if (number / 10 > 0 && number / 100 == 0) {
                if (number < 20) {
                    tensInString = handleNumberFrom10To19(number);
                } else {
                    unitInString = unitInString(number % 10);
                    tensInString = tensInString(number);
                }
            } else if (number / 10 == 0) {
                unitInString = unitInString(number % 10);
            }

            if (!hundredInString.equals("") && (!tensInString.equals("") || !unitInString.equals(""))) {
                hundredInString += "and";
            }
            stringForAllNumbers += hundredInString + tensInString + unitInString;

            hundredInString = "";
            tensInString = "";
            unitInString = "";
        }

        stringForAllNumbers += "onethousand";
        System.out.println(stringForAllNumbers.length());
    }

    private static String handleNumberFrom10To19(int number) {
        String tensInString = "";
        if (number == 10) {
            tensInString = ten;
        } else if (number == 11) {
            tensInString = eleven;
        } else if (number == 12) {
            tensInString = twelve;
        } else if (number == 13) {
            tensInString = thirteen;
        } else if (number == 14) {
            tensInString = fourteen;
        } else if (number == 15) {
            tensInString = fifteen;
        } else if (number == 16) {
            tensInString = sixteen;
        } else if (number == 17) {
            tensInString = seventeen;
        } else if (number == 18) {
            tensInString = eighteen;
        } else if (number == 19) {
            tensInString = nineteen;
        }
        return tensInString;
    }

    private static String tensInString(int number) {
        int tensInInt;
        if (number < 100) {
            tensInInt = number / 10;
        } else {
            tensInInt = (number - (number / 100) * 100) / 10;
        }

        String tensInString = "";

        if (tensInInt == 1) {
            tensInString = handleNumberFrom10To19(number - (number / 100) * 100);
        }

        if (tensInInt == 2) {
            tensInString += twenty;
        } else if (tensInInt == 3) {
            tensInString += thirty;
        } else if (tensInInt == 4) {
            tensInString += forty;
        } else if (tensInInt == 5) {
            tensInString += fifty;
        } else if (tensInInt == 6) {
            tensInString += sixty;
        } else if (tensInInt == 7) {
            tensInString += seventy;
        } else if (tensInInt == 8) {
            tensInString += eighty;
        } else if (tensInInt == 9) {
            tensInString += ninety;
        }

        return tensInString;
    }

    private static String unitInString(int number) {
        String unitInString = "";
        if (number == 1) {
            unitInString = one;
        } else if (number == 2) {
            unitInString += two;
        } else if (number == 3) {
            unitInString += three;
        } else if (number == 4) {
            unitInString += four;
        } else if (number == 5) {
            unitInString += five;
        } else if (number == 6) {
            unitInString += six;
        } else if (number == 7) {
            unitInString += seven;
        } else if (number == 8) {
            unitInString += eight;
        } else if (number == 9) {
            unitInString += nine;
        }

        return unitInString;
    }
}