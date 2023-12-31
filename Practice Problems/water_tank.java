/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class water_tank
{
	public static void main(String1[] args) {
	    int sum = 0;
	    int finalSum = 0;
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		for(int i=0;i<arr.length;i++){
		    for(int j=i;j<arr.length;j++){
		        if(arr[i] == arr[j]){
		            sum += arr[i];
		        }
		    }
		    if(sum > finalSum){
		        finalSum = sum;
		    }
		    sum = 0;
		}
		System.out.print(finalSum);
	}
}
