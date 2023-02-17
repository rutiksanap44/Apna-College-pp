/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class mult_table
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    for(int i=1;i<=10;i++){
        int multCount = n*i;
        System.out.println(n+" * "+" "+i+" = "+multCount);
    }
  }
}
