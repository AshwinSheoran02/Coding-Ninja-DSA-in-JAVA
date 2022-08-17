// Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.
//  Note:
// Change in the input array/list itself. You don't need to return or print the elements.
//  Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// For each test case, print the elements of the array/list in sorted order separated by a single space.

// Output for every test case will be printed in a separate line.


public class Solution {  

    public static void insertionSort(int[] arr) {
    	//Your code goes here
        int l = arr.length;
        for (int i = 1  ; i < l ; i++){
            int temp = arr[i];
            int j = i-1;
            while ((j >=0) && (temp < arr[j])  ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

}