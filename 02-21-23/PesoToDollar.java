import java.util.Scanner;

public class PesoToDollar {

   public static void main(String[] args) {
      // Creating a Scanner object to accept user input
      Scanner userInput = new Scanner(System.in);
      // Ask the user for a number of pesos
      System.out.print("Enter Amount of Pesos (P) : ");
      int pesoAmount = userInput.nextInt();
      // Convert the peso to dollars
      float dollarAmount = pesoAmount * 0.018f;
      // Print the conversion from peso to dollar
      System.out.printf("P%d : $%.2f\n", pesoAmount, dollarAmount);
      // Closing our Scanner object
      userInput.close();
   }

}