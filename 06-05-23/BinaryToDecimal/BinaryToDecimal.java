public class BinaryToDecimal {

    public static void main(String[] args) {

        // Binary number of 10 to decimal
        System.out.println(convertBinaryToDecimal("1010"));

        // Binary number of 42 to decimal
        System.out.println(convertBinaryToDecimal("101010"));

        // Binary number of 28 to decimal
        System.out.println(convertBinaryToDecimal("11100"));

        // Using our practice method
        System.out.println(practiceConvertBinaryToDecimal("1010")); // 10

        System.out.println(practiceConvertBinaryToDecimal("101010")); // 42

        System.out.println(practiceConvertBinaryToDecimal("11100")); // 28
    }

    public static int convertBinaryToDecimal(String binaryString) {
        int conversionNum = 1;
        int resultDecimal = 0;

        // Iterating through our binaryString, starting from the end
        for (int i = 1; i <= binaryString.length(); i++) {
            // If the current iterated char is equal to 1
            if (binaryString.charAt(binaryString.length() - i) == '1') {
                resultDecimal += conversionNum; // add conversionNum to resultDecimal
            }
            conversionNum *= 2; // multiply conversionNum by 2
        }
        return resultDecimal;
    }

    // Practicing creating a binary to decimal conveter
    public static int practiceConvertBinaryToDecimal(String binaryString) {
        int conversionNum = 1;
        int resultDecimal = 0; // where we will store our result
        
        // start iterating the binaryString from the end
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') { // if current iterated char is equal to 1
                resultDecimal += conversionNum;
            }
            conversionNum *= 2; // multiply conversionNum by 2 with every iteration
        }

        return resultDecimal;
    }

}