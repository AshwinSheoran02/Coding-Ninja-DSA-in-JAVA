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
    
    private static int pairSum(int arr[], int startIndex, int endIndex, int num){
        int numPair = 0;
        while(startIndex < endIndex){
            if (arr[startIndex] + arr[endIndex] < num) {
                // move from left to right, increase start
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                // move from right to left, decrease end
                endIndex--;
            } else 
            {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];
                // to check for {2,2,2,2,2} all elements same condition
                if (elementAtStart == elementAtEnd) {
                    int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += ((totalElementFromStartToEnd) * (totalElementFromStartToEnd - 1)) / 2;
                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;
                // to check for index of same elements from start/left
                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
                    tempStartIndex++;
                }
                // to check for index of same elements from end/right
                while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex--;
                }
                // count no of same elements from start
                int totalElementFromStart = tempStartIndex - startIndex;
                // count no of same elements from end
                int totalElementFromEnd = endIndex - tempEndIndex;
                // count no. of total num pairs n*m
                numPair += (totalElementFromEnd * totalElementFromStart);
                // adjust start and end
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;

            }
        }
        return numPair;
    }
    

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr); //nlogn
        int n = arr.length;
        int numTriplets = 0;
        for(int i=0;i<arr.length;i++){
            int pairSumFor = num - arr[i];
            int numPairs = pairSum(arr, (i+1), (n-1), pairSumFor);
            numTriplets += numPairs;
        }
        return numTriplets;
	}
    
}