// You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
// Note:
// Given array/list can contain duplicate elements. 
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains an integer 'num'.
// Output format :
// For each test case, print the total number of pairs present in the array/list.

// Output for every test case will be printed in a separate line.

public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        int l = arr.length;
        int count = 0;
        for (int i = 0 ; i < l ; i++ ){
            for (int j = i ; j < l ; j ++){
                if ( i!=j){
                if (arr[i]+arr[j] ==num ){
                    count ++;
                    // System.out.println(i+" "+j);
                }
                }
            }
        }
        return count;
        
        
	}
}