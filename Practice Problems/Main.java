/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    int temp = n;
    int factorial = 1;
    while (temp > 1)
      {
	factorial *= temp;
	temp--;
      }
    System.out.print ("Factorial of the number " + n + " is : " + factorial);
  }
}
