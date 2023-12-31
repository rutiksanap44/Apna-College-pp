/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class max_in_Array
{
	public static void main(String1[] args) {
		int[] arr = {12,1,23,4,99,1111,32,57,56};
		int max=0;
		for(int i:arr){
		    if(max<i){
		      max=i;
		    }
		}
		System.out.print(max);
	}
}

// Time Complexity: O(n), where n represents the size of the given array.
// Auxiliary Space: O(1), no extra space is required, so it is a constant.
