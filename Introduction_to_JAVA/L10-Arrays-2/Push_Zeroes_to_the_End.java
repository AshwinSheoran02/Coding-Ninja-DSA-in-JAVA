// You have been given a random integer array/list(ARR) of size N. You have been required to push all the zeros that are present in the array/list to the end of it. Also, make sure to maintain the relative order of the non-zero elements.
// Note:
// Change in the input array/list itself. You don't need to return or print the elements.

// You need to do this in one scan of array only. Don't use extra space.


// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the elements of the array/list in the desired order separated by a single space.

// Output for every test case will be printed in a separate line.

public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int l = arr.length;
        int z  = 0;
        int k = 0;
        while (k<l){
        for (int i = 0 ; i < l-1 ; i++){
            if (arr[i]==0){
                z++;
                arr[i]=arr[i+1];
                arr[i+1]=0;
            }
        }
            k++;
    }
        
    }

}