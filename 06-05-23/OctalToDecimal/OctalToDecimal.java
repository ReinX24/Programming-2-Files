public class OctalToDecimal {

    public static void main(String[] args) {
        // TODO: fix this, should output 3596
        System.out.println(convertOctalToDecimal("7014", 8)); // 3596
    }

    public static int convertOctalToDecimal(String octalString, int octalBaseNumber) {
        int powerNum = 0;
        int resultOctal = 0;

        for (int i = octalString.length() - 1; i >= 0; i--) {
            resultOctal += Math.pow(Character.getNumericValue(octalString.charAt(i)) * octalBaseNumber, powerNum);
            powerNum++;
        }

        return resultOctal;

    }

}