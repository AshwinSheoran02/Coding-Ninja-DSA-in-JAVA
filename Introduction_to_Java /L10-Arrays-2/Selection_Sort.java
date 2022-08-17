// Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
//  Note:
// Change in the input array/list itself. You don't need to return or print the elements.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output format :
// For each test case, print the elements of the array/list in sorted order separated by a single space.

// Output for every test case will be printed in a separate line.


public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int l = arr.length;
        for (int i = 0 ; i<l ; i++){
            int min = 999999;
            int ind = 0;
            for (int j = i ; j < l ; j++){
                if (arr[j]< min){
                    min = arr[j];
                    ind = j;
                }
                
            }
            
            arr[ind] = arr[i];
            arr[i ] = min;
            
        }
        
    }   

}