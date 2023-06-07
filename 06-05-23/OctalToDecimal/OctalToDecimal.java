public class OctalToDecimal {

    public static void main(String[] args) {
        //* FIXED: fix this, should output 3596
        System.out.println(convertOctalToDecimal("7014", 8)); // 3596

        // 37 with a base of 8 = 31
        System.out.println(convertOctalToDecimal("37", 8)); // 31

        // 137 with a base of 10 = 137
        System.out.println(convertOctalToDecimal("137", 10));
    }

    public static int convertOctalToDecimal(String octalString, int octalBaseNumber) {
        int powerNum = 0;
        int resultOctal = 0;

        for (int i = octalString.length() - 1; i >= 0; i--) {
            resultOctal += Character.getNumericValue(octalString.charAt(i)) * Math.pow(octalBaseNumber, powerNum);
            powerNum++;
        }

        return resultOctal;

    }

}