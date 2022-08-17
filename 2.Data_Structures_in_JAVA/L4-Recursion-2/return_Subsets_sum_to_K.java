// Given an array A of size n and an integer K, return all subsets of A which sum to K.
// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
// Note : The order of subsets are not important.
// Input format :
// Line 1 : Integer n, Size of input array
// Line 2 : Array elements separated by space
// Line 3 : K 
// Constraints :
// 1 <= n <= 20
// Sample Input :
// 9 
// 5 12 3 17 1 18 15 3 17 
// 6
// Sample Output :
// 3 3
// 5 1


public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        return subsetsToK(input,0,input.length-1,k);

	}
    public static int[][] subsetsToK(int[] arr,int start,int end,int k) {

		if(start>end) {
			if(k==0) {
				return new int[1][0];
			}else {
				return new int[0][0];
			}
		}
		int[][] smallAns1=subsetsToK(arr, start+1, end, k-arr[start]);
		int[][] smallAns2=subsetsToK(arr, start+1, end, k);
		int[][] ans=new int[smallAns1.length + smallAns2.length][];
		for(int i=0;i<smallAns1.length;i++) {
			ans[i]=new int[smallAns1[i].length + 1];
			ans[i][0]=arr[start];
			for(int j=0;j<smallAns1[i].length;j++) {
				ans[i][j+1]=smallAns1[i][j];
			}
			
		}
		for(int i=0;i<smallAns2.length;i++) {
			ans[i + smallAns1.length]=new int[smallAns2[i].length];
			for(int j=0;j<smallAns2[i].length;j++) {
				ans[i + smallAns1.length][j]=smallAns2[i][j];
			}
		}
		return ans;
	}
}
