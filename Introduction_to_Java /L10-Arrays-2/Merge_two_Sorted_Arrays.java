// You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements of the first array/list.

// Third line contains an integer 'M' representing the size of the second array/list.

// Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output Format :
// For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

// Output for every test case will be printed in a separate line.


public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int i = 0 ;
        int j = 0;
        int k =0;
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr = new int[l1+l2];
        while ( (i!=l1) && (j!=l2) ){
            if (arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }
             else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<l1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<l2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        
        return arr;
        
    }

}