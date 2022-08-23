// You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
// Note :
// Given array/list can contain duplicate elements.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains an integer 'X'.
// Output format :
// For each test case, print the total number of triplets present in the array/list.

// Output for every test case will be printed in a separate line.

import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
         Arrays.sort(arr);
        int n = arr.length;
        
        int numTriplets = 0;
        
        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;
            
            int start = i + 1;
            int stop = n - 1;
             
             while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                   if (arr[start] == arr[stop]) {
                       int totalCount = (stop - start) + 1;
                       numPairs += (totalCount * (totalCount - 1) / 2);
                       break;
                   }
                    
                    int tempI = start + 1;
                    int tempJ = stop - 1;
                    
                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }
                    
                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }
                    
                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;
                    
            		numPairs += (totalElementFromStart * totalElementFromEnd);
                    
                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
	}
}