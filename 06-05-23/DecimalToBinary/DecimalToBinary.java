public class DecimalToBinary {

    public static void main(String[] args) {

        System.out.println(convertDecimaltoBinary(10)); // 1010
        System.out.println(convertDecimaltoBinary(21)); // 10101
        System.out.println(convertDecimaltoBinary(31)); // 11111

        // Another way of convertingDecimalToBinary is by using the
        // Integer.toBinaryString method
        System.out.println(Integer.toBinaryString(10)); // 1010
        System.out.println(Integer.toBinaryString(21)); // 10101
        System.out.println(Integer.toBinaryString(31)); // 11111

    }

    public static String convertDecimaltoBinary(int decimalNum) {

        int[] binaryArr = new int[40]; // where we will be storing our binarr number
        int indexNum = 0;
        String binaryResult = "";

        // while decimalNum is greater than 0
        while (decimalNum > 0) {
            // divide decimalNum by 2 and put remainder in binaryArr
            binaryArr[indexNum++] = decimalNum % 2;
            // divide decimalNum by 2
            decimalNum /= 2;
        }

        // iterating though our binaryArr, start from the end
        for (int i = indexNum - 1; i >= 0; i--) {
            binaryResult += String.valueOf(binaryArr[i]);
        }

        return binaryResult;
    }

}