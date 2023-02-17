/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class stock_market
{
	public static void main(String[] args) {
	    int sum = 0;
	    int finalSum = 0;
	    int thirdSum = 0;
		int[] arr = {7,6,4,3,1};
		for(int i=0;i<arr.length;i++){
		    for(int j=i;j<arr.length;j++){
		        sum = arr[j]-arr[i];
		        if(finalSum < sum){
		            finalSum = sum;
		        }
		    }
		    if(thirdSum < finalSum){
		        thirdSum = finalSum;
		    }
		}
		System.out.print(thirdSum);
	}
}
