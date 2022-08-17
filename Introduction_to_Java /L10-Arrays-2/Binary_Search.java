// You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.
// Input format :
// The first line contains an Integer 'N' which denotes the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow..

// All the 't' lines henceforth, will take the value of X to be searched for in the array/list.
// Output Format :
// For each test case, print the index at which X is present, -1 otherwise.

// Output for every test case will be printed in a separate line.


public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int l = arr.length;
        int start = 0;
        int end = l-1;
        int mid = (l-1)/2;
        int ans = -1;
        while(start<=end   ){
            if (x>arr[mid] ){
                start = mid+1;
            }
            if (arr[mid]>x){
                end = mid-1;
            }
            if(arr[mid]==x){
                ans = mid;
                break;
            }
            mid = (end  + start)/2;
            //System.out.println(start +" "+end);
        }
        return(ans);
        
        
    }

}