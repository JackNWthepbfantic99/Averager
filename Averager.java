/**
*
* Reads in scores until a negative value is encountered, at which point it determines and prints the average
*
* @author <Jack Navin-Weinstein>
* @version <Thursday,16 October>
*
*/
import java.util.Scanner;

public class Averager {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
      double numTest = 0.0;
      double totalTest = 0.0;
      System.out.println("Enter number you would like to be averged, when finished enter value -5.");
      double addTest = s.nextDouble();
      while (addTest != -5) { // while addTest does NOT have the value of -5
      totalTest = totalTest + addTest;
      numTest = numTest + 1;
      System.out.println("Enter another number or -5 to exit");
      addTest = s.nextDouble();
      }
      System.out.println("Average of Numbers: " + totalTest / numTest);
   }
}      
      