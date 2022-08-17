// Given an integer array (of length n), find and print all the subsets of input array.
// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
// Note : The order of subsets are not important. Just print the subsets in different lines.
// Input format :
// Line 1 : Integer n, Size of array
// Line 2 : Array elements (separated by space)
// Constraints :
// 1 <= n <= 15
// Sample Input:
// 3
// 15 20 12
// Sample Output:
// [] (this just represents an empty array, don't worry about the square brackets)
// 12 
// 20 
// 20 12 
// 15 
// 15 12 
// 15 20 
// 15 20 12 

public class solution {
	public static void printSubsets(int input[]) {
		// Write your code here
        		printSubsets(input,0,input.length-1,new int[0]);


	}
    public static void printSubsets(int[] arr,int start,int end,int[] output) {
		
		if(start>end) {
			for(int i  : output) {
				System.out.print(i+" ");
			}
			System.out.println();
			return ;
		}
		int[] temp=new int[output.length + 1];
	
		for(int i=0;i<output.length;i++) {
			temp[i]=output[i];
		}
		temp[temp.length-1]=arr[start];
				
		printSubsets(arr, start+1, end, temp);
		printSubsets(arr, start+1, end, output);

	}
}
