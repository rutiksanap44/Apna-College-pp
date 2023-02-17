/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int evenSum = 0;
		int oddSum = 0;
		int n;
		int choice;
		System.out.println("Enter the Integers");
		do{
		    n = s.nextInt();
		    if(n%2==0){
		        evenSum+=n;
		    }
		    else{
		        oddSum+=n;
		    }
		    System.out.println("If you want to continue then press 1 and if not then press any other number");
		    choice = s.nextInt();
		} while(choice==1);
		System.out.println("Sum of Odd Integers : "+oddSum);
		System.out.println("Sum of Even Integers : "+evenSum);
	}
}
