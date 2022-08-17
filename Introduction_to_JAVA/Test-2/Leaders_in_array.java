// Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
// Print all the leader elements separated by space and in the same order they are present in the input array.
// Input Format :
// Line 1 : Integer n, size of array
// Line 2 : Array A elements (separated by space)
// Output Format :
//  leaders of array (separated by space)

public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        int l = input.length;
        StringBuffer bs =new StringBuffer(""); 
        int high= -100000;
        for (int i = l-1 ; i > 0 ;i--){
            if (input[i] >= high){
                high = input[i];
                bs.append(high);
                bs.append(" ");
            }
        }
        String str = bs.toString();
        String[] arr = str.split(" ");
        for (int i = arr.length -1 ; i >= 0 ; i--){
            System.out.print(arr[i]+" ");
        }
		
	}
	
}
