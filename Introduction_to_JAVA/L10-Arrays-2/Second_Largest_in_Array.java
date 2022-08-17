// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
// If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains an integer 'N' representing the size of the array/list.

// The second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the second largest in the array/list if exists, -2147483648 otherwise.

// Output for every test case will be printed in a separate line.

public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int largest = -2147483648;
        int second =  -2147483648;
        int l = arr.length;
        int count = 0;
        for (int i = 0 ; i < l ; i ++){
            if (arr[i]> largest){
                int temp = largest;
                largest = arr[i];
                count++;
                second  = temp ;
                
            }
            if (arr[i]< largest){
                if (second < arr[i]){
                    second = arr[i];
                }
            }
        }
        return second;
    }

}