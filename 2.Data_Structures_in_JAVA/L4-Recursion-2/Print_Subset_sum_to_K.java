// Given an array A and an integer K, print all subsets of A which sum to K.
// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
// Note : The order of subsets are not important. Just print them in different lines.
// Input format :
// Line 1 : Size of input array
// Line 2 : Array elements separated by space
// Line 3 : K 
// Sample Input:
// 9 
// 5 12 3 17 1 18 15 3 17 
// 6
// Sample Output:
// 3 3
// 5 1

public class solution {
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        printSubsetsToK(input, 0, input.length-1, k, new int[0]);
		
	}
    public static void printSubsetsToK(int[] arr,int start,int end,int k,int[] output) {
		if(start>end) {
			if(k==0) {
				//valid pair
				for(int i : output) {
					System.out.print(i+" ");
				}
				System.out.println();
				return ;
			}else {
				return ;
			}
		}
		int[] temp = new int[output.length+1];
		for(int i=0;i<output.length;i++) {
			temp[i]=output[i];
		}
		temp[temp.length-1]=arr[start];
		printSubsetsToK(arr, start+1, end, k-arr[start],temp);
		printSubsetsToK(arr, start+1, end, k, output);
	}
}
